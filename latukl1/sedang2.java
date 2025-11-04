package latukl1;

import java.util.Scanner;
public class sedang2 {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double r, double t) {
        return Math.PI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung : ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung : ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("Jadi Volume Tabung tersebut adalah " + volume);
    }
}
