import java.util.Scanner;

public class DiskonPert2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int harga;
        int jumlah;
        int diskon;
        int total;

        System.out.print("Masukan Harga barang disini : ");
        harga=input.nextInt();
        System.out.print("Masukan Jumlah barang disini : ");
        jumlah=input.nextInt();
        total=jumlah*harga;

        if(total>=100000){
            diskon=total*10/100;
            total=total-diskon;
            System.out.println("Hore anda dapat diskon 10%" );
            System.out.println("jadi diskonnya : "+diskon);
            System.out.println ("total anda bayar : "+total);
        }
        else if(total>=50000){
            diskon=total*5/100;
            total=total-diskon;
            System.out.println("Hore anda dapat diskon 5%" );
            System.out.println("jadi diskonnya : "+diskon);
            System.out.println ("total anda bayar : "+total);
        }
        else {
            diskon=total*0/100;
            total=total-diskon;
            System.out.println("yah, tidak dapat diskon" );
            System.out.println("jadi diskonnya : "+diskon);
            System.out.println ("total anda bayar : "+total);
        }      
    }
}
