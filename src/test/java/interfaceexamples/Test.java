package interfaceexamples;

import accessmodifier.defaultclass.DefaultClass;

public class Test {

    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}
