package lambdas.staticMethodInstanceMethodConstructorRference.staticMethod;

public class StaticMethodReference1 {

    public static void printValues(){
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Child Thread Iteration : " + i);
        }
    }
    public static void main(String[] args) {
        //Runnable r = StaticMethodReference::printValues; /// instead of this line passing directly in constructor
        Thread t = new Thread(StaticMethodReference::printValues);
        t.start();
        for(int i=1; i<10; i++) {
            System.out.println("Thread Id : " + Thread.currentThread().getId() + " Parent Thread Iteration : " + i);
        }
    }
}