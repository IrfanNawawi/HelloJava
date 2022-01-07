package com.cendrawasih.javafundamental.basic.obyek;

public class Main {
    public static void main(String[] args) {
        Hewan anjing = new Hewan("Anjing");
        Hewan kucing = new Hewan("Kucing");

        anjing.beratHewan(10);
        anjing.jumlahKakiHewan(4);
        anjing.cetakNama();

        kucing.beratHewan(5);
        kucing.jumlahKakiHewan(4);
        kucing.cetakNama();
    }
}
