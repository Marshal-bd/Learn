public class DVD extends Produk {
    private int menit;
    private String usia;
    private String studio;

    public DVD() {
        super();
        menit = 0;
        usia = "";
        studio = "";
    }

    public DVD(int nomer, String nama, int jumlah, double harga, int menit, String usia, String studio) {
        super(nomer, nama, jumlah, harga);
        this.menit = menit;
        this.usia = usia;
        this.studio = studio;
    }

    public int getMenit() {
        return this.menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public String getUsia() {
        return this.usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print () {
        System.out.println("______________________________________");
        System.out.println("\t\tMenit: " + menit);
        System.out.println("\t\tRating Usia: " + usia);
        System.out.println("\t\tStudio film: " + studio);
        System.out.println("______________________________________\n");
    }

}
