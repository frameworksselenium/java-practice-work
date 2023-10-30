package lambdas.staticMethodInstanceMethodConstructorRference.staticMethod;

interface Sayable{
    void say();
}
public class StaticMethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void printValues(){
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Child Thread Iteration : " + i);
        }
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = StaticMethodReference::saySomething;
        // Calling interface method
        sayable.say();

        Runnable r = StaticMethodReference::printValues;
        Thread t = new Thread(r);
        t.start();
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Parent Thread Iteration : " + i);
        }
    }
}