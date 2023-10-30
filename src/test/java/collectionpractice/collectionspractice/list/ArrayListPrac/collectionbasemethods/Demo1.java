package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

    public static void main(String [] args){

        Student student1 = new Student("Krishna",45,101);
        Student student2 = new Student("Ram",44,102);
        Student student3 = new Student("Anu",39,103);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student3);
        list.add(student1);
        list.add(student2);
        list.add(student1);
        System.out.println("Student object Before Sorting : " + list);
        Collections.sort(list, new Sortbyroll());
        System.out.println("Student object After Sorting : " + list);
        Collections.sort(list, new Sortbyroll().reversed());
        System.out.println("Student object After Sorting : " + list);
    }
}
