package collectionpractice.collectionspractice.list.ArrayListPrac.collectionsArrays;

import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String [] args){

        int[] numbers = {4, 9, 1, 3, 2, 8, 7, 0, 6, 5};
        System.out.println(Arrays.toString(numbers));
        java.util.Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};
        Collections.sort(Arrays.asList(fruits));
        System.out.println("Alphabetical order: " + Arrays.toString(fruits));
        Collections.reverse(Arrays.asList(fruits));
        System.out.println("Alphabetical order: " + Arrays.toString(fruits));
    }

}
