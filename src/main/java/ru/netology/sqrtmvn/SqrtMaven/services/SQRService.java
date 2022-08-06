package ru.netology.sqrtmvn.SqrtMaven.services;

public class SQRService {

    int amount = 0;

    public int calcSqrt(int min, int max) {

        for (int i = 10; i < 99; i++) {
            int i2 = i * i;
            if (i2 >= min) {
                if (i2 <= max) {
                    amount++;
                }
            }

        }
        return amount;
    }

}