package generics.genericclass;

public class SavingsAccount {
    private String interestRate;

    public SavingsAccount(String interestRate){
        this.interestRate = interestRate;
    }

    public String getinterestRate() {
        return interestRate;
    }

    public void setinterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

}
