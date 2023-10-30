package lambdas.staticMethodInstanceMethodConstructorRference.InstanceMethod;

interface Sayable{
    void say();
}

public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public void printValues(){
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Child Thread Iteration : " + i);
        }
    }
    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        // Referring static method
        Sayable sayable = instanceMethodReference::saySomething;
        // Calling interface method
        sayable.say();

        Runnable r = instanceMethodReference::printValues;
        Thread t = new Thread(r);
        t.start();
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Parent Thread Iteration : " + i);
        }
    }
}