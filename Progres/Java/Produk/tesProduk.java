import java.util.Scanner;

public class tesProduk {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("\t\t\t\t--Selamat Datang--");
        System.out.println("\tMasukan Nomor: ");
        int nomer = i.nextInt();
        System.out.println("\t\tMasukan Nama: \n");
        String nama = i.next();
        System.out.println("\t\t!!Pilih Produk DVD Dibawah ini!!");
        System.out.println("\t1. Juna Coli");
        System.out.println("\t2. Arpan bobok");
        System.out.println("\t3. Azam bersemi di R6");
        System.out.println("\t4. Fatih berkelana");
        int Pilihan = i.nextInt();

        if (Pilihan == 1) {
            System.out.println("Anda Memilih film berjudul \"Juna Coli\"");
            System.out.println("Berapa Yang anda akan beli");
            int jumlah = i.nextInt();
            DVD dvd1 = new DVD(nomer, nama, jumlah, 200000.00, 120, "90+", "Junzz");
            dvd1.print();
        }
        if (Pilihan == 2) {
            System.out.println("Anda Memilih film berjudul \"Arpan bobok\"");
            System.out.println("Berapa Yang anda akan beli");
            int jumlah = i.nextInt();
            DVD dvd1 = new DVD(nomer, nama, jumlah, 250000.00, 120, "90+", "Junzz");
            dvd1.print();
        }
        if (Pilihan == 3) {
            System.out.println("Anda Memilih film berjudul \"Azam bersemi di R6\"");
            System.out.println("Berapa Yang anda akan beli");
            int jumlah = i.nextInt();
            DVD dvd1 = new DVD(nomer, nama, jumlah, 300000.00, 120, "90+", "Junzz");
            dvd1.print();
            Produk p1 = new Produk(nomer, nama, jumlah, 200000.00, 60, "21", "ARK");
            p1.print();
        }
        if (Pilihan == 4) {
            System.out.println("Anda Memilih film berjudul \"Fatih berkelana\"");
            System.out.println("Berapa Yang anda akan beli");
            int jumlah = i.nextInt();
            DVD dvd1 = new DVD(nomer, nama, jumlah, 350000.00, 120, "90+", "Junzz");
            dvd1.print();
        }
    }
}