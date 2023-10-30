package collectionpractice.collectionspractice.list.linkedlisrprac;

import java.util.Collections;
import java.util.LinkedList;

public class Demo0 {

    public static void main(String [] args){

        Student1 student1 = new Student1("Krishna",45,101);
        Student1 student2 = new Student1("Ram",44,102);
        Student1 student3 = new Student1("Anu",39,103);

        LinkedList<Student1> list = new LinkedList<>();
        list.add(student3);
        list.add(student1);
        list.add(student2);

        System.out.println("Student object Before Sorting : " + list);
        Collections.sort(list, new Sortbyroll1());
        System.out.println("Student object After Sorting : " + list);
        Collections.reverse(list);
        System.out.println("Student object After Sorting : " + list);
        Collections.shuffle(list);
        System.out.println("Student object After Sorting : " + list);


        Collections.sort(list, new Sortbyroll1().reversed());
        System.out.println("Student object After Sorting : " + list);
        Collections.shuffle(list);
        System.out.println("Student object After Sorting : " + list);
        Collections.sort(list, Collections.reverseOrder(new Sortbyroll1()));
        System.out.println("Student object After Sorting : " + list);
    }
}
