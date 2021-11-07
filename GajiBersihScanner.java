import java.util.Scanner;

public class GajiBersihScanner{
    public static void main(String[] args){
        Scanner masukan=new Scanner (System.in);
    
        String nama_karyawan;
        long gapok;
        
        System.out.print ("Nama Karyawan = ");
        nama_karyawan=masukan.next();
        System.out.print ("Gapok = Rp. ");
        gapok=masukan.nextLong();
        long tunjangan=(long) (0.1*(gapok));
        long gaji_kotor=gapok+tunjangan;
        long PPh=(long) (0.05*(gaji_kotor));
        long gaji_bersih=gaji_kotor-PPh;
    
        System.out.println("Nama Karyawan = "+nama_karyawan);
        System.out.println("Tunjangan = 10%");
        System.out.println("Tunjangan = Rp"+tunjangan);
        System.out.println("PPh = 5%");
        System.out.println("PPh = Rp"+PPh);
        System.out.println("Gaji Bersih = Rp. "+gaji_bersih);
    }
}