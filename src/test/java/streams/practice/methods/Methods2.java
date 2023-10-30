package streams.practice.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Methods2 {

    public static void main(String [] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Count
        long evenNumbersCounts = list.stream().filter((n)->n%2==0).count();
        System.out.println("Even numbers : " + evenNumbersCounts);
        //min
        Optional<Integer> minval = list.stream().min((val1, val2)->{return val1.compareTo(val2);});
        System.out.println("Min value : " + minval.get());

        //mix
        Optional<Integer> maxval = list.stream().max((val1, val2)->{return val1.compareTo(val2);});
        System.out.println("Max value : " + maxval.get());
    }
}
