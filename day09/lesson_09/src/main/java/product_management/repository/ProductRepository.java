package product_management.repository;

import product_management.database.ProductDB;
import product_management.model.Product;

import java.util.ArrayList;

public class ProductRepository {
    public ArrayList<Product> findProduct() {
        return ProductDB.products;
    }
}
