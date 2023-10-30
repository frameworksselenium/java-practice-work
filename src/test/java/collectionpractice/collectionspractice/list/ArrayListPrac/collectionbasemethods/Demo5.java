package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

    public static void main(String [] args){

        List list = new ArrayList();
        list.add(40);
        list.add(45);
        List newarrayList = new ArrayList();
        newarrayList.add(40);
        newarrayList.add(45);
        newarrayList.add(60);
        newarrayList.add("Krishna");
        newarrayList.add("Ram");
        System.out.println("Student object : " + newarrayList.containsAll(list));
        //newarrayList.retainAll(list);
        System.out.println("Student object : " + newarrayList);
        newarrayList.removeAll(list);
        newarrayList.remove("Krishna");
        System.out.println("Student object : " + newarrayList);
        newarrayList.clear();
        System.out.println("Student object : " + newarrayList);
    }

}
