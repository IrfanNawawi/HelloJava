package com.cendrawasih.javafundamental.basic.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main (String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;
        String name = "";
        try {
            System.out.print("Masukan nama mu : ");
            name = bufferedReader.readLine();
            System.out.print("Masukan angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan angka pertama : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("===========================");
        System.out.println();
        System.out.println("Hai " +name);
        System.out.println("Hasilnya adalah : " +result);
    }
}
