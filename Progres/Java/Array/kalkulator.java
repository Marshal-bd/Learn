import java.util.Scanner;
import java.awt.desktop;

public class kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------KALKULATOR AKBAR-------------");
        System.out.println(" \t Pilihlah Jenis Operator ");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian \n");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("Penjumlahan")) {
            int Bilangan = 0;
            System.out.println("\t--Masukan Bilangan Penjumlahan--");
            for (int i = 1; i = Bilangan; i++) {
                System.out.println(i);
                Bilangan = input.nextInt();
            }
            int hasil = Bilangan + Bilangan;
        }
    }
}
