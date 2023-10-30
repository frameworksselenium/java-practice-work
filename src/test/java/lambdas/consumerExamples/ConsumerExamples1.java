package lambdas.consumerExamples;

import java.util.ArrayList;
import java.util.function.Consumer;
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

public class ConsumerExamples1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Krishna", 1000));
        employees.add(new Employee("Ram", 3000));
        employees.add(new Employee("Anu", 4000));
        employees.add(new Employee("Sri", 5000));
        employees.add(new Employee("Che", 6000));

        Function<Employee, Integer> bonus = (a)->{return a.sal*10/100;};

        Predicate<Integer> pre = (i)->i>500;

        Consumer<Employee> c = (emp)->System.out.println("Name : " + emp.name + " salary : " + emp.sal);

        for(Employee n:employees){
            int bonu = bonus.apply(n);
            if(pre.test(bonu)) {
                c.accept(n);
                System.out.println("Bonus : " + bonu);
            }
        }
    }

}
