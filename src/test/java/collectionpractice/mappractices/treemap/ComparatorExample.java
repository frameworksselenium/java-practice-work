package collectionpractice.mappractices.treemap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String[] args) {


        TreeMap<Integer, Integer> vv =new TreeMap<Integer, Integer>(new MyComarator());
        vv.put(101, 1000);
        vv.put(104, 4000);
        vv.put(102, 2000);
        vv.put(103, 3000);
        vv.put(106, 6000);
        vv.put(105, 5000);
        System.out.println("elements : " + vv);

    }
}

class MyComarator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        Integer int1 = (Integer)o1;
        Integer int2 = (Integer)o2;
        if(int1<int2) {
            return +1;
        } else if(int1>int2){
            return -1;
        }else {
            return 0;
        }
    }
}
