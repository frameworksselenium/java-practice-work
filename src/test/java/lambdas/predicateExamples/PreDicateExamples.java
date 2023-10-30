package lambdas.predicateExamples;

import java.util.function.Predicate;

public class PreDicateExamples {

    public static void main(String[] args) {

        Predicate<Integer> val = (a)->(a>10);
        System.out.println(val.test(20));
        System.out.println(val.test(5));


        Predicate<String> stringval = s->(s.length()>4);
        System.out.println(stringval.test("Krishna"));
        System.out.println(stringval.test("Kris"));


        String[] names = {"Raju", "Anu", "Krishna", "Chetan", "Sritan"};

        for(String name:names){
            if(stringval.test(name)){
                System.out.println(name);
            }
        }

    }

}
