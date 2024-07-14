package OOPsJava.oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student atul = new Student(19, "Atul");
//        Student deep = new Student(atul); // deep coping of an object
//        deep.roll = 20;
        
        Student shallow = (Student) atul.clone(); // shallow coping of an object

        System.out.println(atul.roll + " " + atul.name);
        System.out.println(Arrays.toString(atul.arr));
        System.out.println(Arrays.toString(shallow.arr));
//        System.out.println(deep.roll + " " + deep.name);

        shallow.arr[0] = 100;

        System.out.println(Arrays.toString(shallow.arr));
        System.out.println(Arrays.toString(atul.arr));
//        System.out.println(shallow.roll + " " + shallow.name);
    }
}
