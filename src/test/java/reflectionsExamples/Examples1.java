package reflectionsExamples;

public class Examples1 {

    public static void main(String [] args) throws ClassNotFoundException {

        Class<?> classObj = Student.class;

        Class<?> classObj1 = Class.forName("reflectionsExamples.Student");

        classObj1.getName();
        classObj1.getSimpleName();
        //Class<?> classObj2 = Class.forName();

    }
}
