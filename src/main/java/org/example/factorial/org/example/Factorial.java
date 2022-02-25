package org.example.factorial.org.example;

public class Factorial {

    public static int compute(int value) {
        if (value < 0) {
            throw new RuntimeException("Números negativos no válidos");
        }
        if (value == 0) {
            return 1;
        } else {
            return value * compute(value - 1);
        }
    }
}