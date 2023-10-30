package generics.boundedclasses.classes;

public class CheckinAccount extends Interest {

    private int baserate;
    private int accountspecificrate;

    public  CheckinAccount(int accountspecificrate) {
        this.baserate = 3;
        this.accountspecificrate = accountspecificrate;
    }

    @Override
    public int claculateInterest(int baserate, int accountspecificrate) {
        return baserate * accountspecificrate;
    }

    public void printCheckinAccountInterest(){
        int accountspecificClalculatedInterest = claculateInterest(baserate, accountspecificrate);
        System.out.println("Checkin Account Interest : " + accountspecificClalculatedInterest);
    }

}
