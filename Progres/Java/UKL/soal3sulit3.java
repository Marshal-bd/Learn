public class soal3sulit3 {

    static void JawabSulit() {
        int Array[] = { 1, 2, 1, 3, 4, 5, 1, 1 };
        int total = 0;
        int jumlah = Array.length;
        for (int i = 0; i < Array.length; i++) {
            total = jumlah + i;
        }
        System.out.println("\t\tint Array [] = {1, 2, 1, 3, 4, 5, 1, 1};");
        System.out.println("\t     Angka Paling banyak di Array tersebut adalah: " + total / jumlah);
    }

    public static void main(String[] args) {
        JawabSulit();
    }
}
