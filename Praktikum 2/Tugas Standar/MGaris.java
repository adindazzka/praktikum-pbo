// Nama     : Adinda Rizka Hamdasati
// NIM      : 24060122140139
// Tanggal  : 28 Februari 2024
// Deskripsi: Kelas yang berisi program utama untuk mengaplikasikan class Garis

public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(3,4), new Titik(5,6));
        System.out.println("\nTitik awal garis g1: (" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g1: (" + g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat() + ")");

        Garis g3 = new Garis(new Titik(5,6), new Titik(3,4));
        System.out.println("\nTitik awal garis g3: (" + g3.getTitikAwal().getAbsis() + "," + g3.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g3: (" + g3.getTitikAkhir().getAbsis() + "," + g3.getTitikAkhir().getOrdinat() + ")");

        System. out.println("\nPanjang garis g1 = " + g1. getPanjang());
        System.out.println("Panjang garis g2 = " + g3.getPanjang());

        System.out.println("\nGradien garis g1 = " + g1.getGradien());
        System.out.println("Gradien garis g2 = " + g3.getGradien());

        Garis g2 = g3.getRefleksiY();
        System.out.println("\nTitik awal garis g2 hasil pencerminan garis g3 : (" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garis g2 hasil pencerminan garis g3: (" + g2.getTitikAkhir().getAbsis() + g2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\nApakah garis g3 tegak lurus dengan garis g2? " + g3.isTegakLurus (g2));

    }
}