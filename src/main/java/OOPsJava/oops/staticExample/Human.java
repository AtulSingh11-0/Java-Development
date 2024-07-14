package OOPsJava.oops.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
    static void message() {
        System.out.println("Hello this is a static function being called");
    }
}
