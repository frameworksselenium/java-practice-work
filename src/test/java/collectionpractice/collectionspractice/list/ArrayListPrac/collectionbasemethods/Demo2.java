package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

    public static void main(String [] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add(44);
        arrayList.add(45);
        arrayList.add(43);
        System.out.println("Student object Before Sorting : " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Student object After Sorting : " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Student object After revers Sorting : " + arrayList);

        ArrayList newarrayList = new ArrayList();
        newarrayList.add("Krishna");
        newarrayList.add(45);
        newarrayList.add(33.3);
        newarrayList.add(33333337);
        newarrayList.addAll(arrayList);
        System.out.println("Student object After revers Sorting : " + newarrayList.toString());

    }

}
