import java.util.Scanner;

public class menghitung {
    public static void main(String[] args) {
        int sisisejajar1, sisisejajar2, tinggi, hasil;

        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        sisisejajar1 = scan.nextInt();
        System.out.print("b: ");
        sisisejajar2 = scan.nextInt();
        System.out.print("t: ");
        tinggi = scan.nextInt();

        hasil = 1 / 2 * sisisejajar1 + sisisejajar2 * tinggi;

        System.out.println("hasil dari luas trapesium: " + hasil);

    }

}
