package collectionpractice.collectionspractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class cursoriterator {

    public static void main(String[] args)
    {
        ArrayList v=new ArrayList();
        for(int i=0;i<=10;i++)
        {
            v.add(i);
        }
        System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Iterator e=v.iterator();
        while(e.hasNext())
        {
            Object i = e.next();
            System.out.println(i);//0 2 4 6 8 10
            e.remove();
        }
        System.out.print(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
