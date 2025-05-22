import java.util.Scanner;

public class soal1mudah1 {

    public static void main(String[] args) {
        int total;

        Scanner i = new Scanner(System.in);
        System.out.println("\t\tMasukkan Total Belanja: ");
        total = i.nextInt();

        if (total <= 100000) {
            System.out.println("\t--Anda Tidak mendapatkan Diskon--");

        }
        if (total >= 100000 && total <= 200000) {
            System.out.println("\t--Anda Mendapatkan Diskon Sebesar 10%--");
            int hasil = total * 10 / 100;
            System.out.println("\tTotal Belanja Anda Menjadi: " + (total - hasil));
        }
        if (total >= 200000) {
            System.out.println("\t--Anda Mendapatkan Diskon Sebesar 20%--");
            int hasil = total * 20 / 100;
            System.out.println("\tTotal belanja Anda Menjadi: " + (total - hasil));
        }

        i.close();
    }
}
