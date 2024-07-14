package OOPsJava.oops.introduction;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an object "atul" of student type and then passing it some values
        Student atul = new Student();
        atul.rno = 25;
        atul.name = "Atul";
        atul.marks = 8.3f;
        // printing the passed values of "atul"
        System.out.println(atul.rno);
        System.out.println(atul.name);
        System.out.println(atul.marks);
        // trying to see what will be printed if we try to print "atul"
        System.out.println(atul); // prints the class name along with some hashcode


        // creating a new object "deb" to call values using the default constructor
        Student deb = new Student();
        System.out.println("\n"+deb.rno);
        System.out.println(deb.name);
        System.out.println(deb.marks);

        // creating a new object "govind" to call the values via a parameterized constructor
        Student govind = new Student(86, "Govind", 7.6f);
        System.out.println("\n"+govind.rno);
        System.out.println(govind.name);
        System.out.println(govind.marks);

        System.out.println();
        atul.greeting();
        deb.greeting();
        govind.greeting();

        // creating an object to call a constructor via another constructor
        Student random = new Student(atul);
        System.out.println("\nValues of the random object");
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks+"\n");

        // creating two objects and then point the 2nd object to the 1st one as a reference variable
        Student one = new Student(0, "null", 0.0f);
        Student two = one;
        System.out.println(one.name);
        System.out.println(two.name);
        two.name = "changed";
        System.out.println(one.name);
        System.out.println(two.name);
        /*
        * as we can see from the above example that if we make changes in the "one" object, the changes will also be
        * reflected to object "two" and if we do the vice-versa the changes are then also reflected as well
        * hence we can conclude that here the concept of pointer is being used but still we cant play with the memory
        *  addresses of the objects
        * */
    }
}
class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Greeting function is called !!!!!!!!");
        System.out.println("Hello "+this.name+", This function is called by "+this.name+" object\n");
    }

    // default constructor
    Student() {
        this.rno = 23;
        this.name = "Deb";
        this.marks = 6.9f;
    }
    // making a constructor call another constructor
    Student (Student obj) {
        // objc here is the object "atul"
        /*
        * therefore, it's like this.rno = atul.rno;
        * and this keyword here is referring to the oops.introduction.Student constructor
        * hence the format over here is like oops.introduction.Student.rno = atul.rno
        * that's why it's printing atul's roll no.
        * */
        this.rno = obj.rno;
        this.name = obj.name;
        this.marks = obj.marks;
    }
    // parameterized constructor
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
