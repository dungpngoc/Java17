package TGDDproduct_management.backend.repository;

import TGDDproduct_management.backend.database.CartDB;
import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;

public class ProductRepository {

    public List<Product> findAll() {
        for (Product product: ProductDB.products) {
            System.out.println(product);
        }
        return ProductDB.products;
    }

    public void cartSave(Cart cart) {
        CartDB.carts.add(cart);
        FileUtils.setDataToFile("cart.json", CartDB.carts);
    }

    public void productSave(Product product1) {
        ProductDB.products.add(product1);
        FileUtils.setDataToFile("list-product.json", ProductDB.products);
    }
}
