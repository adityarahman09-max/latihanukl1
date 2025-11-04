package latukl1;

import java.util.Scanner;
public class sulit1{
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Rekapitulasi Nilai Siswa");
        System.out.println("Masukkan Jumlah Siswa : ");
        int siswa = masukan.nextInt();
        double tnilai = 0;

        for (int s = 1 ; s<=siswa ; s++){
            System.out.println("Masukkan nilai siswa ke " +s + " :");
            int nilai = masukan.nextInt();
            tnilai += nilai;
        }

        double ratarata = tnilai/siswa;
        System.out.println("Jadi rata rata nilai pada kelas tersebut adalah " +ratarata);

    }
}