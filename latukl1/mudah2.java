package latukl1;

import java.util.Scanner;
public class mudah2 {
    public static void main(String[] args) {
        System.out.println("Menentukkan Bilangan Ganjil Atau Genap");
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        int angka = masukan.nextInt();

        if (angka%2==0){
            System.out.println("Angka tersebut adalah bilangan genap");
        }else{
            System.out.println("Angka tersebut adalah bilangan ganjil");
        }
    }
}
