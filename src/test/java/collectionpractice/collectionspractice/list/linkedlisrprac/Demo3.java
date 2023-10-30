package collectionpractice.collectionspractice.list.linkedlisrprac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo3 {

    public static void main(String [] args){

        ArrayList newarrayList = new ArrayList();
        newarrayList.add("Krishna");
        newarrayList.add(45);
        newarrayList.add(33.3);
        newarrayList.add(33333337);

        LinkedList list = new LinkedList(newarrayList);
        list.add("linkedlist");

        System.out.println("values : " + list);

        ListIterator it1 = list.listIterator();
        while (it1.hasNext()){
            Object dd = it1.next();
            System.out.println(dd);
        }

        list.addFirst("FirstName");
        list.addLast("LastName");
        System.out.println("values : " + list);
        list.removeFirst();
        System.out.println("values : " + list);
        list.removeLast();
        System.out.println("values : " + list);
        System.out.println("get first values : " + list.getFirst());
        System.out.println("get last values : " + list.getLast());

    }
}
