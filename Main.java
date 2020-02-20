package com.mentormate;

import java.util.Scanner;

public class Main {


    public static void upperHalf(int n){
            for (int i = 0; i <= n/2 ; i++) {
                for (int o = 0; o < 2; o++) {
                    for (int j = n; j > i; j--) {
                        System.out.print('-');
                    }

                    for (int k = 1; k <= n + 2 * i; k++) {
                        System.out.print('*');
                    }

                    for (int m = n - i; m > i; m--) {
                        System.out.print('-');
                    }

                    for (int k = 1; k <= n + 2 * i; k++) {
                        System.out.print('*');
                    }

                    for (int j = n; j > i; j--) {
                        System.out.print('-');
                    }
                }System.out.println();
            }
    }

    public static void lowerHalf(int n){

            for (int i = n / 2 + 1; i <= n; i++) {
                for (int o = 0; o <2 ; o++) {
                    for (int j = n; j > i; j--) {
                        System.out.print('-');
                    }

                    for (int k = 1; k <= n; k++) {
                        System.out.print('*');
                    }

                    for (int m = n - i; m < i; m++) {
                        System.out.print('-');
                    }

                    for (int k = i - n; k < 2 * n - i; k++) {
                        System.out.print('*');
                    }

                    for (int m = n - i; m < i; m++) {
                        System.out.print('-');
                    }

                    for (int k = 1; k <= n; k++) {
                        System.out.print('*');
                    }

                    for (int j = n; j > i; j--) {
                        System.out.print('-');
                    }
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            upperHalf(n);
            lowerHalf(n);
        } else {
            System.out.println("Please enter odd number between 2 and 10000");
        }

        scanner.close();
    }
}
