package generics.boundedmethods.extendsInterface;

public class CheckinAccount implements Account {

    @Override
    public void interest() {
        System.out.println("this is CheckinAccount class interest 3%");
    }


}
