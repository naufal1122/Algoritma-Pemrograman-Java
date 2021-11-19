import java.util.Scanner;

public class RataRataInputBilDeret {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float sumData=0;
        float countData=0;
        float input=0;

        do{
            System.out.print("Masukkan bilangan ke -n : ");
            input=scan.nextFloat();
            sumData=sumData+input;
            countData++;
        }

        while(input!=0);{
        float rata=sumData/(countData-1);
        }

        System.out.println("Rata-rata bilangan yang dimasukkan adalah : "+rata);

    }
}
