package com.smartbankhub.util;

public class CommissionUtil {

    private CommissionUtil() {}

    public static double calculateCommission(double amount) {
        if (amount >= 100000) return amount * 0.02;
        if (amount >= 50000) return amount * 0.015;
        return amount * 0.01;
    }
}
