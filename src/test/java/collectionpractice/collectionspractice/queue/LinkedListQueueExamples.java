package collectionpractice.collectionspractice.queue;

import java.util.LinkedList;

class LinkedListQueueExamples {
    public static void main(String[] args) {
        LinkedList q = new LinkedList();
        q.offer("A");
        q.offer('A');
        q.offer("L");
        q.offer(222.33);
        System.out.println(q);//[Z, B, L, A]
        q.offer(40);
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