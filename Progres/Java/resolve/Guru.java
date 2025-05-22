//Object Class
public class Guru {
    int id;
    private String nama;
    private String mapel;
    private String alamat;

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

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // constructor parameter
    public Guru(int id, String nama, String alamat, String mapel) {
        this.id = id;
        this.mapel = mapel;
        this.alamat = alamat;
        this.nama = nama;
    }

    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + getNama());
        System.out.println("MAPEL: " + getMapel());
        System.out.println("ALAMAT: " + getAlamat());
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }

}