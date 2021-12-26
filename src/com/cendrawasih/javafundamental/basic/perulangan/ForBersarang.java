package com.cendrawasih.javafundamental.basic.perulangan;

public class ForBersarang {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 5; k++) {
            for (int l = 5; l >= k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a <= 3; a++) {
            for (int b = 3; b > a; b--) {
                System.out.print("-");
            }
            for (int c = 1; c <= 3; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
