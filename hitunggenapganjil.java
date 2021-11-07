import java.util.Scanner;

public class hitunggenapganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Penghitungan bilangan genap & ganjil");
        System.out.print("Masukkan interval: ");
        int nilai = input.nextInt();
        int sumGenap = 0;
        int sumGanjil = 0;

        System.out.println("Bilangan Genap");
        for (int i = 1; i <= nilai; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumGenap = sumGenap + i;
            }
        }

        System.out.println("\nJumlah Genap = " + sumGenap);
        for (int i = 0; i < nilai; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumGanjil = sumGanjil + i;
            }
        }
        System.out.println("\nJumlah Ganjil = " + sumGanjil);
    }
}