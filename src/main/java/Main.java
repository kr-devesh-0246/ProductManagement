import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        ProductService service = new ProductService();

//        hey service, add the product
//      As the data is inserted into db once. We comment it to prevent multiple insertions.
        /*service.addProduct(new Product("Lenovo", "Laptop", "Brown Table", 2025));
        service.addProduct(new Product("HP Keyboard", "KeyBoard", "Cupboard", 2023));
        service.addProduct(new Product("Type C", "Cable", "Brown Table", 2024));
        service.addProduct(new Product("JBL GO(old)", "Speaker", "Brown Table", 2021));
        service.addProduct(new Product("JBL GO(new)", "Speaker", "Brown Table", 2020));
        service.addProduct(new Product("JBL GO2", "Speaker", "Brown Table", 2020));
        service.addProduct(new Product("Dell", "Laptop", "Undesignated", 2022));
        service.addProduct(new Product("Phone Stand", "Accessory", "Brown Table", 2052));*/

        List<Product> products = service.getAllProducts();
//        System.out.println(products);
        for(Product p : products){
            System.out.println(p);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Get specific product details");

        Product p = service.getProduct("HP Keyboard");
        System.out.println(p);

        // assign 1: Get a method to find out all the products at a particular place
        // assign 2: Get list of products who are out of warranty

//        System.out.println("--------------------------------------------------------------------------------");
//        System.out.println("A particular text");
//
//        List<Product> prods = service.getProductsWithText("Brown");
//        System.out.println(prods);
//        to get line by line list of products

//        for(Product prd : products){
//            System.out.println(prd);
//        }

        // assign3: Search Convert the getAllProduc.... method using a streamAPI.
        // assign4: Convert getProduct(String name) so that data is fetched from the database




    }

}