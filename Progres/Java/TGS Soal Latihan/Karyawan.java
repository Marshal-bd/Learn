import java.util.Scanner;

public class Karyawan {
    public static void main(String[] args) {
        double Gaji, Jamkerja, pajak, gajibersih;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gaji Karyawan: ");
        Gaji = scan.nextDouble();
        System.out.println("jam Kerja: ");
        Jamkerja = scan.nextDouble();
        System.out.println();

        Gaji = Gaji * Jamkerja;
        pajak = Gaji * 0.10;
        gajibersih = Gaji - pajak;

        System.out.println("Total Gaji Bersih: " + gajibersih);

    }

}
