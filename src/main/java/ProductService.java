import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ProductService {
    // to store the products
    List<Product> products = new ArrayList<>();
    ProductDB db;

    {
        db = new ProductDB();
    }

    public void addProduct(Product p) throws SQLException {

//        products.add(p);
        db.save(p);
    }


    public List<Product> getAllProducts() {
//        return products; // for console
        return db.getAll();
    }
    public Product getProduct(String name) {

        for(Product p : products) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductsWithText(String text) {

        String str = text.toLowerCase();

        List<Product> prods = new ArrayList<>();

        for(Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str)) {
                prods.add(p);
            }
        }
        return prods;
    }
}
