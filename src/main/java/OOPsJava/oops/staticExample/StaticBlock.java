package OOPsJava.oops.staticExample;

public class StaticBlock {
    static int a = 5;
    static int b = 7;
    static {
        /*
        * This block gets called only once during runtime when the static methods or variables are called
        * i.e. will only run once when the first obj is created / when the class is loaded
        * */
        System.out.println("I am inside a Static Block");
        b *= a;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.a = 10;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
