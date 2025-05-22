
import java.util.Scanner;

public class TestGuru {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Nama : ");
        String Nama = in.nextLine();
        System.out.println("Mapel : ");
        String Mapel = in.nextLine();

        // Membuat objek
        GURU PashataniaFitriIndahLestari = new GURU(1, "Pashatania Fitri Indah Lestari", "Malang", "Produktif RPL");
        GURU AuliaMasadah = new GURU(2, "Aulia Mas'adah", "Malang", "Produktif RPL");
        GURU DiaurRahman = new GURU(3, "Diaur Rahman", "Malang", "IPAS, Pendidikan Jasmani");
        GURU FirmansyahAyatullah = new GURU(4, "Firmansyah Ayatullah", "Malang", "Informatika (ui/ux design)");
        GURU AgusHariPurwanto = new GURU(5, "Agus Hari Purwanto", "Malang", "Bahasa Indonesia");
        GURU Arkeyuwono = new GURU(6, "Arke Yuwono", "Malang", "guru kelas");

        PashataniaFitriIndahLestari.print();
        AuliaMasadah.print();
        DiaurRahman.print();
        FirmansyahAyatullah.print();
        AgusHariPurwanto.print();
        Arkeyuwono.print();
    }

}
