import javax.swing.*;

public class GajiBersihDialog {
    public static void main(String[] args) {
        String anama = JOptionPane.showInputDialog(" Masukan Nama Anda "  );
        String agapok =  JOptionPane.showInputDialog (" Jumlah Gapok Anda  ");
        int  gapok =Integer.parseInt(agapok);

        long Tunj=(long) (0.1*(gapok));
        long gaji_kotor=gapok+Tunj;
        long pajak=(long) (0.05*(gaji_kotor));
        long gaber=gaji_kotor-pajak;

        JOptionPane.showMessageDialog(null, "Nama Anda =  "+ anama+"\nGajiPokok =  "+ agapok+"\nTunjangan Jabatan Anda = Rp."+ Tunj+"\nJumlah Pajak = Rp. "+ pajak+"\nJumlah Gaji Bersih Anda = Rp. "+ gaber);
    }
}