package Project;

public class PartTime extends Teacher {
    private String Name;
    private String Subject;
    private int Age;
    private int TotalWorkHour;

    public PartTime() {
        super();
        Name = "";
        Age = 0;
        Subject = "";
        TotalWorkHour = 0;
    }

    public PartTime(String Name, int Age, String Subject, int TotalWorkHour) {
        super(Name, Age);
        this.Name = Name;
        this.Age = Age;
        this.Subject = Subject;
        this.TotalWorkHour = TotalWorkHour;
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

    public int getTotalWorkHour() {
        return this.TotalWorkHour;
    }

    public void setTotalWorkHour(int TotalWorkHour) {
        this.TotalWorkHour = TotalWorkHour;
    }

}
