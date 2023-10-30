package oops.inheritence.hasARelation.aggregation;

class Customer {

    private String customerName;
    private Address address;

    Customer(Address address, String customerName){
        this.address = address;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStreet(){
        return address.getStreet();
    }
    public String getcity(){
        return address.getCity();
    }

    public String getstate(){
        return address.getState();
    }
    public String getcountry(){
        return address.getCountry();
    }

}