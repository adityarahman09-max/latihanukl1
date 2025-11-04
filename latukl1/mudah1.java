package latukl1;

import java.util.Scanner;
public class mudah1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Mencari Biaya Perjalanan Paket");
        System.out.println("Masukkan berat barang (KG) : ");
        double berat = masukan.nextDouble();
        System.out.println("Masukkan jarak yang akan ditempuh (KM) : ");
        double jarak = masukan.nextDouble();
        System.out.println("Masukkan Ukuran Paket Menggunakan Satuan Centimeter (CM)");
        System.out.println("Masukkan panjang paket : ");
        double panjang = masukan.nextDouble();
        System.out.println("Masukkan lebar paket : ");
        double lebar = masukan.nextDouble();
        System.out.println("Masukkan tinggi paket : ");
        double tinggi = masukan.nextDouble();

        double volume = panjang*lebar*tinggi;

        double bpkg;
        if (jarak<=10){
            bpkg = 4250;
        }else{
            bpkg = 6000;
        }

        double bvolume;
        if (volume>100){
            bvolume = 50000;
        }else{
            bvolume=0;
        }

        double total = (berat*bpkg)+bvolume;
        System.out.println("Jadi biaya paket tersebut adalah " +total);
}
}
