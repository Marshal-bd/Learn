package Project;

public class Person {
    private String Student;
    private String Teacher;

    public Person() {
        Student = "";
        Teacher = "";
    }

    public Person(String Student, String Teacher) {
        super();
        this.Student = Student;
        this.Teacher = Teacher;
    }

    public String getStudent() {
        return this.Student;
    }

    public void setStudent(String Student) {
        this.Student = Student;
    }

    public String getTeacher() {
        return this.Teacher;
    }

    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }
}
