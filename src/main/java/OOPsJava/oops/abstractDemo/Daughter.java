package OOPsJava.oops.abstractDemo;

public class Daughter extends Parent {
    @Override
    void profession(String profession) {
        System.out.println("I am a " + profession);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + ", he is " + age);
    }
}
