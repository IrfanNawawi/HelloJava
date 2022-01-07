package com.cendrawasih.javafundamental.basic.accessmodifier.package1;

public class KelasA {
    /* note modifier
    private : hanya bisa diakses di class itu sendiri
    default : bisa di akses class manapun asalkan masih dalam 1 package
    protected : bisa diakses class manapun walaupun beda package selama class tersebut merupakan turunannya (parent and child)
    public : bisa diakses dimana saja tanpa batasan
     */
    private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
