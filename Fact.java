// import java.util.*;
// public class Fact {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your input: ");
//         int n = sc.nextInt();
//         int b = sc.nextInt();
//         int add = n + b;
//         System.out.println("Add: " + add);
//         sc.close();
//     }
// }


// import java.util.*;
// public class Fact {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (n > a && n > b) {
//             System.out.println(n);
//         }
//         else if (a > n && a > b) {
//             System.out.println(a);
//         }
//         else {
//             System.out.println("greatest is : " + b);
//         }
//         sc.close();
//     }
// }



import java.util.*;
public class Fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial is: " + fact);
        sc.close();
    }
}