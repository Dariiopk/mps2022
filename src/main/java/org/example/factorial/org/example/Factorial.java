package org.example.factorial.org.example;

public class Factorial {

    public static int compute(int value){
        int n = 1;
       for (int i = value; i > 0; i--){
           n *= i;
       }
       return n;
    }
}
