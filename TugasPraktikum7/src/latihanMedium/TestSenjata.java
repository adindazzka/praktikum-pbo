// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 05 Mei 2024
// Deskripsi: Kelas yang berisi program class TestSenjata
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author adindazka
 */
public class TestSenjata {
    public static void main(String[] args) {
       Senjata ak47 = new Senjata("TAR");
       Senjata m16 = new Senjata("DOR");
       KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
       KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
       
       kontrolAK47.menembak(2);
       kontrolAK47.isiPeluru(3);
       kontrolAK47.menembak(5);
       
       System.out.println("===============================");
       
       kontrolM16.menembak(1);
       kontrolM16.isiPeluru(5);
       kontrolM16.menembak(2);
    }
}