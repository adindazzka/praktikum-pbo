// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama class WaliMahasiswa

// Source code is decompiled from a .class file using FernFlower decompiler.
public class WaliMahasiswa {
    private String nama;
    private String nomorHp;
    private String alamat;
 
    public WaliMahasiswa() {
       this.nama = new String();
       this.nomorHp = new String();
       this.alamat = new String();
    }
 
    public WaliMahasiswa(String var1, String var2, String var3) {
       this.nama = var1;
       this.nomorHp = var2;
       this.alamat = var3;
    }
 
    public String getNama() {
       return this.nama;
    }
 
    public String getNomorHp() {
       return this.nomorHp;
    }
 
    public String getAlamat() {
       return this.alamat;
    }
 
    public void setNama(String var1) {
       this.nama = var1;
    }
 
    public void setNomorHp(String var1) {
       this.nomorHp = var1;
    }
 
    public void setAlamat(String var1) {
       this.alamat = var1;
    }
 }
 