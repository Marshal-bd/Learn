package While;

import java.util.Scanner;

public class Rata {
    public static void main(String[] args) {
        int Nilai;
        int totalnilai = 0;
        int jumlahSiswa;
        double RataRata;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukan Jumlah Siswa: ");
        jumlahSiswa = s.nextInt();

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukan Nilai Siswa Ke " + (i + 1) + ": ");
            Nilai = s.nextInt();

            totalnilai += Nilai;
        }
        RataRata = totalnilai / jumlahSiswa;

        System.out.println("Total Nilai Siswa: " + totalnilai);
        System.out.println("Rata-Rata nilai siswa adalah: " + RataRata);
    }
}
