package csvreader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class CSVReader {

    public static void main(String[] args){

        HashMap<String, String> data = readData("C:\\Automation\\WorkSpace\\java-practice-work\\src\\main\\resources\\user_visa.csv", "3");
    }

    public static HashMap readData(String csvFileName, String testCaseID){

        HashMap<Integer, String> data = new LinkedHashMap();
        HashMap<String, String> data1 = new LinkedHashMap();
        int counter = 1;
        String valueName = null;
        try{
            String filePath = csvFileName;
            Reader in = new FileReader(filePath);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
           
            for(Iterator var2 = records.iterator(); var2.hasNext(); ++counter){
                CSVRecord record = (CSVRecord)var2.next();
                int j;
                if(counter == 1){
                    for(j = 0; j < record.size();++j){
                        data.put(j,record.get(j));
                    }
                }
                if(testCaseID.equalsIgnoreCase(record.get(0))){
                    for(j = 0; j < data.size();++j){
                        try{
                            if(record.get(j).trim().startsWith("#")){
                                valueName = record.get(j).substring(1);
                                data1.put(data.get(j),valueName);
                            }else{
                                data1.put(data.get(j),record.get(j));
                            }
                        }catch(Exception var3){
                            data.put(j, (String)null);
                        }
                    }
                }
            }
        } catch(IOException val1){

        }
        return data1;
    }

}
