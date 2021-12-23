package com.cendrawasih.javafundamental.basic.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println("Tulis nama anda : ");
        String name = scanner.next();
        System.out.println("======================================");
        System.out.println();

        System.out.println("Halo mas "+name);
        System.out.print("Masukan angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : "+result);
    }
}
