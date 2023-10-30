package generics.boundedmethods.extendsclasses;


public class CurrentAccount extends Account {

    @Override
    public void interest() {
        System.out.println("this is CurrentAccount class interest 4%");
    }
}
