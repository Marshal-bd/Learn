package Project;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String Teacher, Student, Person, Nama, Mapel;
        int Age, Hourswork;
        double Salary, TotalSalary;

        Scanner i = new Scanner(System.in);
        System.out.println("Pilih -(Teacher/Student)-");
        Person = i.nextLine();

        if (Person.equalsIgnoreCase("Teacher")) {
            System.out.println("Masukan Data Diri Anda");
            System.out.println("");

            if (Person.equalsIgnoreCase("Teacher")) {
                System.out.println("Masukan Nama Anda: ");
                Nama = i.next();
                System.out.println("Masukan Umur Anda: ");
                Age = i.nextInt();
                System.out.println("Masukan Mapel: ");
                Mapel = i.nextLine();
                System.out.println("Masukan Jam Kerja Anda: ");
                Hourswork = i.nextInt();
                System.out.println("Masukan Gaji Anda: ");
                Salary = i.nextDouble();

                TotalSalary = Hourswork * Salary;

                System.out.println("Nama: " + Nama);
                System.out.println("Umur: " + Age);
                System.out.println("Mapel: " + Mapel);
                System.out.println("Jam Kerja: " + Hourswork);
                System.out.println("Gaji: " + Salary);
                System.out.println("Total Gaji Anda: " + TotalSalary);

            }

        }
        if (Person.equalsIgnoreCase("Student")) {
            System.out.println("Masukan Data Diri Anda");

            if (Person.equalsIgnoreCase("Student")) {
                System.out.println("Masukan Nama Anda: ");
                Nama = i.nextLine();

            }
        }

    }
}
