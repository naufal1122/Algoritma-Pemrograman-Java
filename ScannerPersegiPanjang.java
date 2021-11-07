import java.util.Scanner;
public class ScannerPersegiPanjang {
    public static void main(String a[]){
        double panjang=0;
        double lebar=0;
        double keliling=0;
        double luas=0;

        Scanner scn=new Scanner(System.in);
        System.out.println("Berikut adalah aplikasi bidang datar persegi panjang");
        System.out.println("Masukkan Panjang:");
        panjang=scn.nextDouble();
        System.out.print("Masukkan Lebar:");
        lebar=scn.nextDouble();

        luas=panjang*lebar;
        keliling=(2*panjang)+(2*lebar);
        System.out.println("Panjang persegi panjang:"+panjang);
        System.out.println("Lebar persegi panjang:"+lebar);
        System.out.println("Luas persegi panjang:"+luas);
        System.out.println("Keliling persegi panjang:"+keliling);
    }
    
}
