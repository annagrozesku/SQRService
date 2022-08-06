package ru.netology.sqrtmvn.SqrtMaven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.scv")
    public void LimitValues(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
