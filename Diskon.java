
//membuat program menghitung barang diskon
//misalkan barang A = pensil, barang B = bolpen

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
class Diskon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        //variabel
        int jum=0, i=0;
        double total_bayar=0;

        int [] nama = new int[2];
        int [] qty = new int[2];
        int [] harga = new int[2];
        double [] sub_total = new double[2];
        double [] diskon= new double [2];
        String [] barang = new String[2];

        System.out.println("Penghitungan Diskon Belanja Anda");

        System.out.print("Masukkan Jumlah Beli : ");
        jum=input.nextInt();
        System.out.println(" ");

        System.out.println("Ketik (1) untuk barang pensil, ketik (2) untuk barang bolpen");

        for (i=0; i<jum;i++){
            System.out.print("Masukan Kode Barang Ke-"+(i+1)+" : ");
            nama[i]=input.nextInt();
            System.out.print("Masukan qty Ke-"+(i+1)+" : ");
            qty[i]=input.nextInt();

            switch (nama[i]){
                case 1 : 
                    barang[i]="Pensil  ";
                    harga[i]=1000;
                    diskon[i]=0.1;
                    break;
                case 2 : 
                    barang[i]="Bolpen  ";
                    harga[i]=2000;
                    diskon[i]=0.05;
                    break;
                default : 
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }
        //format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");
        for (i=0; i<jum;i++){
            sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
            total_bayar+=sub_total[i];
            System.out.println(i+1+"    "+barang[i]+"   "+kursIndonesia.format(harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        //total bayar
        System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
    }
}