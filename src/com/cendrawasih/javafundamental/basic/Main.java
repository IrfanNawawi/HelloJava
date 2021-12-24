package com.cendrawasih.javafundamental.basic;

import com.cendrawasih.javafundamental.basic.strukturdasar.kendaraan.Kereta;
import com.cendrawasih.javafundamental.basic.strukturdasar.kendaraan.Mobil;
import com.cendrawasih.javafundamental.basic.strukturdasar.kendaraan.Motor;
import com.cendrawasih.javafundamental.basic.strukturdasar.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World !");

        // musik
        Gitar.bunyi();

        // kendaraan
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        // lib
        Date today = new Date();
        System.out.println("Hari ini = "+ today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = "+ tomorrow);
    }
}
