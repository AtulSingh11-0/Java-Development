package OOPsJava.oops.staticExample;

public class StaticMethodsExample {
    public static void main(String[] args) {
        StaticMethodsExample obj = new StaticMethodsExample();
        fun();
        obj.greeting_2();
    }
    // trying to call a non-static function via help of a static function
    static void fun() {
        StaticMethodsExample obj = new StaticMethodsExample();
        obj.greeting_1();
        System.out.println("Static function \"fun\"");
    }
    void greeting_1() {
        System.out.print("\"Greeting_1\" function is called by >> ");
    }

    // trying to call a static function via help of a non-static function
    static void fun2() {
        System.out.print("\"Fun_2\" function is called by >> ");
    }
    void greeting_2() {
        fun2();
        System.out.println("Non-static function \"Greeting_2\"");
    }
}
