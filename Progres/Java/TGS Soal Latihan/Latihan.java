import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Double Barang, Barang2, Diskon, hasil, total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Barang: ");
        Barang = scan.nextDouble();
        System.out.print("Jumlah Barang: ");
        Barang2 = scan.nextDouble();
        System.out.print("Diskon: ");
        Diskon = scan.nextDouble();

        Diskon = Barang * Diskon / 100;
        hasil = Barang - Diskon ;
        total = hasil * Barang2;
        System.out.println("Rp: " + total);

    }

}
