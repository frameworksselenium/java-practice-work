package generics.boundedclasses.interfaceexamples;

public class Test {

    public static void main(String[] args)
    {

        Account<CheckinAccount> a1=new Account<CheckinAccount>(new CheckinAccount());
        a1.show();
        System.out.println(a1.getObject().interest());

        Account<CurrentAccount> a2=new Account<CurrentAccount>(new CurrentAccount());
        a2.show();
        System.out.println(a2.getObject().interest());

        Account<SavingsAccount> a3=new Account<SavingsAccount>(new SavingsAccount());
        a3.show();
        System.out.println(a3.getObject().interest());
    }
}
