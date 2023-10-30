package oops.inheritence.hasARelation.composition;

import java.util.ArrayList;
import java.util.Scanner;

public class DetentionList {

    ArrayList<Detention> detentionArrayList = new ArrayList<Detention>();
    Scanner input = new Scanner(System.in);

    public void addDetention(Detention detention)    {
        detentionArrayList.add(detention);
    }

    public void deleteDetention()
    {
        System.out.println("Which student detention do u what to delete: ");
        int num = Integer.parseInt(input.nextLine());
        detentionArrayList.remove(num);
    }

    public void addDetentionFromConsole(){
        String n;
        String o;
        String d;

        System.out.println("Please Enter Student Name: ");
        n = input.nextLine();

        System.out.println("Please Enter Student offence: ");
        o = input.nextLine();

        System.out.println("Please Enter Student date: ");
        d = input.nextLine();
        Detention detention = new Detention(n, o, d);
        detentionArrayList.add(detention);

    }

    @Override
    public String toString() {
        String outPut = "";
        for(int i=0; i<detentionArrayList.size(); i++){
            outPut += detentionArrayList.get(i).toString() + "\n----------------------\n";
        }
        return outPut;
    }
}
