package collectionpractice.collectionspractice.list.ArrayListPrac.collectionbasemethods;

import java.util.Comparator;

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rno - b.rno;
    }
}
