package generics.boundedmethods.extendsclasses;


public class SavingsAccount extends Account {
    @Override
    public void interest() {
        System.out.println("this is SavingsAccount class interest 5%");
    }
}
