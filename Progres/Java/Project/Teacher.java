package Project;

public class Teacher extends Person {
    private String Name;
    private int Age;

    public Teacher() {
        super();
        Name = "";
        Age = 0;
    }

    public Teacher(String Name, int Age) {
        super(Name, Age);
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}