package streams.practice.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods4 {

    public static void main(String [] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //sort
        List<Integer> sortOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortOrder);

        //sort reverse
        List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

        List<String> list1 = Arrays.asList("Krishna","Ram", "Anusha","Chetan","Sritan");
        //sort
        List<String> sortOrderString = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortOrderString);

        //sort reverse
        List<String> reverseOrderString = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrderString);

        //sort reverse
        Stream<String> reverseOrderString1 = list1.stream().sorted((val1, val2)->val2.compareTo(val1));
        reverseOrderString1.forEach(a->System.out.println(a));

    }
}
