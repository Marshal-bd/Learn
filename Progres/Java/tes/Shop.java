import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        System.out.println("--------------------------------|");
        System.out.println("Choose one of this number");
        System.out.println("1. Car");
        System.out.println("2. bicycle");
        System.out.println("3. Out Shop");
        System.out.println("--------------------------------|\n");
        System.out.println("Choose A number 1, 2, 3");
        int Pilihan = u.nextInt();

        if (Pilihan == 1) {
            System.out.println("you choose car");
            System.out.println("Select Roof Type (1. Not with roof/2. with roof)");
            int roofType = u.nextInt();
            if (roofType == 1) {

                System.out.println("Input Number of Wheels: ");
                int numWheels = u.nextInt();
                System.out.println("Input Price: ");
                double price = u.nextDouble();
                u.nextLine();
                System.out.println("Input Number of Doors: ");
                int numDoors = u.nextInt();
                System.out.println("Electric (True/False): ");
                boolean isElectric = u.nextBoolean();
                Car c1 = new Car(numWheels, price, numDoors, isElectric);
                c1.print();
                System.out.println("You get a discount (1. True/2. False)");
                int discount = u.nextInt();
                if (discount == 1) {
                    System.out.println("Input discount: ");
                    double Discount = u.nextDouble();
                    double Finalprice = c1.Discount(Discount);
                    System.out.println("Final Price: " + Finalprice);
                }
                if (discount == 2) {
                    System.out.println("Thanks for Shopping");
                }
            }
            if (roofType == 2) {

                System.out.println("Input Number of Wheels: ");
                int numWheels = u.nextInt();
                System.out.println("Input Price: ");
                double price = u.nextDouble();
                u.nextLine();
                System.out.println("Input Number of Doors: ");
                int numDoors = u.nextInt();
                System.out.println("Electric (True/False): ");
                boolean isElectric = u.nextBoolean();
                Car c1 = new Car(numWheels, price, numDoors, isElectric);
                c1.print();
                System.out.println("You get a discount (1. True/2. False)");
                int discount = u.nextInt();
                if (discount == 1) {
                    System.out.println("Input discount: ");
                    double Discount = u.nextDouble();
                    double Finalprice = c1.Discount(Discount);
                    System.out.println("Final Price: " + Finalprice);
                }
                if (discount == 2) {
                    System.out.println("Thanks for Shopping");
                }
            }
        } else if (Pilihan == 2) {
            System.out.println("you choose bicycle");
            System.out.println("Input Number of Wheels: ");
            int numWheels = u.nextInt();
            System.out.println("Input Price: ");
            double price = u.nextDouble();
            System.out.println("Input Bike Type: ");
            String bikeType = u.next();

            Bicycle b1 = new Bicycle(numWheels, price, bikeType);
            b1.print();
            System.out.println("You get a discount (1. True/2. False)");
            int discount = u.nextInt();
            if (discount == 1) {
                System.out.println("Input discount: ");
                double Discount = u.nextDouble();
                double Finalprice = b1.Discount(Discount);
                System.out.println("Final Price: " + Finalprice);
            }
            if (discount == 2) {
                System.out.println("Thanks for Shopping");
            }
        }
        if (Pilihan == 3) {
            System.out.println("You Log Out From shop");

        }
    }
}
