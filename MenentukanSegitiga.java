import java.util.Scanner;

public class MenentukanSegitiga {
    public static in(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("Masukkan Sisi 1 : ");
        a = input.nextInt();
        System.out.print("Masukkan Sisi 2 : ");
        b = input.nextInt();
        System.out.print("Masukkan Sisi 3 : ");
        c = input.nextInt();

        if (a==b && b==c){
            System.out.println("Segitiga Sama Sisi");
        }
        else if (a==b || b==c || a==c){
            System.out.println("Segitiga Sama Kaki");
        }
        else {
            System.out.println("Segitiga Sembarang");
        }
    }  
}
      
