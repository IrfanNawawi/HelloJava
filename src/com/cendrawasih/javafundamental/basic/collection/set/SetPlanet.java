package com.cendrawasih.javafundamental.basic.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main (String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan object ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth"); // menambahkan object "earth" beberapa kali
        planets.add("mars"); // object bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " +planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t "+planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = "+planets.size());
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
