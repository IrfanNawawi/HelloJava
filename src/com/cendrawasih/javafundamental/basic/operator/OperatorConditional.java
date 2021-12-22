package com.cendrawasih.javafundamental.basic.operator;

public class OperatorConditional {
    public static void main (String[] args) {
        int value = 4;
        int anotherValue = 5;

        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;

        System.out.println("Hasil Operator AND pada syarat 4 == 3 dan 5 == 5 adalah " +result);
        System.out.println("Hasil Operator AND pada syarat 4 != 3 dan 5 == 5 adalah " +anotherResult);
        System.out.println();


        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;

        System.out.println("Hasil Operator OR pada syarat 4 == 3 dan 5 == 5 adalah "+result);
        System.out.println("Hasil Operator OR pada syarat 4 != 3 dan 5 == 5 adalah "+anotherResult);
        System.out.println();
    }
}
