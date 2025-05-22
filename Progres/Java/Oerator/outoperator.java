import java.util.Scanner;

public class outoperator {
    public static void main(String[] args) {
        operator Azami = new operator(16, "Kafi azami ajuna", "Blitar", 200808);
        operator Ardi = new operator(22, "Mahardika arfuri", "Malang", 130909);
        operator Nabil = new operator(25, "Nabil anwar kencana", "Malang", 111208);

            Azami.print();
            Ardi.print();
            Nabil.print();
    }
}
