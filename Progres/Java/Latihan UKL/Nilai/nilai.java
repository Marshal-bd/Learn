package Nilai;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai: ");
        int Nilai = input.nextInt();

        if ( Nilai >=90 && Nilai <= 100 ) {
                System.out.println("Predikat A");
        } else if (Nilai >=80 && Nilai <= 90) {
            System.out.println("Predikat B");
        } else if (Nilai >=70 && Nilai <=80) {
            System.out.println("Predikat C");
        } else if (Nilai >=60 && Nilai <=70) {
            System.out.println("Predikat D");
        } else if (Nilai >=0 && Nilai <=60) {
            System.out.println("Predikat E");
        }

        System.out.println("Nilai: " + Nilai);
    }
}
