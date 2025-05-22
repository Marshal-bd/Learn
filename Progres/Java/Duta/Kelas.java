import java.util.Scanner;

public class Kelas {
    public static void main(String[] args) {
        int Pilihan;
        String Kelas;

        Scanner in = new Scanner(System.in);
        System.out.println(
                "Pilih Kelas Anda:  \nXRPL1 \nXRPL2 \nXRPL3 \nXRPL4 \nXRPL5 \nXRPL6 \nXRPL7 \nXRPL8 \nTKJ1 \nTKJ2 \nTKJ3 \nTKJ4 \nPG1 \nPG2 \nXIRPL1 \nXIRPL2 \nXIRPL3 \nXIRPL4 ");
        Pilihan = in.nextInt();

        switch (Pilihan) {  
            case 1:
                Kelas = "XRPL1";
                break;
            case 2:
                Kelas = "XRPL2";
                break;
            case 3:
                Kelas = "XRPL3";
                break;
            case 4:
                Kelas = "XRPL4";
                break;
            case 5:
                Kelas = "XRPL5";
                break;
            case 6:
                Kelas = "XRPL6";
                break;
            case 7:
                Kelas = "XRPL7";
                break;
            case 8:
                Kelas = "XRPL8";
                break;

            default:
                Kelas = "Kelas tersebut Belum Terdaftar";
                break;
        }
        System.out.println("Kelas Anda Adalah: " + Kelas);
    }
}
