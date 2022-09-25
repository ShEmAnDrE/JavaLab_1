package com.company;

import java.util.Scanner;

public class Factorial {

    public static long CalcFactorial(int n) {
        long s = 1;
        if (n < 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                s *= i;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CalcFactorial(n));
    }
}
