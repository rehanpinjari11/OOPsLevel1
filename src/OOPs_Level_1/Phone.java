package OOPs_Level_1;

import java.util.Scanner;

public class Phone {

    String make;
    String model;
    int storage;

    public Phone(String make, String model, int storage)
    {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice()
    {
        int price = 0;

        if (make.equals("Apple"))
        {
            price += 50000;
        }
        else if (make.equals("Samsung"))
        {
            price += 30000;
        }
        else
        {
            price += 10000;
        }

        if (storage > 128)
        {
            price += (int) ((storage - 128) * 1.5); // Additional $1.5 per GB over 128GB
        }

        return price;
    }

    public void printPhoneDetails()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Phone Make (e.g., Apple, Samsung):");
        String make = sc.nextLine();

        System.out.println("Enter the Phone Model:");
        String model = sc.nextLine();

        System.out.println("Enter Phone Storage Capacity(in GB): ");
        int storage = sc.nextInt();

        Phone ph = new Phone(make, model, storage);

        ph.printPhoneDetails();

        double price = ph.calculatePrice();
        System.out.println("Price: " + price);

    }
}
