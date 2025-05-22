package Inventory;

public class DVD extends product {
    private int lenght;
    private int Rating;
    private String Studio;

    public DVD() {
        super();
        lenght = 0;
        Rating = 0;
        Studio = "";
    }

    public DVD(int Number, String Name, int Quantity, double price, int lenght, int Rating, String Studio) {
        super(Number, Name, Quantity, price);
        this.lenght = lenght;
        this.Rating = Rating;
        this.Studio = Studio;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getRating() {
        return this.Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

}
