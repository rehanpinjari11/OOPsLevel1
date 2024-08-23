package OOPs_Level_1;

import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public double calculateYearlySalary() {
        return salary * 12;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee's Name: " + name);
        System.out.println("Employee's Monthly Salary: " + salary);
        System.out.println("Employee's Yearly Salary: " + calculateYearlySalary());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Employee Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter the Employee ID:");
        int id = sc.nextInt();

        Employee emp = new Employee(name, salary, id);

        emp.printEmployeeDetails();

    }
}
