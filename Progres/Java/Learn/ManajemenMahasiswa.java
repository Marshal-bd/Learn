import java.util.Scanner;
import java.util.ArrayList;

public class ManajemenMahasiswa {
    static boolean isAdmin = false;
    static ArrayList<String> namaMahasiswaList = new ArrayList<>();
    static ArrayList<Integer> nimMahasiswaList = new ArrayList<>();
    static ArrayList<String> jurusanMahasiswaList = new ArrayList<>();

    public static void main(String[] args) {
        int[] nimAdmin = {
                2255, 9201, 3812, 1039,
        };
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG KE APLIKASI MANAJEMEN DATA MAHASISWA!");
        System.out.println("LOGIN MELALUI NIM: ");
        int nimInput = checkInputInt(input);
        input.nextLine();
        for (int i = 0; i < nimAdmin.length; i++) {
            if (nimInput == nimAdmin[i]) {
                System.out.println("HAK ADMIN DIKASIH");
                isAdmin = true;
                break;
            }
        }
        if (isAdmin == false) {
            while (!exit) {
                studentMenu();
                int userChoice = checkInputInt(input);
                input.nextLine();
                if (userChoice == 1) {
                    System.out.println("========DATA MAHASISWA=======");
                    tampilkanDataMahasiswa();
                } else if (userChoice == 2) {
                    System.out.println("TERIMA KASIH");
                    exit = true;
                } else {
                    System.out.println("PILIHAN TIDAK TERSEDIA");
                }
            }
        } else if (isAdmin == true) {
            while (!exit) {
                adminMenu();
                int userChoice = checkInputInt(input);
                input.nextLine();
                if (userChoice == 1) {
                    System.out.println("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = input.nextLine();
                    System.out.println("Masukkan NIM Mahasiswa: ");
                    int nimMahasiswa = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Jurusan Mahasiswa: ");
                    String jurusanMahasiswa = input.nextLine();
                    tambahDataMahasiswa(namaMahasiswa, nimMahasiswa, jurusanMahasiswa);
                    System.out.println("Data berhasil dimasukkin! ");
                } else if (userChoice == 2) {
                    tampilkanDataMahasiswa();
                } else if (userChoice == 3) {
                    System.out.println("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    int nimCari = input.nextInt();
                    input.nextLine();
                    cariMahasiswaBerdasarkanNIM(nimCari);
                } else if (userChoice == 4) {
                    System.out.println("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    int nimCari = input.nextInt();
                    input.nextLine();
                    hapusDataMahasiswa(nimCari);
                } else if (userChoice == 5) {
                    System.out.println("Goodbye!");
                    exit = true;
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                }
            }
        }
    }

    public static void tambahDataMahasiswa(String namaMahasiswa, int nimMahasiswa, String jurusanMahasiswa) {
        namaMahasiswaList.add(namaMahasiswa);
        nimMahasiswaList.add(nimMahasiswa);
        jurusanMahasiswaList.add(jurusanMahasiswa);
    }

    public static void tampilkanDataMahasiswa() {
        for (int i = 0; i < namaMahasiswaList.size(); i++) {
            System.out.println("Mahasiswa ke- " + (i + 1) + " :");
            System.out.println("Nama Mahasiswa: " + namaMahasiswaList.get(i));
            System.out.println("NIM Mahasiswa: " + nimMahasiswaList.get(i));
            System.out.println("Jurusan Mahasiswa: " + jurusanMahasiswaList.get(i));
        }
        if (namaMahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
    }

    public static void cariMahasiswaBerdasarkanNIM(int input) {
        boolean found = false;
        for (int i = 0; i < nimMahasiswaList.size(); i++) {
            if (nimMahasiswaList.get(i) == input) {
                System.out.println("Mahasiswa ditemukan!");
                System.out.println("Nama Mahasiswa: " + namaMahasiswaList.get(i));
                System.out.println("NIM Mahasiswa: " + nimMahasiswaList.get(i));
                System.out.println("Jurusan Mahasiswa: " + jurusanMahasiswaList.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }

    public static void hapusDataMahasiswa(int nimMahasiswa) {
        boolean found = false;
        for (int i = 0; i < namaMahasiswaList.size(); i++) {
            if (nimMahasiswaList.get(i) == nimMahasiswa) {
                namaMahasiswaList.remove(i);
                nimMahasiswaList.remove(i);
                jurusanMahasiswaList.remove(i);
                System.out.println("Data mahasiswa telah dihapus!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }

    public static int checkInputInt(Scanner input) {
        while (true) {
            if (input.hasNextInt()) {
                int hasil = input.nextInt();
                return hasil;
            } else {
                System.out.println("Input tidak valid!");
                input.nextLine();
            }
        }
    }

    public static void checkInputString(Scanner input) {

    }

    public static void adminMenu() {
        System.out.println("========MENU ADMIN=======");
        System.out.println("1. Tambah Data Mahasiswa (Nama, NIM, Jurusan)");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Exit");
    }

    public static void studentMenu() {
        System.out.println("========MENU MAHASISWA=======");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Exit");
    }
}