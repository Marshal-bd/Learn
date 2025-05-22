import java.util.Scanner;

public class soala {

    public static void main(String[] args) {
        int Jaraktempuh, Tinggipaket, Lebarpaket, Panjangpaket, Beratpaket;

        Scanner a = new Scanner(System.in);
        System.out.println("Masukan Berat Paket: ");
        Beratpaket = a.nextInt();
        System.out.println("Masukan Jarak Tempuh: ");
        Jaraktempuh = a.nextInt();
        System.out.println("Masukan Tinggi Paket: ");
        Tinggipaket = a.nextInt();
        System.out.println("Masukan Lebar Paket: ");
        Lebarpaket = a.nextInt();
        System.out.println("Masukan Panjang Paket: ");
        Panjangpaket = a.nextInt();

        int volume = Panjangpaket * Lebarpaket * Tinggipaket;
        int ongkir = Beratpaket * Jaraktempuh;

        if (Jaraktempuh <= 10) {
            ongkir = 4250 * Beratpaket;

        } else if (Jaraktempuh >= 10) {
            ongkir = 6000 * Beratpaket;
        }
        if (volume >= 100) {
            ongkir = ongkir + 50000;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Berat paket : " + Beratpaket + ".0 KG");
        System.out.println("Jarak : " + Jaraktempuh + " KM");
        System.out.println("Volume Paket : " + volume + " CM3");
        System.out.println("Ongkir Dari paket : " + "Rp. " + ongkir + ",00");
        System.out.println("-Terima Kasih Telah Menggunakan Jasa Kami-");
        System.out.println("--------------------------------------------------------");

    }
}