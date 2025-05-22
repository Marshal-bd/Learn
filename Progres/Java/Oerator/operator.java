public class operator {
        String Nama, lahir;
        int absen, Tanggal;

    public operator () {
        absen = 0;
        Nama = "";
        lahir = "";
        Tanggal = 0;
    }
    public operator (int absen, String Nama, String lahir, int Tanggal) {
        this.absen = absen;
        this.Nama = Nama;
        this.lahir = lahir;
        this.Tanggal = Tanggal;
    }
    public int getabsen() {
        return absen;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void print() {
        System.out.println("_______________________________");
        System.out.println(absen + ". " + Nama);
        System.out.println(lahir + "/" + Tanggal);
        System.out.println("_______________________________");
    }
}