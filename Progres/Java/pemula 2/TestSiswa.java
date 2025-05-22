// Driver Class

import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("NAMA: ");
        String nama = in.nextLine();
        System.out.println("ID: ");
        int id = in.nextInt();
        System.out.println("IPK: ");
        double ipk = in.nextDouble();

        // membuat obyek
        Siswa ardi = new Siswa(130909, "nama", 12.9);

        if (ipk >= 60 && ipk <= 70) {
            System.out.println(nama + " lulus");
            System.out.println("D");
        } else if (ipk >= 0 && ipk <= 59) {
            System.out.println(nama + " tidak lulus");
            System.out.println("E");
        } else if (ipk >= 71 && ipk <= 80) {
            System.out.println(nama + "lulus");
            System.out.println("C");
        } else if (ipk >= 81 && ipk <= 90) {
            System.out.println(nama + "lulus");
            System.out.println("B");
        } else if (ipk >= 91 && ipk >= 100) {
            System.out.println(nama + "lulus");
            System.out.println("A");
        }
    }
}
