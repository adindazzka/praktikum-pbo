// Nama : Adinda Rizka Hamdasati
// NIM : 24060122140139
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program utama class Titik

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        
        float counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik : " + counterTitik);

        absis = t1.getAbsis();
		ordinat = t1.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        
        absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

        absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);

        System.out.println("Jarak titik t1 terhadap titik pusat = " + t1.getJarakPusat());
        System.out.println("Jarak titik t2 terhadap titik pusat = " + t2.getJarakPusat());
        System.out.println("Jarak titik t3 terhadap titik pusat = " + t3.getJarakPusat());

        t3.refleksiX();
        t3.refleksiY();
        System.out.println("Pencerminan titik t3 = (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        Titik t4 =t2.getRefleksiX();
        System.out.println("Refleksi X = (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        Titik t5 =t2.getRefleksiX();
        System.out.println("Refleksi Y = (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

// KESIMPULAN
// (Program menciptakan beberapa objek Titik, menginisialisasi mereka dengan nilai tertentu, 
// mencetak informasi tentang jumlah objek, nilai absis dan ordinat, 
// serta jarak setiap titik terhadap pusat koordinat. 
// Selain itu, dilakukan operasi pencerminan terhadap titik-titik dan mencetak hasilnya.)

    }
}
