package OOPsJava.oops.cloning;

public class Student implements Cloneable{
    int roll;
    String name;
    int[] arr;
    public Student (int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }
//    public Student (Student obj) {
//        this.roll = obj.roll;
//        this.name = obj.name;
//    }
//    public Object clone () throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    public Object clone () throws CloneNotSupportedException {
        Student deep =  (Student) super.clone(); // shallow copy

        deep.arr = new int[deep.arr.length];
        // deep copy
        for(int i = 0; i < deep.arr.length; i++) {
            deep.arr[i] = this.arr[i];
        }
        return deep;
    }
}
