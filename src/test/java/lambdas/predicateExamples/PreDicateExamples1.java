package lambdas.predicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{

    String name;
    int sal;
    int exp;

    public Employee(String name, int sal, int exp) {
        this.name = name;
        this.sal = sal;
        this.exp = exp;
    }

}
public class PreDicateExamples1 {

    //will use predicate for conditional checks
    public static void main(String[] args) {

        Employee employee = new Employee("Krishna", 3000, 3);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Krishna", 3000, 3));
        arrayList.add(new Employee("Ram", 2500, 6));
        arrayList.add(new Employee("Vijay", 200, 2));
        arrayList.add(new Employee("Anu", 4000, 4));

        Predicate<Employee> emp = e->(e.sal>2000 && e.exp>5);

        System.out.println(emp.test(employee));

        for(Employee e:arrayList){
           if(emp.test(e)){
               System.out.println("Name : " + e.name + " Salary : " + e.sal);
           }
       }

    }

}
