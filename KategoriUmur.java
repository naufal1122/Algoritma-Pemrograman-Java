class KategoriUmur {
    public static void main( String[] args ) {
        int umur=2;
        //balita, anak, remaja, dewasa, tua
        if(umur<5){
            if(umur<3){
                System.out.println(umur+" Masuk pada kategori bayi");
            }
            else{
                System.out.println(umur+" Masuk pada kategori balita");
            }
        }
        else if(umur<13){
            System.out.println(umur+" Masuk pada kategori anak");
        }
        else if(umur<19){
            System.out.println(umur+" Masuk pada kategori remaja");
        }
        else if(umur<51){
            System.out.println(umur+" Masuk pada kategori dewasa");
        }
        else if(umur>60){
            System.out.println(umur+" Masuk pada kategori tua");
        }
        else if(umur>100){
            System.out.println(umur+" Tidak ada pada kategori bosss");
        }
    }
}
