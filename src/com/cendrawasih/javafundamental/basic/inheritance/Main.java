package com.cendrawasih.javafundamental.basic.inheritance;

public class Main {
    public static void main (String[] args) {
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("apakah hewan IS-A Objek -> "+(hewan instanceof Object));
        System.out.println("apakah hewan IS-A Hewan -> "+(hewan instanceof Hewan));
        System.out.println("apakah hewan IS-A Kucing -> "+(hewan instanceof Kucing));


        System.out.println("------------------------------------------------------");
        Kucing kucing = new Kucing();
        System.out.println("apakah kucing IS-A Objek -> "+(kucing instanceof Object));
        System.out.println("apakah kucing IS-A Hewan -> "+(kucing instanceof Hewan));
        System.out.println("apakah kucing IS-A Kucing -> "+(kucing instanceof Kucing));


        System.out.println("------------------------------------------------------");
        hewan.makan();
        kucing.makan(); // kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan("daging ikan");


        System.out.println("------------------------------------------------------");
        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ?"+meow.equals(puss));
        System.out.println("meow equals popo ?"+meow.equals(popo));

        System.out.println("------------------------------------------------------");
        Object o = new Kucing(); // kucing adalah Object
        Hewan h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing

//        o.makan; -> // error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k; // bisa langsung diassign
        Hewan hewanK = k; // bisa langsung diassign

//        object.makan; -> // error, karena method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung di assign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}
