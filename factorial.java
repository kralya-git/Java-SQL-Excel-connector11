package com.test.idea;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Факториал числа " + n + " равен " + factorial(n));

        if (n % 2 == 0){
            System.out.println("Чётный факториал числа " + n + " равен " +chet_factorial(n));
        }
        else {
            System.out.println("Нечётный факториал числа " + n + " равен " +nechet_factorial(n));
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int chet_factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }

    public static int nechet_factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }
}