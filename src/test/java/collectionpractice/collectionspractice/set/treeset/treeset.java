package collectionpractice.collectionspractice.set.treeset;

import collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods.Student;

import java.util.*;

public class treeset {
    public static void main(String[] args) {


        TreeSet vv =new TreeSet();
        vv.add(15);
        vv.add(10);
        vv.add(5);

        TreeSet vvv =new TreeSet(vv);
        vvv.add(30);
        vvv.add(25);
        vvv.add(20);


        System.out.println("hashcode : " + vvv);

        List newarrayList = new ArrayList();
        newarrayList.add(25);
        newarrayList.add(20);
        newarrayList.add(30);
        SortedSet vvvv =new TreeSet(newarrayList);
        vvvv.add(15);
        vvvv.add(10);
        vvvv.add(5);

        System.out.println("hashcode : " + vvvv);

    }

}
