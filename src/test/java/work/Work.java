package work;

public class Work {

    public static void main(String[] args){

        String date = "06/02/2022";


        String[] splitdatw = date.split("/");


        String month = splitdatw[0].substring(0,1);
        String day = splitdatw[1].substring(0,1);


        if(month.equals("0")){
             month = splitdatw[0].substring(1,2);
        }
        if(day.equals("0")){
             day = splitdatw[1].substring(1,2);
        }

        System.out.println(month + "/" + day );

    }
}
