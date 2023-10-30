package streams.visaFlatmap;

import streams.visa.CSVData;
import streams.visa.UserVisa;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args){

        CSVData csvData = new CSVData();
        ArrayList<HashMap<String, String>> arrayList = new ArrayList();

        for(int i=1; i<=102; i++) {
            String datarow = Integer.toString(i);
            HashMap<String, String> data = csvData.readData(datarow);
            HashMap<String, String> eachMember = new HashMap<>();
            eachMember.put("id", data.get("id"));
            eachMember.put("from_country", data.get("from_country"));
            eachMember.put("to_country", data.get("to_country"));
            eachMember.put("dob", data.get("dob"));
            eachMember.put("first_name", data.get("first_name"));
            eachMember.put("las_name", data.get("las_name"));
            eachMember.put("customer_email", data.get("customer_email"));
            eachMember.put("phone", data.get("phone"));
            eachMember.put("comments", data.get("comments"));

            arrayList.add(eachMember);
        }

        System.out.println("===============================================");
        arrayList.stream().flatMap((m)->m.values().stream()).forEach((s)->System.out.println(s));

    }

}
