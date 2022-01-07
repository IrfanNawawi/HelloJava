package com.cendrawasih.javafundamental.basic.propertimetode;

public class Main {
    public static void main(String[] args) {

        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variable umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        // contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah "+kucing.getUmur());

        // perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = kucing.getBerat() / (kucing.getTinggi()* kucing.getTinggi());
        System.out.println("Indeks massa tubuhnya adalah "+bmi);
    }
}
