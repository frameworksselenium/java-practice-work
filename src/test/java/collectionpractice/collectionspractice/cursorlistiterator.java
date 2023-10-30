package collectionpractice.collectionspractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class cursorlistiterator {

    public static void main(String[] args)
    {
        ArrayList v=new ArrayList();
        for(int i=0;i<=10;i++)
        {
            v.add(i);
        }
        System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        ListIterator e=v.listIterator();
        while(e.hasNext())
        {
            Integer iiii = (Integer)e.next();
            if(iiii == 5) {
                e.set(55);
            }
            if(iiii == 6) {
                e.add(66);
            }
            if(iiii == 7) {
                e.remove();
            }
            System.out.println(iiii);//0 2 4 6 8 10
      }
        System.out.print(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
