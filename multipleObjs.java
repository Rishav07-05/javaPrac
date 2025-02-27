import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("This are person Details: ");
        System.out.println("This is my name: " + name + "This is my age: " + age);
    }

}


public class multipleObjs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of person u need: ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + 1 + " person's name: ");
            String name = sc.nextLine();
            System.out.println("Enter " + i + 1 + " person's age: ");
            int age = sc.nextInt();

            persons[i] = new Person(name, age);
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < n; i++) 
        {
            persons[i].displayPersonDetails();
        }


        sc.close();
    }
}
