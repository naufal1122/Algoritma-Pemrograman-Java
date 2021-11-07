import java.lang.Math;
import java.util.Scanner;

public class BarangDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pensil; //barang A
        double buku; //barang B
        double harga_pensil = 1000;
        double harga_buku = 2000;

        System.out.println("Perhitungan diskon barang.");
        System.out.println("--------------------------");

        System.out.println(" ");
        System.out.println("Harga pensil = Rp1000 (Diskon 10%)");
        System.out.println("Harga buku = Rp2000 (Diskon 5%");
        System.out.println(" ");
        System.out.println("---------------------");

        System.out.println("Berapa pensil yang ingin dibeli? : ");
        pensil = input.nextDouble();
        System.out.println("Berapa buku yang ingin dibeli? : ");
        buku = input.nextDouble();
        
        double diskon_pensil = (harga_pensil * pensil) * (1 - 0.10);
        double diskon_buku = (harga_buku * buku) * (1 - 0.05);

        double harga_total = diskon_pensil + diskon_buku;

        System.out.println("Total harga : " + harga_total);
    }
}
