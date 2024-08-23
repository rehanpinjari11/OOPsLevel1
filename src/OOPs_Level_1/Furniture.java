package OOPs_Level_1;

import java.util.Scanner;

public class Furniture {

    String type;
    String material;
    double price;

    public Furniture(String type, String material, double price)
    {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscount()
    {
        double discount;

        switch (material.toLowerCase())
        {
            case "wood":
                discount = 0.10;
                break;

            case "metal":
                discount = 0.20;
                break;

            case "plywood":
                discount = 0.15;
                break;

            case "plastic":
                discount = 0.05;
                break;

            default:
                discount = 0.00;
                break;
        }

        return price * discount;

    }

    public void printFurnitureDetails()
    {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("Furniture Type: " + type);
        System.out.println("Furniture Material: " + material);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + discountedPrice);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Type of Furniture:");
        String type = sc.nextLine();

        System.out.println("Enter the Material of Furniture:");
        String material = sc.nextLine();

        System.out.println("Enter the Price of the Furniture:");
        double price = sc.nextDouble();

        Furniture f = new Furniture(type, material, price);

        f.printFurnitureDetails();

    }
}
