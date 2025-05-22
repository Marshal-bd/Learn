import java.util.Scanner;

public class ganjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Bilangan: ");
        int Bilangan = input.nextInt();

        if (Bilangan % 2 == 0) {
            System.out.println(Bilangan + " Bilangan Genap");
        }else {
            System.out.println(Bilangan + " Bilangan Ganjil");
        }
    }
}