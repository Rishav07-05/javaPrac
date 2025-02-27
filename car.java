import java.util.Scanner;

class Car {
    // attributes 
    String brand;
    String model;
    double price;

    // constructor

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

        void displayCarDetails()
    {
        System.out.println("This are my attributes for car: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}


public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();

        Car obj = new Car(a, b, c);
        obj.displayCarDetails();
        sc.close();
    }
}
