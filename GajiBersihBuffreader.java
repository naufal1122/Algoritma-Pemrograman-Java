import java.io.*;

public class GajiBersihBuffreader {
    public static void main(String[] args) throws IOException{
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        String nama = "";
        System.out.print("Nama karyawan = ");
        nama = x.readLine();

        String pokok = "";
        System.out.print("Gaji pokok    = ");
        pokok = x.readLine();

        float pokok1;
        pokok1=Float.parseFloat(pokok);

        double tunj,gj,pajak,gb;
        tunj=0.1*pokok1;
        System.out.println("Tunjangan = "+tunj);
        gj=pokok1+tunj;
        System.out.println("Gaji kotor     = "+gj);
        pajak=gj*0.05;
        gb=gj-pajak;
        System.out.println("Gaji bersih    = "+gb);
    }
}
