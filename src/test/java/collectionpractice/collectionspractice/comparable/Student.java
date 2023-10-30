package collectionpractice.collectionspractice.comparable;

class Student implements Comparable{

    int rno;
    String name;

    Student(String name, int age, int rno) {
        this.name = name;
        this.rno = rno;
    }

    @Override
    public String toString()
    {
        return name+"----"+rno;
    }

    @Override
    public int compareTo(Object o) {

        int rno1 = this.rno;
        int rno2 = ((Student)o).rno;
        if(rno1 < rno2) {
            return -1;
        } else if(rno1 > rno2) {
            return 1;
        } else {
            return 0;
        }
    }
}
