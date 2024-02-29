// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama class Mahasiswa

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class Mahasiswa {
   private String nama;
   private String nim;
   private String jurusan;
   private WaliMahasiswa wali;

   public Mahasiswa() {
      this.nama = new String();
      this.nim = new String();
      this.jurusan = new String();
      this.wali = new WaliMahasiswa();
   }

   public Mahasiswa(String var1, String var2, String var3, WaliMahasiswa var4) {
      this.nama = var1;
      this.nim = var2;
      this.jurusan = var3;
      this.wali = var4;
   }

   public String getNama() {
      return this.nama;
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

   public void setNama(String var1) {
      this.nama = var1;
   }

   public void setNim(String var1) {
      this.nim = var1;
   }

   public void setJurusan(String var1) {
      this.jurusan = var1;
   }

   public void setWali(WaliMahasiswa var1) {
      this.wali = var1;
   }

   public void cetak() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNama();
      var10000.println("Mahasiswa\nNama : " + var10001 + "\nNIM : " + this.getNim() + "\nJurusan : " + this.getJurusan());
      var10000 = System.out;
      var10001 = this.getWali().getNama();
      var10000.println("\nWali\nNama : " + var10001 + "\nNomor HP : " + this.getWali().getNomorHp() + "\nAlamat : " + this.getWali().getAlamat());
   }
}
