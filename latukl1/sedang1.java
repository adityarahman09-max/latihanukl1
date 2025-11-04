package latukl1;

import java.util.Scanner;
public class sedang1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Bilangan : ");
        int bil = masukan.nextInt();
        int hasil = 1;

        for (int i = 1; i<=bil; i++){
            hasil = hasil * i ;
        }

        System.out.println("jadi hasil dari faktorial bilangan " + bil + " adalah " + hasil);
    }
}
