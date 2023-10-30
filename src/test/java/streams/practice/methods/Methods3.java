package streams.practice.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Methods3 {

    public static void main(String [] args){

        List<String> list = Arrays.asList("1","2","3","A","B","C");
        //reduce
        Optional<String> reduce = list.stream().reduce((value, combinedValue)->{return combinedValue+value;});
        System.out.println("reduced values : " + reduce.get());
        //toArray
        Object[] arr = list.stream().toArray();
        for(Object a:arr){
            System.out.println("Array elements : " + a);
        }
    }
}
