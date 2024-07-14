package OOPsJava.oops.generics.comparison;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    int roll;
    float marks;
    public Student (int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
        /*
        * if diff == 0 ; means both are equal
        * if diff < 0 ; means o is bigger or else smaller
        * */
    }

    @Override
    public String toString() {
        return roll + "";
    }

    public static void main(String[] args) {
        Student atul = new Student(25, 82.3f);
        Student akash = new Student(73, 97.4f);
        Student priyansh = new Student(48, 84.0f);
        Student suman = new Student(2, 67.7f);
        Student anmol = new Student(31, 99.9f);

        Student[] arr = {atul, akash, priyansh, suman, anmol};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> (o1.roll - o2.roll));
        System.out.println(Arrays.toString(arr));

//        if(atul.compareTo(akash) < 0) {
//            System.out.println("Akash has got higher marks");
//        }
    }

}
