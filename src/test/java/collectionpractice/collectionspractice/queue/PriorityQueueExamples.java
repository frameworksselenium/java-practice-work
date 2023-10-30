package collectionpractice.collectionspractice.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueExamples
{
    public static void main(String[] args)
    {
        PriorityQueue q=new PriorityQueue();
        //PriorityQueue q=new PriorityQueue(15,new MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);//[Z, B, L, A]
        q.offer("C");
        System.out.println(q);//[Z, B, L, A]
        System.out.println(q.poll());//[Z, B, L, A]
        System.out.println(q);
        System.out.println(q.remove());//[Z, B, L, A]
        System.out.println(q);
        System.out.println(q.peek());//[Z, B, L, A]
        System.out.println(q);
        System.out.println(q.element());//[Z, B, L, A]
        System.out.println(q);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=(String)obj1;
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}