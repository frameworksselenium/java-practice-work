package collectionpractice.mappractices.treemap;

import java.util.*;

public class treemap {
    public static void main(String[] args) {


        SortedMap vv =new TreeMap();
        vv.put(34, 55);
        vv.put(33, 15);
        vv.put(12, 15);

        SortedMap m =new TreeMap(vv);
        m.put(2, 165);
        m.put(56, 15);
        m.put(12, 33);


        System.out.println("hashcode : " + m);
        Set s = m.keySet();
        System.out.println(s);//[nagarjuna,venkatesh,balaiah,chi    ranjeevi]
        Collection c = m.values();
        System.out.println(c);//[500, 200, 800, 100]
        Set s1 = m.entrySet();
        System.out.println(s1);//[nagarjuna=500,venkatesh=200,balaiah=800,chiranjeevi=100]
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "......" + m1.getValue());
            if (m1.getKey().equals(34)) {
                m1.setValue(100000000);
            }
        }
        System.out.println(m);
        Map<String, Integer> synmap = Collections.synchronizedMap(m);

        // printing the
        System.out.println("Synchronized map is : "                + synmap);
    }

}
