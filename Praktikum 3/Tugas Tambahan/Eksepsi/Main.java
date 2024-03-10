// Nama      : Adinda Rizka Hamdasati
// NIM       : 24060122140139
// Tanggal   : 10 Maret 2024
// Deskripsi : Program penggunaan eksepsi buatan sendiri

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Adinda");
        Anggota anggota2 = new Anggota("Rizka");

        Buku buku1 = new Buku("Dilan 1991");
        Buku buku2 = new Buku("Dilan 1992");
        Buku buku3 = new Buku("Milea");
        Buku buku4 = new Buku("Ancika");

        try {
            anggota1.pinjamBuku(buku1);
            System.out.println("Buku " + buku1.getJudul() + " berhasil dipinjam oleh " + anggota1.getNama());

            anggota1.pinjamBuku(buku2);
            System.out.println("Buku " + buku2.getJudul() + " berhasil dipinjam oleh " + anggota1.getNama());

            anggota1.pinjamBuku(buku3);
            System.out.println("Buku " + buku3.getJudul() + " berhasil dipinjam oleh " + anggota1.getNama());

            anggota1.pinjamBuku(buku4);
            System.out.println("Buku " + buku4.getJudul() + " berhasil dipinjam oleh " + anggota1.getNama());
        } catch (MaksimumBukuTerpinjamException exception) {
            System.out.println(exception.getMessage());
        } catch (BukuTidakTersediaException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            anggota2.pinjamBuku(buku4);
            System.out.println("\nBuku " + buku4.getJudul() + " berhasil dipinjam oleh " + anggota2.getNama());

            anggota2.pinjamBuku(buku1);
            System.out.println("Buku " + buku1.getJudul() + " berhasil dipinjam oleh " + anggota2.getNama());
        } catch (BukuTidakTersediaException exception) {
            System.out.println(exception.getMessage());
        } catch (MaksimumBukuTerpinjamException exception) {
            System.out.println(exception.getMessage());
        }
    }
}