import javax.swing.JOptionPane;
class DialogPersegiPanjang{
    public static void main(String[] g){
        double panjang,lebar,keliling,luas;
        String s_panjang,s_lebar,s_luas;
        
        System.out.println("Berikut adalah aplikasi bidang datar persegi panjang");
        s_panjang=JOptionPane.showInputDialog("Masukkan panjang:");
        System.out.print("panjang:"+s_panjang);
        s_lebar=JOptionPane.showInputDialog("Masukkan lebar:");
        System.out.print("lebar:"+s_lebar);

        panjang=Double.valueOf(s_panjang);
        lebar=Double.valueOf(s_lebar);
        luas=panjang*lebar;
        keliling=(2*panjang)+(2*lebar);
        System.out.println("Luas persegi panjang:"+luas);
        System.out.println("Keliling persegi panjang"+keliling);
    } 
}