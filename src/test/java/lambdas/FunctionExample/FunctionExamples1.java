package lambdas.FunctionExample;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }
}
public class FunctionExamples1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Krishna", 1000));
        employees.add(new Employee("Ram", 3000));
        employees.add(new Employee("Anu", 4000));
        employees.add(new Employee("Sri", 5000));
        employees.add(new Employee("Che", 6000));

        Function<Employee, Integer> bonus = (a)->{
            if(a.sal > 1000 && a.sal<2000){
                return a.sal*30/100;
            }else if(a.sal > 2000 && a.sal<4000){
                return a.sal*20/100;
            }else{
                return a.sal*10/100;
            }
        };

        Predicate<Integer> pre = (i)->i>500;

        for(Employee n:employees){
            int bonu = bonus.apply(n);
            if(pre.test(bonu)) {
                System.out.println("Name : " + n.name + " Sal :" + n.sal + " Bonus : " + bonu);
            }
        }
    }

}
