package com.cendrawasih.javafundamental.basic.function;

public class InputFunction {
    public static void main(String[] args) {
        hitungLuas(7, 6.5);
    }

    private static void hitungLuas(int panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
