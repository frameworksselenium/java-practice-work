package generics.boundedmethods.extendsInterface;


public class SavingsAccount implements Account {
    @Override
    public void interest() {
        System.out.println("this is SavingsAccount class interest 5%");
    }
}
