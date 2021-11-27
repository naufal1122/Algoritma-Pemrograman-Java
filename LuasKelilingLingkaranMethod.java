import java.util.Scanner;

public class LuasKelilingLingkaranMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r,luas,keliling;

        System.out.println("Ini adalah program hitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan Panjang Jari - jari lingkaran: ");
        r = input.nextDouble();

        luas = 0.5 * phi * r * r;
        keliling = 2 * phi * r;

        System.out.print("Luas lingkaran adalah : " +(int)luas+ "\nKeliling Lingkaran adalah : " +(int)keliling);
    }
}
