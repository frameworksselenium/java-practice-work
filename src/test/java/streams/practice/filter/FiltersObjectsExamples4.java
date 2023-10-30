package streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class FiltersObjectsExamples4 {

    public static void main(String [] args){

        List<Product> products = Arrays.asList(
                new Product(101, "Sony Laptop", 333.33),
                new Product(102, "Dell Laptop", 444.44),
                new Product(103, "Mac Laptop", 555.55),
                new Product(103, "Microsoft Laptop", 666.66)
                );

        List<Product> filteredProducts = new ArrayList<Product>();

        //filter and print
        products.stream().filter((n)->n.price>400).forEach((n)->System.out.println("filter and print : " + n.price));


        //==========================================================================================================


        List<Product> products1 = new ArrayList<>();
        products1.add(new Product(101, "Sony Laptop", 333.33));
        products1.add(new Product(102, "Dell Laptop", 444.44));
        products1.add(new Product(103, "Mac Laptop", 555.55));
        products1.add(new Product(103, "Microsoft Laptop", 666.66));

        List<Product> filteredProducts1 = new ArrayList<Product>();

        //filter and print
        products1.stream().filter((n)->n.price>400).forEach((n)->System.out.println("filter and print : " + n.price));


    }
}
