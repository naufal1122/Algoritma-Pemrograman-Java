import java.util.Scanner;

class KonversiNilaiScanner {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Ini adalah program Konversi Nilai anda menjadi huruf");
        System.out.print("Masukkan Nilai Anda = ");
        int angka = x.nextInt();

        if (angka > 100){
            System.out.println("Waduh, anda sangat pintar");
        }
        else if (angka >= 85){
            System.out.println("Anda mendapat predikat A (4.00)");
        }
        else if (angka >= 80 && angka <= 84){
            System.out.println("Anda mendapat predikat A- (3.70)");
        }
        else if (angka >= 75 && angka <= 79){
            System.out.println("Anda mendapat predikat B+ (3.30)");
        }
        else if (angka >= 70 && angka <= 74){
            System.out.println("Anda mendapat predikat B (3.00)");
        }
        else if (angka >= 65 && angka <= 69){
            System.out.println("Anda mendapat predikat C+ (2.70)");
        }
        else if (angka >= 60 && angka <= 64){
            System.out.println("Anda mendapat predikat C (2.00)");
        }
        else if (angka >= 55 && angka <= 59){
            System.out.println("Anda mendapat predikat D (1.00)");
        }
        else{
            System.out.println("Maaf bos, anda belum lulus");
        }
    }
}
