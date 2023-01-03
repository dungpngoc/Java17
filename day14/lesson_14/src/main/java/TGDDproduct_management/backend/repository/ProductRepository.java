package TGDDproduct_management.backend.repository;

import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.model.Product;

import java.util.List;

public class ProductRepository {

    public List<Product> findAll() {
        for (Product product: ProductDB.products) {
            System.out.println(product);
        }
        return ProductDB.products;
    }

}
