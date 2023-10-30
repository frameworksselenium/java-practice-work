package collectionpractice.collectionspractice.list.ArrayListPrac.listmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo5 {

    public static void main(String [] args){

        List newarrayList = new ArrayList();
        newarrayList.add(40);
        newarrayList.add(45);

        ArrayList list = new ArrayList();
        list.add(40);
        list.add(45);
        list.add(40);
        list.add(45);
        list.add(60);
        list.add("");
        list.add(" ");
        System.out.println("before add values : " + list);
        list.add(1,100);
        list.addAll(7,newarrayList);
        System.out.println("after add values : " + list);

        System.out.println("get values : " + list.get(3));
        list.remove(3);
        System.out.println("after removing values : " + list);

        list.set(1,1000);
        System.out.println("after setting values : " + list);

        System.out.println("get index position of 40 : " + list.lastIndexOf(40));
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            Object dd = it.next();
            System.out.println(dd);
        }
    }

}
