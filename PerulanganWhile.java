import java.util.Scanner;
public class PerulanganWhile {
    public static void main(String[] args){
        /*
        format perulangan dengan while
        while(kondisi){
            statement di dalam perulangan
        }
        */
        int i=0;
        while(i<10){
            System.out.println("Perulangan ke-"+i);
            i=i+1;
        }

        Scanner data=new Scanner(System.in);
        char sapa;
        do{
            System.out.println("Selamat Siang");
            System.out.println("Cetak sapaan lagi Y/N");
            sapa=data.next().charAt(0);
        }while(sapa=='Y');
    }
}