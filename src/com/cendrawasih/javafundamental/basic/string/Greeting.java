package com.cendrawasih.javafundamental.basic.string;

public class Greeting {

    public static void main(String[] args) {

        // template variable name
        String name = "Irfan Nawawi";
        System.out.println("======================================");

        String greeting = "Hello World";
        System.out.println(greeting);
        System.out.println("======================================");

        // create string with array
        char[] dicodingChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);
        System.out.println("======================================");

        // calculate length string with length
        int length = name.length();
        System.out.println(length);
        System.out.println("======================================");

        // get character in the string with charAt
        char result = name.charAt(3);
        System.out.println(result);
        System.out.println("======================================");

        // create string format
        String sf1 = String.format("name is %s ", name); // string
        String sf2 = String.format("my age %d ", 25); // integer
        String sf3 = String.format("my age %f ", 25.00); // float
        String sf4 = String.format("my age %x ", 25); // hexadecimal
        String sf5 = String.format("my char name 3 point %c ", name.charAt(3)); // char

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
        System.out.println(sf5);
        System.out.println("======================================");

        // name with substring
        System.out.println(name.substring(0, 4));
        System.out.println("======================================");

        // check name with contains
        // contains tidak melihat kapital atau bukan hanya sesuai value
        System.out.println(name.contains("Naw")); // true
        System.out.println(name.contains("aw")); // true
        System.out.println(name.contains("Ganteng")); // false :(

        System.out.println("======================================");
        String hello = "Hello World - Mari belajar Android bersama-sama!!!";
        String[] kata = hello.split("\\s");

        for (String text : kata) {
            System.out.println(text);
        }
        /*
        Hello
        World
        -
        Mari
        belajar
        Android
        bersama-sama!!!
        */

        //Contoh regex, untuk memisahkan tanda -
        String[] helloSplit = hello.split("-");

        //Mengambil nilai berdasarkan index dari pemisahan method split -
        System.out.println(helloSplit[0]); // Hello World
        System.out.println(helloSplit[1]); // Mari belajar Android bersama
        System.out.println(helloSplit[2]); // sama!!!
    }
}
