// import java.util.Scanner;

// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// public class prac {
//     String day;

//     prac(String day) {
//         this.day = day;
//     }

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
//         sc.close();
//     }
// }

// import java.util.Scanner;

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
//         super();//         System.out.println("Constructor made in dog class");
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

// class animal {
//     final int speed = 69;

//     final void run() {
//         System.out.println("Animal speed is: " + speed);
//     }
// }

// class dog extends animal {
//     void display() {
//         super.run();
//         System.out.println("Extended from the animal class");
//     }
// }

// public class prac {

//     public static void main(String[] args) {
//         dog obj = new dog();
//         obj.display();
//     }
// }

// instanceof 

// class animal {

// }

// class dog extends animal {

// }

// public class prac {

//     public static void main(String[] args) {
//         dog d = new dog();
//         System.out.println(d instanceof animal);
//         System.out.println(d instanceof dog);
//         System.out.println(d instanceof Object);
//     }
// }

// exception 

// import java.util.*;

// public class prac {

//     public static void main(String[] args) {
//         try {
//             int res = 10 / 0;
//         } catch (ArithmeticException e) {
//             // TODO: handle exception
//             System.out.println("This is the error");
//         }
//         finally {
//             System.out.println("This is the final code");
//         }
//     }
// }

// public class prac {

//     static void Checkage(int age) throws Exception {
//         if (age < 18) {
//             throw new Exception("Underage");
//         }
//         else {
//             System.out.println("Allowed");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             Checkage(100);
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// multi catch 

// public class prac {

//     public static void main(String[] args) {
//         try {
//             int res = 10 / 0;
//             int arr[] = new int[5];
//             arr[5] = 10;

//         } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//             System.out.println("The error is: " + e);
//         }
//     }
// }

// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.FileReader;

// public class prac {

//     public static void main(String[] args) {
//         try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

//             String line;
//             while ((line = reader.readLine()) !=  null) {
//                 System.out.println(line);
//             }

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// read write file

// import java.io.*;

// public class prac {

//     public static void main(String[] args) throws IOException {
//         FileWriter writer = new FileWriter("output.txt");
//         writer.write("This is my file to write");
//         writer.close();

//         BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//         String line = reader.readLine();
//         if (line.startsWith("This")) {
//             System.out.println("It's working fine");
//         }
//         System.out.println(line);
//         reader.close();
//     }
// }

// image input output fileinputstream && fileoutputstream

// import java.io.*;
// public class prac {

//     public static void main(String[] args) {
//         try {
//             FileInputStream inputstream = new FileInputStream("output.txt");
//             FileOutputStream outputstream = new FileOutputStream("input.txt");

//             int data;
//             while ((data = inputstream.read()) != -1)  {
//                 outputstream.write(data);
//             }
//             inputstream.close();
//             outputstream.close();
//             System.out.println("The file is copied");

//         } catch (Exception e) {

//             e.printStackTrace();
//         }
//     }
// }

// generic classes

// import java.util.*;

// class animal<r> {
//     private r val;

//     public void setValue(r val) {
//         this.val = val;
//     }

//     public r getValue() {
//         return val;
//     }

// }

// public class prac {

//     public static void main(String[] args) {
//         animal<Integer> obj = new animal<>();
//         obj.setValue(12);
//         System.out.println(obj.getValue());

//         animal<String> obj1 = new animal<>();
//         obj1.setValue("This is generic class");
//         System.out.println(obj1.getValue());
//     }

// }

// generic prac question

// class animal<t> {
//     private t name;

//     public void setData(t name) {
//         this.name = name;
//     }

//     public t getData() {
//         return name;
//     }

// }

// public class prac {

//     public static void main(String[] args) {
//         animal<Integer> obj = new animal<>();
//         obj.setData(60);
//         System.out.println("The speed is: " + obj.getData());

//         animal<String> obj1 = new animal<>();
//         obj1.setData("sher");
//         System.out.println("My name is: " + obj1.getData());
//     }
// }

// bounded types 

// class animal<t extends Number> {
//     private t data;

//     public void set(t data) {
//         this.data = data;
//     }

//     public t get() {
//         return data;
//     }
// }

// public class prac {

//     public static void main(String[] args) {
//         animal<Integer> obj = new animal<>();
//         obj.set(12);
//         System.out.println(obj.get());
//     }
// }

// wildcards

// import java.util.*;

// public class prac {

//     public static void print(List<?> list) {
//         for (Object num : list) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {
//         List<Integer> intList = List.of(1, 2, 3);
//         List<String> stringList = List.of("a", "b", "c");

//         print(intList);
//         System.out.println("");
//         print(stringList);
//     }
// }

// single inheritance
// class animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class dog extends animal {
//     // void sound() {
//     //     System.out.println("Dog sound");
//     // }
// }

// public class prac {

//     public static void main(String[] args) {
//         dog obj = new dog();
//         obj.sound();
//     }
// }

// abstract class Animal {
//     abstract void makeSound();
// }

// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("Dog sound");
//     }
// }

// public class prac {

//     public static void main(String[] args) {
//         Animal animal = new Dog();
//         animal.makeSound();
//     }
// }

// nested class

// non static

// class Outer {
//     class Inner {
//         void display() {
//             System.out.println("This is inner class");
//         }
//     }
// }

// public class prac {

//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         Outer.Inner inner = outer.new Inner();
//         inner.display();
//     }
// }

// for static method 

// class Outer {
//     static class Inner {
//         void display() {
//             System.out.println("This is inner class");
//         }
//     }
// }

// public class prac {

//     public static void main(String[] args) {
        
//         Outer.Inner obj = new Outer.Inner();
//         obj.display();
        
//     }
// }




// Anonymous and local class 


// Local 


// class outer {
//     public void outerFun() {
//         System.out.println("hello outer");
//         class inner {
//             public void innerFun() {
//                 System.out.println("hello inner");
//             }
//         }
//         inner obj = new inner();
//         obj.innerFun();
//     }
// }




// public class prac {

//     public static void main(String[] args) {
//         outer obj = new outer();
//         obj.outerFun();
//     }
// }




// Anonymous 


// abstract class inner {
//     abstract void fun();
// }


// public class prac {

//     public static void main(String[] args) {
//         inner obj = new inner(){
//             void fun(){
//                 System.out.println("This is all about anonymous class");
//             }
//         };
//         obj.fun();
//     }
// }