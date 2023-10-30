package streams.visa;

public class UserVisa {

    private String id;
    private String from_country;
    private String to_country;
    private String dob;
    private String first_name;
    private String las_name;
    private String customer_email;
    private String phone;
    private String comments;

    public UserVisa(String id, String from_country, String to_country, String dob, String first_name, String las_name, String customer_email, String phone, String comments) {
        this.id = id;
        this.from_country = from_country;
        this.to_country = to_country;
        this.dob = dob;
        this.first_name = first_name;
        this.las_name = las_name;
        this.customer_email = customer_email;
        this.phone = phone;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom_country() {
        return from_country;
    }

    public void setFrom_country(String from_country) {
        this.from_country = from_country;
    }

    public String getTo_country() {
        return to_country;
    }

    public void setTo_country(String to_country) {
        this.to_country = to_country;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLas_name() {
        return las_name;
    }

    public void setLas_name(String las_name) {
        this.las_name = las_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
