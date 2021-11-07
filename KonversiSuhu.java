import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args){
        double celcius;
        double fahrenheit;
        double kelvin;
        double reamur;
        int pilih;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Suhu Dalam Celcius  : ");
        celcius = input.nextInt();
        System.out.println("");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukan Pilihan : ");
        pilih = input.nextInt();
        System.out.println("");

        switch(pilih){
            case 1 :
            fahrenheit = (celcius*9/5)+32;
            System.out.println(celcius + " Celcius = " + fahrenheit +" Fahrenheit");
            break;

            case 2 :
            kelvin = celcius+273.15;
            System.out.println(celcius + " Celcius = " + kelvin +" Kelvin");
            break;

            case 3 :
            reamur = celcius*4/5;
            System.out.println(celcius + " Celcius = " + reamur +" Reamur");
            break;

            default :
            System.out.println("Pilihan yg anda masukan salah");
            break;
        }
    }
}
