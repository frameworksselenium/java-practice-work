package collectionpractice.collectionspractice.list.linkedlisrprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Demo2 {

    public static void main(String [] args){

        LinkedList arrayList = new LinkedList();
        arrayList.add(44);
        arrayList.add(45);
        arrayList.add(43);
        System.out.println("Student object Before Sorting : " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Student object After Sorting : " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Student object After revers Sorting : " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("Student object After revers Sorting : " + arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Student object After revers Sorting : " + arrayList);

        ArrayList newarrayList = new ArrayList();
        newarrayList.add("Krishna");
        newarrayList.add(45);
        newarrayList.add(33.3);
        newarrayList.add(33333337);
        newarrayList.addAll(arrayList);
        System.out.println("Student object After revers Sorting : " + newarrayList.toString());
        System.out.println("Student object After revers Sorting : " + newarrayList.containsAll(arrayList));
        //newarrayList.removeAll(arrayList);
        newarrayList.retainAll(arrayList);
        System.out.println("Student object After revers Sorting : " + newarrayList.toString());

        System.out.println("Student object After revers Sorting : " + newarrayList.containsAll(arrayList));
        System.out.println("Student object After revers Sorting : " + newarrayList.contains(45));
        System.out.println("Student object After revers Sorting : " + newarrayList.isEmpty());

        Object[] conaArray = newarrayList.toArray();
        System.out.println("Student object : " + Arrays.toString(conaArray));

        for(Object o:conaArray){
            System.out.println("foreach:" + o);
        }

        for(int i=0; i<conaArray.length; i++){
            System.out.println("for:" + conaArray[i]);
        }

    }

}
