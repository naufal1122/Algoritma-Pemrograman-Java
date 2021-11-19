import java.util.Scanner;

public class PerkalianPerulangan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah input : ");
        int n = input.nextInt();
        int sumData = 1;
        int i = 0;
        int display = 1;

        do{
            System.out.print("Masukkan nilai ke-" + display + " : ");
            int data = input.nextInt();
            sumData = sumData * data;
            display++;
            i++;
        }
        while(i < n);

        System.out.println("Hasil kali ke-" + (display-1) + " bilangan : " + sumData);
    }
}
