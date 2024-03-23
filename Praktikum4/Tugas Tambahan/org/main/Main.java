// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas yang berisi program Main Mahasiswa

package org.main;

import org.orang.*;
import org.mahasiswa.*;
import org.waliMahasiswa.*;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa waliMahasiswa1 = new WaliMahasiswa("Yuliana", "3672055605090001", "087772349772", "BPI BLOK S1 NO.02");

        Mahasiswa mahasiswa1 = new Mahasiswa("Adinda Rizka", "3672055509030001", "24060122140139", "Informatika", waliMahasiswa1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Radinda Hamdasati", "3672055607780001", "240010122130130", "Kimia", waliMahasiswa1);

        waliMahasiswa1.cetak();
        mahasiswa1.cetak();
        mahasiswa2.cetak();
    }
}
