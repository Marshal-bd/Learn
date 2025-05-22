package Array.Faktorial;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int angka, n, faktorial = 1;

        System.out.println("\t Masukan bilangan faktorial: \n");
        System.out.println("Masukan angka: ");
        angka = i.nextInt();

        if (angka <= 0) {
            System.out.println("Angka yang anda masukan kurang dari nol");
        }else {
            for (n = 1; n <= angka; n++) {
                faktorial *= n;
            }
            System.out.println("Faktorial Dari Angka " +
             angka + " Adalah " + faktorial);
        }
    }       
}
