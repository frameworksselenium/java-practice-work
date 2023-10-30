package collectionpractice.collectionspractice.set.linkedhasset;

import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet vv =new LinkedHashSet();
        vv.add(5);
        vv.add(10);
        vv.add(15);
        LinkedHashSet v=new LinkedHashSet();
        v.addAll(vv);
        v.add(null);
        v.add(5);
        v.add(10);
        v.add(15);
        v.add(20);
        v.add(25);

        System.out.println("hashcode : " + v.hashCode());

        System.out.println(v);
        for(Object s:v){
            System.out.println("foreach : " + s);

        }
        Iterator e=v.iterator();
        while(e.hasNext()) {
            Object i = e.next();
            System.out.println("Iterator : " + i);
        }
        v.retainAll(vv);
        System.out.println("removeall : " + v);
        //v.remove(20);
        //System.out.println("Iterator : " + v);
        //v.removeAll(vv);
        //System.out.println("removeall : " + v);

        Object[] s = v.toArray();
        for(Object ss:s){
            System.out.println("convert array : " + ss);
        }
        ArrayList dd = new ArrayList(v);
        Collections.sort(dd);
        System.out.println("sort : " + dd);
        Collections.reverse(dd);
        System.out.println("reverse array : " + dd);
        Collections.shuffle(dd);
        System.out.println("shuffle : " + dd);
        Collections.sort(dd, Collections.reverseOrder());
        System.out.println("reverse array : " + dd);
    }

}
