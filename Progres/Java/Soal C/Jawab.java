import java.util.Scanner;

public class Jawab {
    public static void main(String[] args) {
        int TotalGaji = 0;
        int GajiTertinggi = Integer.MIN_VALUE;
        int GajiTerendah = Integer.MAX_VALUE;

        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("MASUKAN NOMINAL GAJI KARYAWAN KE " + i + ": ");
            int Gaji = s.nextInt();

            TotalGaji += Gaji;
            GajiTertinggi = Math.max(GajiTertinggi, Gaji);
            GajiTerendah = Math.min(GajiTerendah, Gaji);
        }

        System.out.println("Total Gaji: " + TotalGaji);
        System.out.println("Gaji Tertinggi: " + GajiTertinggi);
        System.out.println("Gaji Terendah: " + GajiTerendah);
    }
}
