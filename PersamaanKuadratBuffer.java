import java.lang.Math;
import java.io.*;

class PersamaanKuadratBuffer{    
    public static void main(String[] args)throws Exception{
        double a, b, c, discriminant, x1;
        double x2;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ini adalah aplikasi mencari persamaan kuadrat");

        System.out.print("Masukkan nilai a: ");
        a = Double.parseDouble(in.readLine());
        System.out.print("Masukkan nilai b: ");
        b = Double.parseDouble(in.readLine());
        System.out.print("Masukkan nilai c: ");
        c = Double.parseDouble(in.readLine());
        discriminant=(b*b)-(4*a*c);

        if(discriminant<0){
            discriminant=-discriminant;
            System.out.println("Akar Imajiner");
        }
        else
            System.out.println("Akar Real");
        if(a!=0){
            x1=(-b+Math.sqrt(discriminant))/2.0/a;
            x2=(-b-Math.sqrt(discriminant))/2.0/a;
        }
        else{
            x1=0;
            x2=0;   
            System.out.println("Ini bukan persamaan kuadrat");
        }

        System.out.println("Nilai diskriminan: " + discriminant);
        System.out.println("Nilai x1: " + x1);
        System.out.println("Nilai x2: " + x2);
        in.close();
    }
}
