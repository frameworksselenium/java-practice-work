package lambdas.staticMethodInstanceMethodConstructorRference.ContructorReference;

    interface StrudentInterface{
        Student get(String name, int rollno, int marks, int age);
    }
    class Student{
        String name;
        int rollno;
        int marks;
        int age;

        Student(String name, int rollno, int marks, int age){
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
            this.age = age;
        }
    }
    public class ConstructorReference {

        public static void main(String[] args) {

            StrudentInterface i = Student::new;
            Student s1 = i.get("Krishna", 101, 500, 33);
            Student s2 = i.get("Krishna1", 102, 5000, 36);
            System.out.println(s1.name);
            System.out.println(s2.name);
        }
    }
