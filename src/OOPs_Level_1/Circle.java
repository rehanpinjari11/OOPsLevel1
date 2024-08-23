package OOPs_Level_1;

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Radius of the Circle: "+c.getRadius());

        System.out.println("Area of the Circle: "+c.calculateArea());

        System.out.println("Circumference of the Circle: "+c.calculateCircumference());


    }
}
