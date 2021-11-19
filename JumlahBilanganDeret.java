import java.util.Scanner;

public class JumlahBilanganDeret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan ke-n: ");
        
        int n = input.nextInt();
        int hasilJml=0;
        String deret="";

        
        for (int i=1; i<=n; i++) {
            deret=deret+String.valueOf(i)+" ";
            hasilJml=hasilJml+i;
        }

        System.out.println("hasil jumlah bil.asli : "+deret+" adalah "+hasilJml);
    }
}
    
