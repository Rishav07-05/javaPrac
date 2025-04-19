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





// import java.util.*;

// class overloading {
//     int a, b, c;
//     int sum;

//     int add(int a, int b) {
//         sum = a + b;
//         return sum;
//     }

//     int add(int a, int b, int c) {
//         sum = a + b + c;
//         return sum;
//     }


//     void display() {
//         System.out.println("The sum is: " + sum);
//     }
// }


// public class prac {
//     public static void main(String[] args) {
        
//         overloading obj = new overloading();

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        


//         obj.add(a , b);
//         obj.display();
//         obj.add(a , b , c);
//         obj.display();
//         sc.close();
//     }
// }




// inheritance


// class human {
//     void run() {
//         System.out.println("Human can run");
//     }

//     void walk() {
//         System.out.println("Human can walk");
//     }

//     void sleep() {
//         System.out.println("Human can sleep");
//     }

// }

// class boy extends human{
//     void checkboy() {
//         System.out.println("Im a boy");
//     }
// }

// class girl  extends human{
//     void checkgirl() {
//         System.out.println("Im a girl");
//     }
// }
// public class prac {
//     public static void main(String[] args) {
//         boy obj = new boy();
//         girl obj1 = new girl();

//         obj.checkboy();
//         obj.walk();

//         obj1.checkgirl();
//         obj1.run();
//     }
// }



// method overridding 

// import java.util.Scanner;

// class animal {
//     void eats(String food) {
//         System.out.println("Animal Eats: " + food);
//     }
// }

// class dog extends animal {
//     @Override
//     void eats(String food) {
//         System.out.println("Dog Eats: " + food );
//     }
// }


// public class prac {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // String food = sc.nextLine();

//         dog obj = new dog();
//         animal obj1 = new animal();
        
//         obj.eats("Meat");
//         obj1.eats("Grass");

//         sc.close();
//     }
// }



// super() keyword 


// for methods 

// class animal {
//     String s = "animal sound";
// }

// class dog extends animal {
//     String s = "barks";

//     void sound() {
//         System.out.println("Dog: " + s);
//         System.out.println("Animal: " + super.s);
//     }
    
// }


// public class prac {
//     public static void main(String[] args) {
//         dog obj = new dog();
//         obj.sound();
//     }
// }


// for constructor


// class animal {

//     animal() {
//         System.out.println("This is the constructor made in animal class");
//     }

//     void bark() {
//         System.out.println("I bark");
//     }
// }

// class dog extends animal {
    
//     dog() {
//         super();
//         System.out.println("Constructor made in dog class");
//     }

//     void dogSound()
//     {
//         super.bark();
//     }
// }



// public class prac {

//     public static void main(String[] args) {
//         dog d = new dog();
//         d.dogSound();
//     }
// }




// toString()

// class student {
//     int id;
//     String name;

//     student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public String toString() {
//         return id + " " + name;
//     }
// }

// public class prac {

//     public static void main(String[] args) {
//         student obj = new student(2, "Rishav");
//         System.out.println(obj);
//     }
// }




// equals()


// class student {
//     int id;
//     String name;

//     student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public boolean equals(Object obj) {
//         student s = (student)obj;

//         return (this.id == s.id && this.name.equals(s.name));
//     }
// }


// public class prac {

//     public static void main(String[] args) {
//         student s1 = new student(2, "Rishav");
//         student s2 = new student(2, "Rishav");
//         System.out.println(s1.equals(s2));
//     }
// }




// super & final 

class animal {
    final int speed = 69;

    final void run() {
        System.out.println("Animal speed is: " + speed);
    }
}

class dog extends animal {
    void display() {
        super.run();
        System.out.println("Extended from the animal class");
    }
}


public class prac {

    public static void main(String[] args) {
        dog obj = new dog();
        obj.display();
    }
}