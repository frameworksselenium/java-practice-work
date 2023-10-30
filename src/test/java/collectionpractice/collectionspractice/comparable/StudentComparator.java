package collectionpractice.collectionspractice.comparable;

import java.util.Comparator;

class StudentComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Student e1=(Student)obj1;
        Student e2=(Student)obj2;
        String s1=e1.name;
        String s2=e2.name;
        return s1.compareTo(s2);
    }
}