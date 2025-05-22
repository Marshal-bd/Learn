package Inventory;

import java.lang.classfile.constantpool.NameAndTypeEntry;

public class product {
    private String Name;
    private int Number;
    private int Quantity;
    private double price;

    public product () {
        Number = 0;
        Name = "";
        Quantity = 0;
        price = 0;
    }

    public product (int Number, String Name, int Quantity, double price) {
        this.Number = Number;
        this.Name = Name;
        this.Quantity = Quantity;
        this.price = price;
    }
    
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNumber() {
        return this.Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}