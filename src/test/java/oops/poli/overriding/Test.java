package oops.poli.overriding;

public class Test {

    public static void main(String[] args) {
        //method resolution taken care by JVM in case of instance method based on runtime object
        //A is reference object and A Runtime object
        A a = new A();
        a.m1();
        //A is reference object and B Runtime object
        B b = new B();
        b.m1();
        //A is reference object and B Runtime object
        A ab = new B();
        ab.m1();
        System.err.println(b);
    }
}
