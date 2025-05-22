package fungsion;

import java.util.Scanner;

public class Tabung {
    static void Tabung(double jarijari, double tinggi) {
        double hasil = 3.14 * (jarijari * jarijari) * tinggi;

        System.out.println("Hasil " + hasil);
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Masukan Jari - Jari Tabung: ");
        double jarijari = i.nextDouble();
        System.out.println("Masukan Tinggi Tabung: ");
        double tinggi = i.nextDouble();
        Tabung(jarijari, tinggi);
    }
}
