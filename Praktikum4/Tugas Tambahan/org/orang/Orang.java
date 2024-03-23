// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas yang berisi program class Orang

package org.orang;

public class Orang {
    protected String nama, nik;

    public Orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak() {
        System.err.println("Orang\nNama : " + getNama() + "\nNIK : " + getNik() + "\n");
    }
}
