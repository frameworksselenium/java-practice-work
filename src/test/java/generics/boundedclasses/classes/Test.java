package generics.boundedclasses.classes;

public class Test {

    public static void main(String[] args)
    {
        Account<CheckinAccount> a1=new Account<>(new CheckinAccount(3));
        a1.show();
        a1.getObject().printCheckinAccountInterest();

        Account<CurrentAccount> a2=new Account<>(new CurrentAccount(4));
        a2.show();
        a2.getObject().printCurrentAccountInterest();

        Account<SavingsAccount> a3=new Account<>(new SavingsAccount(5));
        a3.show();
        a3.getObject().printSavingsAccountInterest();


        Account<Interest> a4=new Account<>(new CheckinAccount(3));
        a4.show();
        System.out.println(a4.getObject().claculateInterest(3,3));
    }
}
