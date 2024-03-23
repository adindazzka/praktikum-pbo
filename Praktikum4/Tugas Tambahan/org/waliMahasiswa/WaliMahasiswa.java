// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas yang berisi program class WaliMahasiswa

package org.waliMahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHp, alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return this.nomorHp;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        System.out.println("Wali Mahasiswa\nNama : " + getNama() + "\nNIK : " + getNik() + "\nNomor HP : " + getNomorHp() + "\nAlamat : " + getAlamat() + "\n");
    }
}
