package collectionpractice.collectionspractice.list.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Demo {

        public static void main(String args[]) {
            Stack<Integer> st = new Stack<Integer>();
            st.push(34);
            st.push(34);
            st.push(56);
            st.push(70);
            System.out.println("stack: " + st);
            System.out.println("pop: " + st.empty());
            System.out.println("peek: " + st.peek());
            System.out.println("pop: " + st);
            //System.out.println("peek: " + st.pop());
            //System.out.println("pop: " + st);

            System.out.println("peek: " + st.search(56));
        }

}
