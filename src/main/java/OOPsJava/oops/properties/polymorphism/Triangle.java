package OOPsJava.oops.properties.polymorphism;

// This is an example of Dynamic Polymorphism

public class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("Area of Triangle is 0.5 * base * height");
    }
}
