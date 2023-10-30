package patterns.registery;


public class main {

    public static void main(String[] args) {
        CustomerRegistry.getInstance().addCustomer(new Customer("101", "Krishna"));
        CustomerRegistry.getInstance().addCustomer(new Customer("102", "Reddy"));

    }

}
