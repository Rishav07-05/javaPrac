import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    // public Student(String name, int marks) {
    //     this.name = name;
    //     this.marks = marks;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    void studentDetails() {
        System.out.println("This is name: " + name + "\n" + "This is marks: " + marks);
    }
    
}

public class encap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        Student obj = new Student();


        obj.setName(b);
        obj.setMarks(a);
        obj.studentDetails();
        sc.close();
    }
}
