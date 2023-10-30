package collectionpractice.collectionspractice.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeset1 {

    public static void main(String[] args) {

        TreeSet vv =new TreeSet();
        //vv.add("krishna");//main" java.lang.ClassCastException
        vv.add(101);
        vv.add(102);
        vv.add(103);
        vv.add(104);
        vv.add(105);
        vv.add(106);
        System.out.println("all elements : " + vv);
        System.out.println("first element : " + vv.first());
        System.out.println("last element : " + vv.last());
        System.out.println("headSet element : " + vv.headSet(103));
        System.out.println("tailSet element : " + vv.tailSet(103));
        System.out.println("subSet element : " + vv.subSet(102, 105));
        System.out.println("comparator element : " + vv.comparator());

    }

}
