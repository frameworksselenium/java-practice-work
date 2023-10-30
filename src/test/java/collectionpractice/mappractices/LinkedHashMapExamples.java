package collectionpractice.mappractices;

import java.util.*;

public class LinkedHashMapExamples {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> m = new LinkedHashMap();
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);
        //m.put(null, 500);
        System.out.println(m);//{nagarjuna=500,venkatesh=200,bal        aiah = 800, chiranjeevi = 700
        //m.put(null, 501);


        System.out.println(m.put("chiranjeevi",100));//700
        System.out.println(m);

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
            if (m1.getKey().equals("nagarjuna")) {
                m1.setValue(1000);
            }
        }
        System.out.println(m);
        //{nagarjuna=1000,venkatesh=200,balaiah=800,chiranjeevi=100}
        // create a synchronized map
        Map<String, Integer> synmap = Collections.synchronizedMap(m);

        // printing the Collection
        System.out.println("Synchronized map is : "                + synmap);

        Map<String, Integer> m1 = new HashMap(m);
        System.out.println("map is : "                + m1);
    }
}

