package OOPsJava.oops.interfaces.extendsDemo;

/*
* here as we can see that when we implement interface B
* we also have to describe the function fun() from interface A
* as B has extended A and has gained access to the methods and functions above it
* that's basic inheritance concept over here
*
* static interface methods should always have a body
* */

public class Main implements B{
    @Override
    public void fun() {
        System.out.println("I am having fun");
    }

    @Override
    public void greet() {
        System.out.println("Greetings fella");
    }
}
