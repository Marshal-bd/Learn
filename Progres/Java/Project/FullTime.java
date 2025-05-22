package Project;

public class FullTime extends Teacher {
    private String Name;
    private String Subject;
    private int Age;
    private int unit;
    private double AnnualSalary;

    public FullTime() {
        super();
        Name = "";
        Age = 0;
        Subject = "";
        AnnualSalary = 0;
        unit = 0;
    }

    public FullTime(String Name, int Age, String Subject, double AnnualSalary, int unit) {
        super(Name, Age);
        this.Name = Name;
        this.Age = Age;
        this.Subject = Subject;
        this.AnnualSalary = AnnualSalary;
        this.unit = unit;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getAnnualSalary() {
        return this.AnnualSalary;
    }

    public void setAnnualSalary(double AnnualSalary) {
        this.AnnualSalary = AnnualSalary;
    }

}
