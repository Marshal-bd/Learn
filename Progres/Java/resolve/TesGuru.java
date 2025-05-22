import java.util.Scanner;

//Driver Class
public class TesGuru {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Nama");
    String nama = in.nextLine();
    System.out.println("Mapel :");
    String napel = in.nextLine();
    System.out.println("Alamat:");
    String alamat = in.nextLine();
    System.out.println("ID :");

    // membuat obyek
    Guru aulia = new Guru(1, "aulia", "malang", "rpl");
    Guru pasha = new Guru(2, "Bu Phasa", "Malang", "Rpl");
    Guru feni = new Guru(3, "feni", "malang", "mtk");
    Guru munif = new Guru(4, "munif", "malang", "agama");
    Guru bidin = new Guru(5, "bidin", "malang", "mtk");

    aulia.print();
    pasha.print();
    feni.print();
    munif.print();
    bidin.print();

    System.out.println(aulia.getId());
    System.out.println(aulia.getNama());
    System.out.println(aulia.getAlamat());
    System.out.println(aulia.getMapel());
  }
}