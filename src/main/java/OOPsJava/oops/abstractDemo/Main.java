package OOPsJava.oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        son.profession("Engineer");
        son.partner("xyz", 17);

        daughter.profession("doctor");
        daughter.partner("xQc", 19);

        Parent.hello();
    }
}
