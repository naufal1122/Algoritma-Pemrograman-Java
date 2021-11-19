import java.util.Scanner;

public class DeretAritmatikaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Un = 0;

        System.out.print("Masukkan bilangan awal : ");
        int bilanganAwal = input.nextInt();

        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();

        System.out.print("Masukkan beda : ");
        int beda = input.nextInt();

        for (int i = 0; i < n; i++) {
            bilanganAwal = bilanganAwal + beda;
        }
        bilanganAwal = bilanganAwal - beda;
        System.out.println(bilanganAwal);
    }
} 