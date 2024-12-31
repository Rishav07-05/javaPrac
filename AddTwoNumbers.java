// import java.util.Scanner;

// public class UserInput{
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         System.out.println("Hello, " + name + "! You are " + age + " years old.");

//         scanner.close();
        
//     }
// }


import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}


