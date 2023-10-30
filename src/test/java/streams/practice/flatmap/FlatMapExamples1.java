package streams.practice.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student{
    String name;
    int rollno;
    String grade;

    public Student(String name, int rollno, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }
}
public class FlatMapExamples1 {

    public static void main(String[] ars){

       List<Student> list1 = new ArrayList<>();
       list1.add(new Student("Krishna", 101, "A"));
       list1.add(new Student("Ram", 102, "B"));
       list1.add(new Student("Ranga", 103, "A"));


        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Raju", 104, "A"));
        list2.add(new Student("Ramu", 105, "B"));
        list2.add(new Student("Rajan", 106, "A"));

        List<List<Student>> studentList = Arrays.asList(list1, list2);

        //=================================================================
        List<String> studentNames = studentList.stream().flatMap((stu)->stu.stream()).map(s->s.name).collect(Collectors.toList());
        System.out.println(studentNames);
        //=================================================================
        studentList.stream().flatMap((stu)->stu.stream()).map(s->s.name).forEach((ss)->System.out.println(ss));
        //=================================================================
        studentList.stream().flatMap((stu)->stu.stream()).forEach((s)->System.out.println(s.name));

    }
}
