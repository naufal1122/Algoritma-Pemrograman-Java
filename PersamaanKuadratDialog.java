import javax.swing.JOptionPane;
public class PersamaanKuadratDialog {
    public static void main(String[] args) {
        int a,b,c;
        double d, akar, x1, x2;
        String angka1,angka2,angka3;

        angka1=JOptionPane.showInputDialog("Masukkan bilangan a=");
        a=Integer.parseInt(angka1);
        angka2=JOptionPane.showInputDialog("Masukkan bilangan b=");
        b=Integer.parseInt(angka2);
        angka3=JOptionPane.showInputDialog("Masukkan bilangan c=");
        c=Integer.parseInt(angka3);

        d=(b*b)-(4*a*c);
        if(d<0){
            JOptionPane.showMessageDialog(null, "Akar Imajiner");
        }
        else if(d==0){
            akar=-b/(2*a);{
                JOptionPane.showMessageDialog(null, "Akarnya sama yaitu = "+akar); 
            }
        } 
        else{
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;
            JOptionPane.showMessageDialog(null, "Akar pertama X1 ="+x1);
            JOptionPane.showMessageDialog(null, "Akar kedua X2 = "+x2); 
        }  
    }
}