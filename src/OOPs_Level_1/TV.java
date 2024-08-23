package OOPs_Level_1;

import java.util.Scanner;

public class TV {

    String brand;
    int size;
    double price;

    public TV(String brand, int size, double price)
    {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount()
    {
        double discount;

        if (size >= 55)
        {
            discount = 0.10;
        }
        else if (size >= 40)
        {
            discount = 0.20;
        }
        else
        {
            discount = 0.30;
        }

        return price * discount;
    }

    public void printTVDetails()
    {
        double discountAmount = calculateDiscount();
        double discountedPrice = price - discountAmount;

        System.out.println("TV Brand: " + brand);
        System.out.println("TV Size: " + size);
        System.out.println("TV Original Price: " + price);
        System.out.println("TV Discounted Price: " + discountedPrice);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the TV Brand Name:");
        String brand = sc.nextLine();

        System.out.println("Enter the TV Size(in Inches):");
        int size = sc.nextInt();

        System.out.println("Enter the Price");
        double price = sc.nextDouble();

        TV myTV = new TV(brand, size, price);

        myTV.printTVDetails();

    }
}
