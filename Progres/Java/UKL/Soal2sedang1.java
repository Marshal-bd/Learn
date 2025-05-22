public class Soal2sedang1 {

    static void JawabSedang() {
        int Tabungan = 100000;
        int bulanan = 50000;
        int total = 0;
        int uang = 0;
        int bulan = 12;

        for (int i = 1; i <= bulan; i++) {
            uang = Tabungan + (bulanan * (i - 1));
            System.out.println("Uang Bulan ke - " + i + " : Rp." + uang);
            total += uang;
        }
        System.out.println("Tabungan Selama satu tahun: Rp." + total);
    }

    public static void main(String[] args) {
        JawabSedang();
    }
}