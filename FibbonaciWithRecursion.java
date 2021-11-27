//Fibonacci with Recursion
public class FibbonaciWithRecursion {
    public static int fibbonaciRecursion(int n){

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        if(n==2){
            return 1;
        }

        return fibbonaciRecursion(n-1)+fibbonaciRecursion(n-2);
    }
    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.print("Jumlah Deret Fibbonaci dari" +maxNumber+ "angka : ");
        
        for(int i=0;i<maxNumber;i++){
            System.out.print(fibbonaciRecursion(i)+", ");
        }
    }
}
