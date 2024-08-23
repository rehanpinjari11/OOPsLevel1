package OOPs_Level_1;

import java.util.Scanner;

public class Shirt {

    String size;
    String color;
    double price;

    public Shirt(String size, String color, double price)
    {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateDiscount()
    {
        double discount;

        switch (size.toLowerCase())
        {
            case "s":
                discount = 0.05;
                break;

            case "m":
                discount = 0.12;
                break;

            case "l":
                discount = 0.15;
                break;

            case "xl":
                discount = 0.18;
                break;

            default:
                discount = 0.00;
                break;
        }

        return price * discount;
    }

    public void printShirtDetails()
    {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("Shirt Size: " + size);
        System.out.println("Shirt Color: " + color);
        System.out.println("Original Shirt Price: " + price);
        System.out.println("Discounted Price: " + discountedPrice);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Shirt Size:");
        String size = sc.nextLine();

        System.out.println("Enter the Shirt Color:");
        String color = sc.nextLine();

        System.out.println("Enter the Shirt Price:");
        double price = sc.nextDouble();

        Shirt sh = new Shirt(size, color, price);

        sh.printShirtDetails();

    }
}
