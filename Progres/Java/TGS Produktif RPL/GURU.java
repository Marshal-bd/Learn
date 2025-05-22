// Object Class

public class GURU {
    String Nama;
    String Mapel;
    String Alamat;
    int id;

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getMapel() {
        return this.Mapel;
    }

    public void setMapel(String Mapel) {
        this.Mapel = Mapel;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Constuctor Name same as Class Name
    public GURU() {
        Nama = "";
        Mapel = "";
        Alamat = "";
        id = 0;
    }

    // constructor parameter
    public GURU(int id, String Nama, String Alamat, String Mapel) {
        this.id = id;
        this.Mapel = Mapel;
        this.Alamat = Alamat;
        this.Nama = Nama;
    }

    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + Nama);
        System.out.println("MAPEL: " + Mapel);
        System.out.println("ALAMAT: " + Alamat);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }

}
