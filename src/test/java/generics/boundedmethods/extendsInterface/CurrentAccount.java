package generics.boundedmethods.extendsInterface;


public class CurrentAccount implements Account {

    @Override
    public void interest() {
        System.out.println("this is CurrentAccount class interest 4%");
    }
}
