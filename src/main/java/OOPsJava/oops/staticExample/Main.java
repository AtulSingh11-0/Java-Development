package OOPsJava.oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human atul = new Human(19, "Atul Singh", 10_000, false);
        Human deb = new Human(18, "Deb Poddar", 20_000, true);
        Human govind = new Human(20, "Govind Yadav", 17_500, true);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Human.message();
        /*
        * Whenever we try to access a static variable from a non-static context we should always
        * use the class name instead of the respective "object name".
        * If we call it via the object name it'll not show any error still it's a general convention
        * to refer to the class name for static variables
        * */
    }
}
