package collectionpractice.mappractices.treemap;

import java.util.SortedSet;
import java.util.TreeSet;

public class treemapnull {
    public static void main(String[] args) {


        SortedSet vv =new TreeSet();
        //vv.add("krishna");//main" java.lang.ClassCastException
        vv.add(null);
        vv.add(10);
        vv.add(5);

        System.out.println("hashcode : " + vv);

    }

}
