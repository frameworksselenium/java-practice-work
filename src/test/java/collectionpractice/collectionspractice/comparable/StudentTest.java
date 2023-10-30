package collectionpractice.collectionspractice.comparable;

import java.util.TreeSet;

public class StudentTest {

    public static void main(String[] args)
    {
        Student e1=new Student("nag",100,1005);
        Student e2=new Student("balaiah",200,1002);
        Student e3=new Student("chiru",50,1004);
        Student e4=new Student("venki",150,1003);
        Student e5=new Student("nag",100,1001);

        TreeSet t1 = new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);//[chiru----50, nag----100, venki----150, balaiah----200]
        TreeSet t2=new TreeSet(new StudentComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);
    }
}
