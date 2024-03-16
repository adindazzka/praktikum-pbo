// Nama      : Adinda Rizka Hamdasati
// NIM       : 24060122140139
// Tanggal   : 16 Maret 2024
// Deskripsi : Driver class untuk poligon dan persegi panjang

package org.main;

import org.bangunDatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(5, 5, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(5, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }
}