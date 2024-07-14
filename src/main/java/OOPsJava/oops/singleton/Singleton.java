package OOPsJava.oops.singleton;

public class Singleton {
    private Singleton() {
    }
    private static Singleton instance; // here instance is the variable name
    public static Singleton getInstance() { // getInstance is the function here to get the object
        // this if block checks to create only one object and not more than that
        if(instance == null)
            instance = new Singleton();

        // and since the if block is executed 1 time this return keyword will be executed
        return instance;
    }
}
