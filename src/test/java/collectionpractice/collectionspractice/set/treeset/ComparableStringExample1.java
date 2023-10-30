package collectionpractice.collectionspractice.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorStringExample1 {

    public static void main(String[] args) {


        TreeSet vv =new TreeSet(new MyComarator2());
        vv.add("Krishna");
        vv.add("Anusha");
        vv.add("Chetan");
        vv.add("Sritan");
        System.out.println("elements : " + vv);

    }
}

class MyComarator2 implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        String i1 = (String)o1;
        String i2 = (String)o2;
        //return -i1.compareTo(i2);//dec order
        return i2.compareTo(i1);//dec order


    }
}
