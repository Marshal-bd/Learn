public class Convertible extends Car {
    private String roofType;

    public Convertible() {
        super();
        roofType = "";
    }

    public Convertible(int numWheels, double price, String roofType, int numDoors, boolean isElectric) {
        super(numWheels, price, numDoors, isElectric);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void print() {
        System.out.println("Roof Type: " + roofType);
    }
}
