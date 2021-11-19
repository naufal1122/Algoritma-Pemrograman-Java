import java.util.Scanner;

public class HitungKPK {
    public static void main(String[] args){
        int c,m,n,faktor,sisa;
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan pertama anda : ");
        m = input.nextInt();
        System.out.print("Input bilangan kedua anda : ");
        n = input.nextInt();

        if(m<n){
            c = m;
            m = n;
            n = c;
        }

        faktor = 1;

        for (int i=2;i<=n;i++){
            sisa = n%i;
            if (sisa==0)
            for(int j = 2;i<=m;j++){
                if ((m%j)==0)
                faktor = j;
                break;
            }
        }
        System.out.println("KPK nya adalah = "+(m*n/faktor));
    }    
}
  