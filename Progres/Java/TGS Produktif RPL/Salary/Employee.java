package Salary;

public class Employee {
    String Nama;
    int Salary;

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public Employee() {
        Nama = "";
        Salary = 0;
    }

    public Employee(String Nama, int Salary) {
        this.Nama = Nama;
        this.Salary = Salary;
    }

    public void println() {
        System.out.println("--------------------------------------------");
        System.out.println("Nama Pekerja: " + Nama);
        System.out.println("Gaji: " + Salary);
        System.out.println("--------------------------------------------");
    }

}
