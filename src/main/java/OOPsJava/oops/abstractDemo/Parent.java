package OOPsJava.oops.abstractDemo;

/*
* An abstract class should have at least one abstract method
* We cannot have an abstract constructor
* We cannot have an abstract static method too
* We also cant have a final abstract class
* */

public abstract class Parent {
    abstract void profession(String profession);
    abstract void partner(String name, int age);
    static void hello() {
        System.out.println("Hello, from the Parent class");
    }
}
