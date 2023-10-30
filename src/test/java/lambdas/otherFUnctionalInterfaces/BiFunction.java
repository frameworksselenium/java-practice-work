package lambdas.otherFUnctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiFunction {

    public static void main(String[] args) {

        List<Domain> domains = Arrays.asList(
                new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("u am .com", 0),
                new Domain("i am a hero.com", 2));

        BiPredicate<String, Integer> bi = (name, score) -> {
            return (name.startsWith("i") || score > 1);
        };

       for(Domain d:domains){

           if(bi.test(d.getName(), d.score)){
                System.out.println("Name : " + d.getName() + " score : " + d.score);
           }
       }

    }
}

class Domain {

    String name;
    Integer score;

    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
// getters , setters , toString
}
