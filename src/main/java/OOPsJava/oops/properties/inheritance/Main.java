package OOPsJava.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box();
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        Box box2 = new Box(6.9);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        Box box3 = new Box(6.9, 9.6, 4.20);
//        System.out.println(box3.l + " " + box3.h + " " + box3.w);
//        Box box4 = new Box(box3);
//        System.out.println(box4.l + " " + box4.h + " " + box4.w);

        /*
        * The child class can access extra variables from the parent class but the parent class cannot
        * access the properties of the child class if the object is created of type parent class
        * */

//        BoxWeight box5 = new BoxWeight();
//        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);
//        BoxWeight box6 = new BoxWeight(9.6, 6.9, 4.2, 1.0);
//        System.out.println(box6.l + " " + box6.h + " " + box6.w + " " + box6.weight);

        /*
        * variable of type Box_class but referencing to object of class_BoxWeight
        * so, we cannot access weight variable with the help of box7
        *
        * and if we try to do BoxWeight obj = new Box(l:2, h:4, w:6);
        * it will give us an error. since, we have created a variable of type BoxWeight_class
        * but, it is referencing to an object of Box_class. And the Box class has no idea about the
        * variables initialised in the child class and hence we cannot access them
        * So, we cannot have a child reference variable and a parent object
        * */
        Box box7 = new BoxWeight(5, 9, 1, 8);
    }
}
