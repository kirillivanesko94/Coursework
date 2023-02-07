import java.util.Objects;

public class Employee {
    private final String fullName;
    private final int id;
    private int department;
    private double salary;
    private static int indexId = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = indexId++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + this.id + " " + "ФИО: " + this.fullName + ", "
                + "Заработная плата: " + this.salary + ", " + "Отдел: " + this.department;
    }

}
