import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // String nama="Ardi";
        // String alamat="Malang";
        // int umur=15;
        // char jeniskelamin='L';
        // int beratbadan=2645;
        // boolean status=true;

        // System.out.println("Nama:" + nama);
        // System.out.println("Alamat: " + alamat);
        // System.out.println("Umur: " + umur);
        // System.out.println("Jenis Kelamin: " + jeniskelamin);
        // System.out.println("Berat Badan: " + beratbadan);


        Scanner input = new Scanner(System.in);
    System.out.println("Enter your fullname: ");
    String nama=input.next();
    System.out.println("Enter your Addres: ");
    String alamat=input.next();
    System.out.println("what age are you: ");
    int usia=input.nextInt();
    System.out.println("jenis kelamin:");
    char jeniskelamin = input.next().charAt(0);
    System.out.println("berat badan:");
    char beratbadan = input.next().charAt(0);

    System.out.println("Welcome Aboard Captain " + nama);
    System.out.println("how's things going in " + alamat);
    System.out.println("Look at your age now " + usia);
    System.out.println("jenis kelamin mu apa ? " + jeniskelamin);
    System.out.println(beratbadan + "kg");

    }
}