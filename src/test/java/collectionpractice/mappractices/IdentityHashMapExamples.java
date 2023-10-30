package collectionpractice.mappractices;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExamples {
    public static void main(String[] args)
    {
        HashMap m=new HashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        m.put(i1,"pavan");
        m.put(i2,"kalyan");
        System.out.println(m);

        IdentityHashMap m1 =new IdentityHashMap();
        m1.put(i1,"pavan");
        m1.put(i2,"kalyan");
        System.out.println(m1);
    }

}
