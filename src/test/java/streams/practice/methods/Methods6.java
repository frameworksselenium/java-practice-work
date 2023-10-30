package streams.practice.methods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods6 {

    public static void main(String [] args){

        List<String> list1 = Arrays.asList("A","B","C");
        List<String> list2 = Arrays.asList("D","E","F");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        List<String> finalStreams = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println("After Contatination : " + finalStreams);
    }
}
