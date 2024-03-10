// Nama      : Adinda Rizka Hamdasati
// NIM       : 24060122140139
// Tanggal   : 10 Maret 2024
// Deskripsi : Eksepsi buatan sendiri, menolak peminjaman buku yang tidak tersedia

public class BukuTidakTersediaException extends Exception {
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}