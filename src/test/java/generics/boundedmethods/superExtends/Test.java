package generics.boundedmethods.superExtends;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        Account account = new Account();
        CheckinAccount checkinAccount = new CheckinAccount();

        ArrayList<Account> arrayList = new ArrayList();
        arrayList.add(account);

        ArrayList<CheckinAccount> arrayList1 = new ArrayList();
        arrayList1.add(checkinAccount);

        Test test = new Test();
        test.returnAccounts(arrayList);
        test.returnAccounts(arrayList1);

    }

    public <T> void returnAccounts(ArrayList<? super CheckinAccount> t){
       for( Object ff:t){
           System.out.println(ff);
       }
    }
}
