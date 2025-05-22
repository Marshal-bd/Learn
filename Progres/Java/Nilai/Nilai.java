import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {

        int Nilai;
        char Predikat = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Masukan nilai: ");
        Nilai = s.nextInt();

        if (Nilai >= 90 && Nilai <= 100) {
            Predikat = 'A';
        } else if (Nilai >= 80 && Nilai <= 89) {
            Predikat = 'B';
        } else if (Nilai >= 70 && Nilai <= 79) {
            Predikat = 'C';
        } else if (Nilai >= 60 && Nilai <= 69) {
            Predikat = 'D';
        } else if (Nilai >= 50 && Nilai <= 59) {
            Predikat = 'E';
        } else if (Nilai >= 40 && Nilai <= 49) {
            Predikat = 'F';
        } else if (Nilai >= 30 && Nilai <= 39) {
            Predikat = 'G';
        } else if (Nilai >= 20 && Nilai <= 29) {
            Predikat = 'H';
        } else if (Nilai >= 10 && Nilai <= 19) {
            Predikat = 'I';
        } else if (Nilai >= 0 && Nilai <= 9) {
            Predikat = 'J';
        }

        System.out.println("Nilai: " + Nilai);
        System.out.println("Predikat: " + Predikat);

    }
}