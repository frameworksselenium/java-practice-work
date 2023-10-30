package streams.sample;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        Person b  = new Person();

        b.setName("Jay");
        b.setAge(30);
        b.setCity("Fairfax");
        b.setGender('M');

        Address home = new Address();
        home.setState("VA");
        home.setAddress1("Home");
        home.setCity("Fairfax");
        home.setAddress2("Office");


        Address office = new Address();
        office.setState(null);
        office.setAddress1("School");
        office.setCity("Centrevill");
        office.setAddress2("Office");

        Address work = new Address();
        work.setState("CA");
        work.setAddress1("Home");
        work.setCity("Chantilly");
        work.setAddress2("Office");

        List<Address> addresses = new ArrayList<>();
        addresses.add(home);
        addresses.add(office);
        addresses.add(work);


        b.setAddresses(addresses);



        String dd = b.getName();
        int ddd = b.getAddresses().size();
        for(Address ad:addresses){
            if (ad.getState() != null){
                System.out.println("City Name " + ad.getCity());
            }
        }

//		addresses.removeIf(a -> a.getState()!= "VA");
        String result = "";
//		addresses.stream()
//			.filter(a -> a.getState().equals("VA"))
//			.forEach(c -> System.out.println(c.getAddress1()));

        addresses.stream()
                //.filter(a -> Objects.nonNull(a.getState()))
                .filter(a -> a.getState()!= null)
                .filter(a -> a.getState().equals("VA"))
                .forEach(c -> System.out.println(c.getAddress1() + "---" + c.getCity()));


    }

}
