import java.util.Scanner;

public class NamaBuah {
    public static void main(String[] args){
        int jumlahBuah;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah buah anda : ");
        jumlahBuah = scan.nextInt();
        String namaBuah[] = new String[jumlahBuah];
        for(int i=0;i<jumlahBuah;i++){
            int urutbuah=i+1;
            System.out.println("Masukkan nama buah ke-"+urutbuah+" : ");
            namaBuah[i] = scan.next();
        }
        //show all array groups
        System.out.println("\nNama buah anda adalah : ");
        for(int i=0;i<jumlahBuah;i++){
            System.out.println(namaBuah[i]);
        }
    } 
}
