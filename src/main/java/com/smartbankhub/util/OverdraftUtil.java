package com.smartbankhub.util;

public class OverdraftUtil {

    private OverdraftUtil() {}

    public static double calculateOverdraftLimit(double balance) {
        return balance * 0.5;
    }
}
