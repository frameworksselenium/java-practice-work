package generics.boundedclasses.classes;

public class SavingsAccount extends Interest {
    private int baserate;
    private int accountspecificrate;

    public  SavingsAccount(int accountspecificrate) {
        this.baserate = 5;
        this.accountspecificrate = accountspecificrate;
    }

    @Override
    public int claculateInterest(int baserate, int accountspecificrate) {
        return baserate * accountspecificrate;
    }

    public void printSavingsAccountInterest(){
        int accountspecificClalculatedInterest = claculateInterest(baserate, accountspecificrate);
        System.out.println("Savings Account Interest : " + accountspecificClalculatedInterest);
    }

}
