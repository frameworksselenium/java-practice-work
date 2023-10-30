package oops.inheritence.hasARelation.aggregation;

class Supplier {

    private String supplierName;
    private Address address;

    Supplier(Address address, String customerName){
        this.address = address;
        this.supplierName = customerName;
    }

    public String getCustomerName() {
        return supplierName;
    }

    public void setCustomerName(String customerName) {
        this.supplierName = customerName;
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