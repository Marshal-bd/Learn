import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Masukan angka Untuk di loop: ");
        long angka = c.nextLong();

        for (long i = 1; i <= angka; i++) {
            System.out.println("Miss Call from mom " + i);
        }
    }
}