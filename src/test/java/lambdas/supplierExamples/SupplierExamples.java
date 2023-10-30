package lambdas.supplierExamples;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExamples {

    public static void main(String[] args) {

        Supplier<Date> s1 = ()->new Date();
        System.out.println(s1.get());

    }

}
