package streams.practice.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String name;
    int salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class MapObjectsExamples {

    public static void main(String [] args){

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Krishna", 333),
                new Employee(102, "Ram", 444),
                new Employee(103, "Raja", 555),
                new Employee(103, "Ranga", 666)
                );

        //fetch the salary whoes salary is greather than the 400 and print
        List<Integer> filteredEmployees = employees.stream().filter((n)->n.salary>400).map((e)->e.salary).collect(Collectors.toList());
        System.out.println(filteredEmployees);

    }
}
