package collectionpractice.collectionspractice.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample1 {

    public static void main(String[] args) {


        TreeSet vv =new TreeSet(new MyComarator1());
        vv.add(10);
        vv.add(15);
        vv.add(5);
        vv.add(1);
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
