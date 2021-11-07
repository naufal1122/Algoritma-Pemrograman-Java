public class LogikaAndOr {
    public static void main(String[] args){
        int a=1;
        int b=0;

        if(a==1 && b==1){
            System.out.println("Kondisi AND satu memenuhi");
        }
        else if(a==1 && b==0){
            System.out.println("Kondisi AND dua memenuhi");
        }

        if(a==1 || b==1){
            System.out.println("Kondisi OR satu memenuhi");
        }
        else if(a==1 || b==0){
            System.out.println("Kondisi OR dua memenuhi");
        }
    }
}
