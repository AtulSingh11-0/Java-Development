package OOPsJava.oops.properties.polymorphism;

// This is an example of Dynamic Polymorphism

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area of circle is pi * radius * radius");
    }
}
