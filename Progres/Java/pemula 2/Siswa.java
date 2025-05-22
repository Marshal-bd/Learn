// Object Class

public class Siswa {
    int id;
    String nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Constructor nama sama dengan nama Class
    public Siswa () {
        id = 130909;
        nama = "";
        ipk = 12.9;
    }
    // constructor parameter
    public Siswa (int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }
}