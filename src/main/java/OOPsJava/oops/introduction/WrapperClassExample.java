package OOPsJava.oops.introduction;

public class WrapperClassExample {
    public static void main(String[] args) {
        A obj;
        for(int i = 1; i <= 10000000; i++) {
            obj = new A("a default name");
        }
    }
}
class A {
    String name;
    A(String name) {
        this.name = name;
    }

    // deprecated method
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
