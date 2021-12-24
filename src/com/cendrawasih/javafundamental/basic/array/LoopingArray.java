package com.cendrawasih.javafundamental.basic.array;

public class LoopingArray {
    public static void main (String[] args) {
        int[] arrInt3 = new int[100];
        for (int x = 0; x < arrInt3.length; x++)  {
            arrInt3[x] = x + 1;
            System.out.println(arrInt3[x]);
        }
    }
}
