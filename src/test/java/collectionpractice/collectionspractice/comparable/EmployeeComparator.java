package collectionpractice.collectionspractice.comparable;

import java.util.Comparator;

class EmployeeComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Employee e1=(Employee)obj1;
        Employee e2=(Employee)obj2;
        String s1=e1.name;
        String s2=e2.name;
        return s1.compareTo(s2);
    }
}