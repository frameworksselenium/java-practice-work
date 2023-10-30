package oops.inheritence.hasARelation.aggregation;

public class Test {

    public static void main(String[] args){
        //Customer
        Address customerAddress = new Address("1023 Gardner Dr", "Alpharetta", "GA", "USA");
        Customer customer = new Customer(customerAddress, "Krishna Reddy Manubolu");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getStreet());
        System.out.println(customer.getcity());
        System.out.println(customer.getstate());
        System.out.println(customer.getcountry());

        //Supplier
        Address supplierAddress = new Address("2020 Gardner Dr", "Alpharetta", "GA", "USA");
        Supplier supplier = new Supplier(supplierAddress, "Anusha Mallela");
        System.out.println(supplier.getCustomerName());
        System.out.println(supplier.getStreet());
        System.out.println(supplier.getcity());
        System.out.println(supplier.getstate());
        System.out.println(supplier.getcountry());

    }

}