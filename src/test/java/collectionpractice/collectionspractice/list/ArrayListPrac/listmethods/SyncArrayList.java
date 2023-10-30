package collectionpractice.collectionspractice.list.ArrayListPrac.listmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SyncArrayList {

    public static void main(String [] args){

        ArrayList list = new ArrayList();
        list.add(40);
        list.add(45);
        list.add(40);
        list.add("");
        list.add(45);
        list.add(60);
        list.add(" ");

        List synclist = Collections.synchronizedList(list);
        ListIterator it = synclist.listIterator();
        while (it.hasNext()){
            Object dd = it.next();
            System.out.println(dd);
        }

    }

}
