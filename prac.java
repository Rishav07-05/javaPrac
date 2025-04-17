// import java.util.Scanner;


// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// public class prac {

//     public static void printfun(Day day) {
//         if (day == Day.MONDAY) {
//             System.out.println("Its a working day" + day);
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your day");
//         String dayInput = sc.nextLine();

//         Day day = Day.valueOf(dayInput);

//         printfun(day);
//         sc.close();
//     }
// }





// import java.util.*;

// enum LEVEL {
//     BEGINNER , INTERMIDIATE , EXPERT 
// }

// public class prac {

//     public static void printLevel(LEVEL level) {
//         if (level == LEVEL.BEGINNER) {
//             System.out.println("you are a beginner");
//         }
//         else if (level == LEVEL.INTERMIDIATE) {
//             System.out.println("you are a intermidiate");
//         }
//         else {
//             System.out.println("you are a expert");   
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();

//         LEVEL level = LEVEL.valueOf(input); // string to enums conversion 

//         printLevel(level);
        
//         sc.close();
//     }
// }






// import java.util.*;

// enum PLANET {
//     EARTH(9.8, "3.2  X 24"), MARS(3.4, "1.2 X 89"), JUPITER(5.4, "1.1 X 39");

//     double gravity;
//     String mass;

//     // constructor 

//     PLANET(double gravity, String mass) {
//         this.gravity = gravity;
//         this.mass = mass;
//     }
// }

// public class prac {

//     public static void printPlanets(PLANET planet) {
//         if (planet == PLANET.EARTH) {
//             System.out.println(planet);
//             System.out.println(planet.mass);
//             System.out.println(planet.gravity);
//         }
//         else if (planet == PLANET.MARS) {
//             System.out.println(planet);
//             System.out.println(planet.mass);
//             System.out.println(planet.gravity);
//         }
//         else if (planet == PLANET.JUPITER) {
//             System.out.println(planet);
//             System.out.println(planet.mass);
//             System.out.println(planet.gravity);
//         }
//         else {
//             System.out.println("no planet detected");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();

//         PLANET planet = PLANET.valueOf(input);

//         printPlanets(planet);

//         sc.close();
//     }
// }




// import java.util.*;

// class Car {
//     String brand;
//     int year;

//     Car(String brand, int year) {
//         this.brand = brand;
//         this.year = year;
//     }


//     void display() {
//         System.out.println("Brand: " + brand + " year:  " + year);
//     }
// }

// public class prac {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String brand = sc.nextLine();
//         int year = sc.nextInt();

//         Car myCar = new Car(brand , year);
        
//         myCar.display();

//     }
// }





import java.util.*;

class overloading {
    int a, b, c;
    int sum;

    int add(int a, int b) {
        sum = a + b;
        return sum;
    }

    int add(int a, int b, int c) {
        sum = a + b + c;
        return sum;
    }


    void display() {
        System.out.println("The sum is: " + sum);
    }
}


public class prac {
    public static void main(String[] args) {
        
        overloading obj = new overloading();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        


        obj.add(a , b);
        obj.display();
        obj.add(a , b , c);
        obj.display();
        sc.close();
    }
}
