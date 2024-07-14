package OOPsJava.oops.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box () { // default constructor
        /*
        * if we use the super() keyword in the parent class it will point to the Object_class in java
        * every Class in java is derived or inherited from the Object_class
        * */
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box (double side) { // constructor for cube
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box (double l, double h, double w) { // parameterized constructor
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box (Box obj) { // constructor accepting another constructors object as parameter
        this.l = obj.l;
        this.h = obj.h;
        this.w = obj.w;
    }
}
