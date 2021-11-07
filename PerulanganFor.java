import java.util.Scanner;
public class PerulanganFor{
    public static void main(String[] args){
        /*
        for (inisialisasi awal variabel;kondisi memenuhi perulangan;increment){
            statement
        }
        */
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan perulangan yang anda mau = ");
        int n = data.nextInt();
        for(int i=1;i<n;i++){
        System.out.println("Perulangan ke-"+i);
        }

        //perulangan decrement
        System.out.println("Perulangan decrement");
        for(int i=n;i>0;i--){
        System.out.println("Perulangan ke-"+i);
        }

        //menampilkan bilangan bulat dalam perulangan
        System.out.print("Bilangan bulat pada perulangan = ");
        for(int i=1;i<n;++i){
            if((i%2)==0){
                System.out.print(i+" ");
            }
        }

        //menampilkan bilangan ganjil
        System.out.print("Bilangan ganjil pada perulangan = ");
        for(int i=1;i<n;++i)
            if(i%2!=0){
                System.out.print(i+" ");
            }
    }
}