public class BeratBadanIdeal {
    public static void main(String[] args){
        int tinggi=175;
        int berat= 66; //atas 70 min 66

        int ideal=(tinggi-100)-((tinggi-100)*10/100);
        int beratMin=ideal-2; //66
        int beratMax=ideal+2; //70
        System.out.println("berat ideal tinggi "+tinggi+" adalah "+ideal);
        if(tinggi >164 && (berat <= beratMax && berat>= beratMin)){
            System.out.println("Dengan tinggi  "+tinggi+" dan berat badan "+berat+" lolos administrasi ");
        }
        else{
            System.out.println("Dengan tinggi  "+tinggi+" dan berat badan "+berat+" tidadk lolos administrasi ");
        }
    }
}
