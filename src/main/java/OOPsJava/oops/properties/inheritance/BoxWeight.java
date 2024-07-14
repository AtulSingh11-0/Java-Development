package OOPsJava.oops.properties.inheritance;

public class BoxWeight extends Box {
    double h;
    double w;
    double weight;
    BoxWeight () { // default constructor
        this.weight = -1;
    }
    BoxWeight (double l, double h, double w, double weight) { // parameterized constructor
        /*
        * super keyword calls the parent class constructor
        * it is used to initialize variables present in parent class, but you cannot access private elements
        * */
        super(l, h, w);
        this.weight = weight;
    }
}
