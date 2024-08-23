package OOPs_Level_1;

import java.util.Scanner;

public class Dog {

    String breed;
    int age;
    double weight;

    public Dog(String breed, int age, double weight)
    {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int getAgeInHumanYears()
    {
        return this.age * 7;
    }

    public void printDogDetails()
    {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Age in Human Years: " + getAgeInHumanYears());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dog's Breed:");
        String breed = sc.next();

        System.out.println("Enter the Dog's Age:");
        int age = sc.nextInt();

        System.out.println("Enter the Dog's Weight(in Kg):");
        double weight = sc.nextDouble();

        Dog d = new Dog(breed, age, weight);

        d.printDogDetails();

    }
}
