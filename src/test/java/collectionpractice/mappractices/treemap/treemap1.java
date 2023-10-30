package collectionpractice.mappractices.treemap;

import java.util.TreeMap;
import java.util.TreeSet;

public class treemap1 {

    public static void main(String[] args) {

        TreeMap<Integer, Integer> vv =new TreeMap<Integer, Integer>();
        //vv.add("krishna");//main" java.lang.ClassCastException
        vv.put(101, 1000);
        vv.put(104, 4000);
        vv.put(102, 2000);
        vv.put(103, 3000);
        vv.put(106, 6000);
        vv.put(105, 5000);

        System.out.println("all elements : " + vv);
        System.out.println("first element : " + vv.firstKey());
        System.out.println("last element : " + vv.lastKey());
        System.out.println("headSet element : " + vv.headMap(103));
        System.out.println("tailSet element : " + vv.tailMap(103));
        System.out.println("subSet element : " + vv.subMap(102, 105));
        System.out.println("comparator element : " + vv.comparator());

    }

}
