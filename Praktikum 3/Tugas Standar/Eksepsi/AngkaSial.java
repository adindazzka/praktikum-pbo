// Nama      : Adinda Rizka Hamdasati
// NIM       : 24060122140139
// Tanggal   : 6 Maret 2024
// Deskripsi : Program penggunaan eksepsi buatan sendiri
//             Pengenalan klausa 'throw' dan 'throws'                

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!");
        }
    }
    
    // Jawaban:
    // Ketika sebuah eksepsi terjadi, program tidak akan melanjutkan eksekusi pada baris 12 dan akan langsung beralih ke bagian penanganan eksepsi dalam blok catch.
    // Program catch pada baris 21 akan dijalankan setelah terjadi eksepsi dalam blok try. Akibatnya, kode di dalam blok try tidak akan dieksekusi sepenuhnya.





}