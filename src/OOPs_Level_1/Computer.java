package OOPs_Level_1;

import java.util.Scanner;

public class Computer {

    String processor;
    int ram;
    int storage;

    public Computer(String processor, int ram, int storage)
    {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public double calculatePrice()
    {
        double price = 0.0;

        if (processor.equalsIgnoreCase("i3"))
        {
            price += 20000;
        }
        else if (processor.equalsIgnoreCase("i5"))
        {
            price += 40000;
        }
        else if (processor.equalsIgnoreCase("i7"))
        {
            price += 60000;
        }
        else if (processor.equalsIgnoreCase("i9"))
        {
            price += 80000;
        }
        else
        {
            price += 15000;
        }

        price += ram * 10;

        price += storage * 10;

        return price;
    }

    public void printSpecifications()
    {
        System.out.println("Processor: "+ processor);
        System.out.println("Ram: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Computer Processor:");
        String processor = sc.nextLine();

        System.out.println("Enter the Computer Ram (in GB)");
        int ram = sc.nextInt();

        System.out.println("Enter the Computer Storage:");
        int storage = sc.nextInt();

        Computer com = new Computer(processor, ram, storage);

        com.printSpecifications();

        double price =  com.calculatePrice();
        System.out.println("Price: " + price);

    }
}
