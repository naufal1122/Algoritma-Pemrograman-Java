import java.util.Scanner;

public class ArrayProfil {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Jumlah Mahasiswa yang ingin anda masukkan : ");
        int n=scan.nextInt();
        
        String mahasiswa[][] = new String[n][3];

        for(int i= 0; i<n; i++)
        {
            System.out.println("");
            System.out.println("Data Mahasiswa ke "+(i+1));

            for(int j=0;j<3;j++)
            {      
                if (j == 0)
                    System.out.print("NIM Anda     : ");
                else if (j == 1)
                    System.out.print("Nama Anda    : ");
                else
                    System.out.print("Jurusan Anda : ");
                
                System.out.print("");
                mahasiswa[i][j] = scan.next();
            }
        }

        System.out.println("Berikut Data Mahasiswa yang anda masukkan");
        System.out.println("-----------------------------");
        System.out.println("NIM \t\t\t  NAMA \t\t  JURUSAN \t\t");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mahasiswa[i][j]+"\t\t");
            }
        System.out.println();
        }
    }   
}
