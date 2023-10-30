package collectionpractice.collectionspractice.set.treeset;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {


        TreeSet vv =new TreeSet(new MyComarator());
        vv.add(15);
        vv.add(10);
        vv.add(5);
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
