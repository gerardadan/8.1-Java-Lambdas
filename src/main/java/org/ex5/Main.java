package org.ex5;

import org.Months;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double v = 3.1415;
        ArithmeticUtils arithmeticUtils = () -> v;

        System.out.println(arithmeticUtils.getPiValue());
    }

    @FunctionalInterface
    public interface ArithmeticUtils {
        double getPiValue();
    }
}