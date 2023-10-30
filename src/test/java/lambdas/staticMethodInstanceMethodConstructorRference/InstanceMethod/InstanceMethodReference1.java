package lambdas.staticMethodInstanceMethodConstructorRference.InstanceMethod;

import lambdas.staticMethodInstanceMethodConstructorRference.staticMethod.StaticMethodReference;

public class InstanceMethodReference1 {

    public void printValues(){
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Child Thread Iteration : " + i);
        }
    }
    public static void main(String[] args) {
        //Runnable r = StaticMethodReference::printValues; /// instead of this line passing directly in constructor
        Thread t = new Thread(new InstanceMethodReference1()::printValues);
        t.start();
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Parent Thread Iteration : " + i);
        }
    }
}