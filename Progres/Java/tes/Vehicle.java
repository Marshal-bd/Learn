public class Vehicle {
    protected int numWheels;
    protected double price;

    public Vehicle() {
        int numWheels;
        double price;
    }

    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public double Discount(double Discountprecentage) {
        return price - (price * Discountprecentage / 100);
    }

    public int getnumWheels() {
        return this.numWheels;
    }

    public void setNumVehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Price: " + price);
    }
}
