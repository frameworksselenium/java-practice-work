package generics.genericmethods;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        //================================Generic Class Examples===========================
        Integer[] intvalues = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        GenericClassAccount<Integer> account1 = new GenericClassAccount<>(intvalues);
        Integer[] val = account1.getAccountName();
        account1.printArrayElements(val);

        String[] stringaccount = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        GenericClassAccount<String> account2 = new GenericClassAccount<>(stringaccount);
        String[] str = account2.getAccountName();
        account2.printArrayElements(str);

        //================================Non Generic Class Examples===========================
        NonGenericClassAccount account3 = new NonGenericClassAccount();
        account3.printArrayElements(val);

        NonGenericClassAccount account4 = new NonGenericClassAccount();
        account4.printArrayElements(str);

        ArrayList<String> l=new ArrayList<String>();
        l.add("A");
        nonGenericMethod(l);
        System.out.println(l);//[A, 10, 10.5, true]

        ArrayList ll =new ArrayList();
        ll.add("A");
        ll.add(33);
        genericMethod(ll);
        System.out.println(ll);//[A, 33, Ram, Raj]
    }

    public static void nonGenericMethod(ArrayList l) {
        l.add(10);
        l.add(10.5);
        l.add(true);
    }


    public static void genericMethod(ArrayList<String> l) {
        l.add("Ram");
        l.add("Raj");
    }

}



