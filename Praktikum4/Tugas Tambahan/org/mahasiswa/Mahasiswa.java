// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas yang berisi program utama class Mahasiswa

package org.mahasiswa;

import org.orang.Orang;
import org.waliMahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    private String nim, jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.err.println("Mahasiswa\nNama : " + getNama() + "\nNIK : " + getNik() + "\nNIM : " + getNim() + "\nJurusan : " + getJurusan() + "\nWali : " + getWali() + "\n");
    }
}