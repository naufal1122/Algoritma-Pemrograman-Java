import java.util.Scanner;
public class HitungBelanja {
    public static void main(String[] args){
        double totalBelanja=0;
        double totalBayar=0;
        double diskon=0;

        Scanner belanja=new Scanner(System.in);
        System.out.print("Total Belanja:");
        totalBelanja=belanja.nextDouble();
        if(totalBelanja >= 100000){
            diskon=totalBelanja*10/100;
        }
        else if(totalBelanja >= 50000){
            diskon=totalBelanja*5/100;
        }
        else{
            diskon=0;
        }
        totalBayar=totalBelanja-diskon;

        System.out.println("Diskon sebesar:"+diskon);
        System.out.println("Diskon sebesar:"+totalBayar);
    }
}
