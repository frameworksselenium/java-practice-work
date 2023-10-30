package streams.practice.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExamples {

    public static void main(String[] ars){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list3 = Arrays.asList(11, 12, 13, 14, 15);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);

        List<Integer> resultsList = finalList.stream().flatMap((x)->x.stream()).collect(Collectors.toList());
        System.out.println("Final Results : " + resultsList);

        finalList.stream().flatMap((x)->x.stream().filter((n)->n%2==0)).forEach((nn)->System.out.println("After filter : " + nn));




        List<String> teamA = Arrays.asList("Krishna", "Chetan", "Sritan");
        List<String> teamB = Arrays.asList("Vijay", "Ani", "Bhavi");
        List<String> teamC = Arrays.asList("Ram", "Ranga", "Rajan");

        List<List<String>> team = new ArrayList<List<String>>();
        team.add(teamA);
        team.add(teamB);
        team.add(teamC);

        List<String> totalTeam = team.stream().flatMap((x)->x.stream()).collect(Collectors.toList());
        System.out.println("Final Team Members : " + totalTeam);

        team.stream().flatMap((x)->x.stream()).forEach((nn)->System.out.println("Team Member Names : " + nn));

    }
}
