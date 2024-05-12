// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 12 Mei 2024
// Deskripsi: Kelas yang berisi program class MainKupu
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KupuKupu;

/**
 *
 * @author adindazka
 */
public class MainKupu {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
