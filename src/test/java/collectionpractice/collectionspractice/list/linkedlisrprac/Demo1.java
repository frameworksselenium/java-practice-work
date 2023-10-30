package collectionpractice.collectionspractice.list.linkedlisrprac;

import java.util.*;

public class Demo1 {

    public static void main(String [] args){

        LinkedList list = new LinkedList();
        list.add("ram");
        list.add(34);
        list.add(null);
        list.add("krishna");
        System.out.println("values : " + list);
        list.add(0,"Anusha");
        System.out.println("values : " + list);
        list.remove();// this will remove first one
        System.out.println("values : " + list);
        list.remove(1);// this will remove first one
        System.out.println("values : " + list);
        list.remove("ram");// this will remove first one
        System.out.println("values : " + list);
        System.out.println("values : " + list.contains("krishna"));


        for(Object o:list){
            System.out.println("foreach:" + o);
        }

        for(int i=0; i<list.size(); i++){
            System.out.println("for:" + list.get(i));
        }

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object val = it.next();
            System.out.println("Iterator:" + val);
        }

        ListIterator it1 = list.listIterator();
        while (it1.hasNext()){
            Object dd = it1.next();
            System.out.println(dd);
        }

        list.clear();
        System.out.println("values : " + list);
    }
}
