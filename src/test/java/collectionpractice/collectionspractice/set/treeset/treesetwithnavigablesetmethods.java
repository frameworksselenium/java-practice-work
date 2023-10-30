package collectionpractice.collectionspractice.set.treeset;

import java.util.TreeSet;

public class treesetwithnavigablesetmethods {

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

        System.out.println("ceiling elements : " + vv.ceiling(102));

        System.out.println("higher elements : " + vv.higher(102));

        System.out.println("floor elements : " + vv.floor(102));
        System.out.println("floor elements : " + vv.lower(102));

        System.out.println("pollFirst elements : " + vv.pollFirst());
        System.out.println("pollLast elements : " + vv.pollLast());
        System.out.println("descendingSet elements : " + vv.descendingSet());

    }

}
