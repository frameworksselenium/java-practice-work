package generics.genericclass;

public class CurrentAccount {

    private String interestRate;

    public CurrentAccount(String interestRate){
        this.interestRate = interestRate;
    }

    public String getinterestRate() {
        return interestRate;
    }

    public void setinterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
}
