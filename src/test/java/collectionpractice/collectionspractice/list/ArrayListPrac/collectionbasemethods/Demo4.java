package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo4 {

    public static void main(String [] args){

        Student student1 = new Student("Krishna",45,101);
        Student student3 = new Student("Anu",39,103);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student3);
        list.add(student1);

        ArrayList newarrayList = new ArrayList();
        newarrayList.add("Krishna");
        newarrayList.add(45);
        newarrayList.add(33.3);
        newarrayList.add(33333337);
        newarrayList.addAll(list);
        System.out.println("Student object before : " + newarrayList);
        Iterator it = newarrayList.iterator();
        while (it.hasNext()){
            Object val = it.next();
            System.out.println("Iterator:" + val);
        }


        int[] arr = {44,33,22};
        newarrayList.add(Arrays.toString(arr));
        System.out.println("Student object After added object to existing : " + newarrayList.toString());
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
