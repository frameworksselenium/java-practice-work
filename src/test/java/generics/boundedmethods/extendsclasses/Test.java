package generics.boundedmethods.extendsclasses;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        Account account = new Account();
        CheckinAccount checkinAccount = new CheckinAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        ArrayList<Account> arrayList = new ArrayList();
        arrayList.add(account);

        ArrayList<CheckinAccount> arrayList1 = new ArrayList();
        arrayList1.add(checkinAccount);

        ArrayList<CurrentAccount> arrayList2 = new ArrayList();
        arrayList2.add(currentAccount);

        ArrayList<SavingsAccount> arrayList3 = new ArrayList();
        arrayList3.add(savingsAccount);

        Test test = new Test();
        test.returnAccounts(arrayList);
        test.returnAccounts(arrayList1);
        test.returnAccounts(arrayList2);
        test.returnAccounts(arrayList3);
    }

    public <T> void returnAccounts(ArrayList<? extends Account> t){
        for (Account dd:t) {
            dd.interest();
        }
    }
}
