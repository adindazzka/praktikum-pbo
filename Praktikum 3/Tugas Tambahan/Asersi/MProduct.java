// Nama      : Adinda Rizka Hamdasati
// NIM       : 24060122140139
// Tanggal   : 10 Maret 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan class Product

public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);

        System.out.println("Product Name  : " + product.getName());
        System.out.println("Product Stock : " + product.getStock());
        System.out.println("Product Price : " + product.getPrice());

        product.purchaseProduct(5);
        System.out.println("\nProduct1 Stock : " + product.getStock());
    } 
}