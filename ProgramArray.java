class ProgramArray{
    public static void main(String[] args){
        int[] angka = {8,7,6,6,4,10};
        System.out.println("nilai array index ke 4 = "+ angka[4]);
        System.out.println("nilai array index ke 0 = "+ angka[0]);

        //show all array groups
        for(int i=0; i<angka.length; i++){
            System.out.println("nilai array index ke "+i+" bernilai = "+angka[i]);
        }

        String[] buah= new String[3];
        buah[2]="apel";
        System.out.println(buah[2]);
        System.out.println(buah[0]);

        String[] [] mahasiswa={{"M3121","Ronald"},{"M3122","Rona"}};
        System.out.println("nim dan nama mhs index ke 0" + mahasiswa[0][0]+" "+mahasiswa[0][1]);
        for(int i=0; i<mahasiswa.length; i++){
            System.out.println(mahasiswa[i][j]+" ");
        }
        System.out.println();
    }
}
