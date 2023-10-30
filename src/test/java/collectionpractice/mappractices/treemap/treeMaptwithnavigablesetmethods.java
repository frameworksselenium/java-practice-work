package collectionpractice.mappractices.treemap;

import java.util.TreeMap;
import java.util.TreeSet;

public class treeMaptwithnavigablesetmethods {

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

        System.out.println("ceiling elements : " + vv.ceilingKey(102));

        System.out.println("higher elements : " + vv.higherKey(102));

        System.out.println("floor elements : " + vv.floorKey(102));
        System.out.println("floor elements : " + vv.lowerKey(102));

        System.out.println("pollFirst elements : " + vv.pollFirstEntry());
        System.out.println("pollLast elements : " + vv.pollLastEntry());
        System.out.println("descendingSet elements : " + vv.descendingMap());

    }

}
