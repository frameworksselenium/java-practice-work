package collectionpractice.collectionspractice.list.linkedlisrprac;

import java.util.Comparator;

class Sortbyroll1 implements Comparator<Student1> {
    public int compare(Student1 a, Student1 b) {
        return a.rno - b.rno;
    }
}
