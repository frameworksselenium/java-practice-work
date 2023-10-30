package patterns.builderPatternExmples;

public class Payload {

    //required parameters
    private String title;

    //optional parameters
    private String body;
    private String userId;


    public String gettitle() {
        return title;
    }

    public String getbody() {
        return body;
    }

    public String getuserId() {
        return userId;
    }


    private Payload(PayloadBuilder builder) {
        this.title = builder.title;
        this.body=builder.body;
        this.userId=builder.userId;
    }

    //Builder Class
    public static class PayloadBuilder{

        //required parameters
        private String title;

        //optional parameters
        private String body;
        private String userId;

        public PayloadBuilder(String title){
            this.title=title;
        }

        public PayloadBuilder setbody(String body) {
            this.body = body;
            return this;
        }

        public PayloadBuilder setuserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Payload build(){
            return new Payload(this);
        }

    }

}
