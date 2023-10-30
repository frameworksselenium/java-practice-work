package collectionpractice.mappractices.treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ComparatorExample1 {

    public static void main(String[] args) {


        SortedMap<Integer, Integer> vv =new TreeMap<Integer, Integer>(new MyComarator1());
        vv.put(101, 1000);
        vv.put(104, 4000);
        vv.put(102, 2000);
        vv.put(103, 3000);
        vv.put(106, 6000);
        vv.put(105, 5000);
        System.out.println("elements : " + vv);

    }
}

class MyComarator1 implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        //return i1.compareTo(i2);//asc order
        //return -i1.compareTo(i2);//dec order
        //return i2.compareTo(i1);//dec order
        //return -i2.compareTo(i1);//asc order
        //return +1;//insertion order
        //return -1;//reverse of insertion order
        return 0;//[10] and all other elements are treated as duplicates

    }
}
