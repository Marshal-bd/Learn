public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car() {
        super();
        int numDoors;
        boolean isElectric;
    }

    public Car(int numDoors, double price, int numWheels, boolean isElectric) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Price: " + price);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Electric: " + isElectric);
    }
}
