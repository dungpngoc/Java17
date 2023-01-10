package TGDDproduct_management.backend.repository;

import TGDDproduct_management.backend.database.CartDB;
import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;
public class ProductRepository {
    public void findAll() {
        System.out.printf("%-12s | %-21s | %-12s | %-10s | %-10s | %-11s |%n",
                "Mã sản phẩm", "Tên sản phẩm", "Hệ Điều Hành", "Giá", "Hãng", "Loại máy" );
        for (Product product: ProductDB.products) {
            System.out.printf("%-12d | %-21s | %-12s | %-10d | %-10s | %-11s |%n",product.getProductCode(),product.getProductName(),
                    product.getDescription(),product.getPrice(),product.getBrand(),product.getCategories());
        }
    }


    public void cartSave(Cart cart) {
        CartDB.carts.add(cart);
        FileUtils.setDataToFile("cart.json", CartDB.carts);
    }

    public void productSave(Product product1) {
        ProductDB.products.add(product1);
        FileUtils.setDataToFile("list-product.json", ProductDB.products);
    }

    public void saveById(List<Product> products) {
        FileUtils.setDataToFile("list-product.json", products);
    }
}
