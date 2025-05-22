public class Bicycle extends Vehicle {
    private String bikeType;

    public Bicycle() {
        super();
        bikeType = "";
    }

    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void print() {
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Price: " + price);
        System.out.println("Bike Type: " + bikeType);
    }
}