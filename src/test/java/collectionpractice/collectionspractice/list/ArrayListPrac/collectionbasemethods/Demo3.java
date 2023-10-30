package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {

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
        System.out.println("Student object After revers Sorting : " + newarrayList);

        int[] arr = {44,33,22};
        newarrayList.add(Arrays.toString(arr));
        System.out.println("Student object After revers Sorting : " + newarrayList.toString());
    }

}
