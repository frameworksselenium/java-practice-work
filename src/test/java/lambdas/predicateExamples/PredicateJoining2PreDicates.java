package lambdas.predicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoining2PreDicates {
//joining  2 predicates   and or  negate

    //predicate1 ----check even number or not
    //predicate2 --- checks greater than 50

    public static void main(String[] args) {

       int[] a = {5, 10, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
        Predicate<Integer> p1 = i->(i%2==0);
        Predicate<Integer> p2 = i->(i>50);


        for(int i:a){
           if(p1.test(i) && p2.test(i)){
               System.out.println(i);
           }
       }
        /// AND
        for(int i:a){
            if(p1.and(p2).test(i)){
                System.out.println("using AND operator : " + i);
            }
        }
        //OR
        for(int i:a){
            if(p1.or(p2).test(i)){
                System.out.println("using OR operator : " + i);
            }
        }

        //negate
        for(int i:a){
            if(p2.negate().test(i)){
                System.out.println("using NEGATE operator : " + i);
            }
        }
    }

}
