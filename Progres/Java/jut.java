import java.util.Scanner;

public class jut {

    public static void main(String[] args) {
        int a = 0;
        String Nama;
        int Pilihan;
        Scanner i = new Scanner(System.in);

        System.out.println("Masukan Nama: ");
        Nama = i.nextLine();
        System.out.println("No Absen: ");
        a = i.nextInt();
        System.out.println("Pilih 1 / 2");
        Pilihan = i.nextInt();

        if (Pilihan == 1) {
            System.out.println("Nama: " + Nama);
            System.out.println("No Absen: " + a);
            System.out.println("yahya kontol");
        }
        if (Pilihan == 2) {
            System.out.println("Nama: " + Nama);
            System.out.println("No Absen: " + a);
            System.out.println("yahya kayak jembut");
        } else {
            System.out.println("Nama: " + Nama);
            System.out.println("No Absen: " + a);
            System.out.println("yahya umbelen");
        }
    }
}