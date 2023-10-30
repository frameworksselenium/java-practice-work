package collectionpractice.collectionspractice.list.vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Demo3 {

    public static void main(String [] args){

        Vector vector = new Vector();
        System.out.println("capacity : " + vector.capacity());
        vector.add("Krishna");
        vector.add(45);
        vector.add(33.3);
        vector.add(45);

        Vector vec = new Vector(vector);
        System.out.println("capacity : " + vec.capacity());
        vec.addElement("linkedlist");
        vec.insertElementAt("Kris", 2);
        System.out.println("values : " + vec);

        ListIterator it1 = vec.listIterator();
        while (it1.hasNext()){
            Object dd = it1.next();
            System.out.println(dd);
        }

        vec.removeElement("Krishna");
        System.out.println("values : " + vec);
        vec.removeElementAt(3);
        System.out.println("values : " + vec);

        System.out.println("values : " + vec.elementAt(2));

        System.out.println("get first values : " + vec.firstElement());
        System.out.println("get last values : " + vec.lastElement());

        System.out.println("size : " + vec.size());
        System.out.println("capacity : " + vec.capacity());
    }
}
