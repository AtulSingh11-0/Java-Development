package OOPsJava.oops.properties.polymorphism;

// This is an example of Dynamic Polymorphism

public class Square extends Shapes {
    @Override
    void area() {
        System.out.println("Area of Square is side * side");
    }
}
