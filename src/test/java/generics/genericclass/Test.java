package generics.genericclass;

public class Test {

    public static void main(String[] args)
    {
       Account<CurrentAccount> a1=new Account<>(new CurrentAccount("30"));
        a1.show();
        System.out.println(a1.getObject().getinterestRate());

        Account<CheckinAccount> a2=new Account<>(new CheckinAccount("40"));
        a2.show();
        System.out.println(a2.getObject().getinterestRate());

        Account<SavingsAccount> a3=new Account<>(new SavingsAccount("50"));
        a3.show();
        System.out.println(a3.getObject().getinterestRate());
    }
}
