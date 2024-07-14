package OOPsJava.oops.staticExample;
class Test {
    static String name;
    public Test(String name) {Test.name = name;}
}
public class InnerClasses {
    static class A {
        String name;
        public A(String name) {this.name = name;}
    }
    public static void main(String[] args) {
        /*
        * the reason for this block to print coca coca 2 times is that String name has been defined
        * as static and at compile time when the static variable is called it sets is identity to the
        * last value assigned to it
        * */
        Test obj1 = new Test("Atul");
        Test obj2 = new Test("Coca");
        System.out.println(Test.name);
        System.out.println(Test.name);

        /*
        * To call the constructor of 'A' class we need to define it as a static element
        * otherwise we'll not be able to call it via a non-Static context*/
        A obj3 = new A("Deb");
        A obj4 = new A("Govind");
        System.out.println(obj3.name);
        System.out.println(obj4.name);
        /*
        * and for the question that if class 'A' is static then why are we creating its objects
        * the ans for this it that a static class can have its different identities and when we
        * are defining class 'A' with a static context it makes it non-dependent from the objects
        * of InnerClass*/
    }
}
