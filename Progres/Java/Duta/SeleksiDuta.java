import java.util.Scanner;

public class SeleksiDuta {
    public static void main(String[] args) {
        String Nama, Kelas, Perilaku;
        int rataNilai;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        Nama = in.nextLine();
        System.out.println("Masukan Kelas: ");
        Kelas = in.next();

        if (Kelas.equalsIgnoreCase("X") || Kelas.equalsIgnoreCase("XI")) {
            System.out.println("Masukan Perilaku Siswa:  -(Baik/Cukup)- ");
            Perilaku = in.next();
            if (Perilaku.equalsIgnoreCase("Baik")) {
                System.out.println("Masukan Nilai rata-rata siswa: ");
                rataNilai = in.nextInt();
                if (rataNilai <= 90) {
                    System.out.println("Siswa Dinyatakan Lolos Seleksi");
                } else {
                    System.out.println("Gagal Karena Nilai Tidak Mencukupi");
                }
            } else {
                System.out.println("Siswa tidak Lolos Karena Perilaku");
            }
        } else {
            System.out.println("Maaf Anda Bukan Kelas X dan XI");
        }
    }
}