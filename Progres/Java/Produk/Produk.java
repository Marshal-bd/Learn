public class Produk {
    private int nomer;
    private String nama;
    private int jumlah;
    private double harga;

    public Produk() {
        nomer = 0;
        nama = "";
        jumlah = 0;
        harga = 0.0;
    }

    public Produk(int nomer, String nama, int jumlah, double harga) {
        this.nomer = nomer;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getNomer() {
        return this.nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void print() {
        System.out.println("______________________________________");
        System.out.println("\t\tNomer: " + nomer);
        System.out.println("\\t\\tNama: " + nama);
        System.out.println("\\t\\tJumlah: " + jumlah);
        System.out.println("\\t\\tHarga: " + harga);
        System.out.println("______________________________________\n");
    }
}
