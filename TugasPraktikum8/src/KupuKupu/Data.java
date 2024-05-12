// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 12 Mei 2024
// Deskripsi: Kelas yang berisi program class Data

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KupuKupu;

/**
 *
 * @author adindazka
 */
public class Data<T extends Kupu> {
    private T kupu;

    public T getIsi() {
        return kupu;
    }

    public void setIsi(T faseKupu) {
        kupu = faseKupu;
    }

    public void gerak() {
        kupu.gerak();
    }
}
