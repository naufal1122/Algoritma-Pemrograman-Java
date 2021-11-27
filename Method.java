public class Method {

    public void salamPagi(){
        System.out.println("Selamat Pagi");
    }

    public static void salamSiang(){
        System.out.println("Selamat Siang");
    }

    public static void salamBebas(String salam){
        System.out.println(salam);
    }

    public static void cetakData(String nama, int usia){
        System.out.println("Nama : " + nama + " Usia : " + usia);
    }

    public static void jumlahDuaBilangan(int a1, int a2){
        int jumlah = a1 + a2;
        System.out.println(a1 + " + " +a2+" = "+jumlah);
    }

    public static int berapaJumlah2Bilangan(int a1, int a2){
        int jumlah = a1 + a2;
        return jumlah;
    }

    public static int faktorial (int angka){
        int hasil;
        if(angka == 1) {hasil=1;}
        else {
            hasil = angka * faktorial(angka-1);
        }
        return hasil;
    }

    public static void main(String[] args){
        Method method = new Method();
        method.salamPagi();
        salamSiang();
        salamBebas("Selamat Bebas");
        cetakData("Naufal Dewa",28);
        jumlahDuaBilangan(10,9);
        System.out.println(berapaJumlah2Bilangan(10,5));
        System.out.println(faktorial(5));
    }
}
