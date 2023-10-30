package streams.visa;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ParallelStreamsTest1 {

    public static void main(String[] args){

        CSVData csvData = new CSVData();
        ArrayList<UserVisa> arrayList = new ArrayList();
        for(int i=1; i<=100; i++) {
            String datarow = Integer.toString(i);
            HashMap<String, String> data = csvData.readData(datarow);
            String id = data.get("id");
            String from_country = data.get("from_country");
            String to_country = data.get("to_country");
            String dob = data.get("dob");
            String first_name = data.get("first_name");
            String las_name = data.get("las_name");
            String customer_email = data.get("customer_email");
            String phone = data.get("phone");
            String comments = data.get("comments");

            arrayList.add(new UserVisa(id, from_country, to_country, dob, first_name, las_name, customer_email, phone, comments));
        }
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        System.out.println("Normal Stream Start Time" + ts);

        arrayList.stream().forEach((a)->System.out.println("ID : " + a.getId()
                + " First Name : " + a.getFirst_name()));
        Date date1 = new Date();
        Timestamp ts1=new Timestamp(date1.getTime());
        System.out.println("Normal Stream End Time" + ts1);

        Date date2 = new Date();
        Timestamp ts2=new Timestamp(date2.getTime());
        System.out.println("Parallel Stream Start Time" + ts2);
        arrayList.parallelStream().forEach((a)->System.out.println("ID : " + a.getId()
                + " First Name : " + a.getFirst_name()));
        Date date3 = new Date();
        Timestamp ts3=new Timestamp(date3.getTime());
        System.out.println("Parallel Stream End Time" + ts3);

    }

}
