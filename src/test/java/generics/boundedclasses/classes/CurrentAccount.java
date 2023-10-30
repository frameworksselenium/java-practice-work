package generics.boundedclasses.classes;

public class CurrentAccount extends Interest {
    private int baserate;
    private int accountspecificrate;

    public  CurrentAccount(int accountspecificrate) {
        this.baserate = 4;
        this.accountspecificrate = accountspecificrate;
    }

    @Override
    public int claculateInterest(int baserate, int accountspecificrate) {
        return baserate * accountspecificrate;
    }

    public void printCurrentAccountInterest(){
        int accountspecificClalculatedInterest = claculateInterest(baserate, accountspecificrate);
        System.out.println("Current Account Interest : " + accountspecificClalculatedInterest);
    }

}
