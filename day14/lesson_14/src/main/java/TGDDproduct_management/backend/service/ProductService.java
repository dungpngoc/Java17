package TGDDproduct_management.backend.service;

import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.repository.ProductRepository;
import TGDDproduct_management.backend.request.ProductRequest;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public void showProduct() {
        productRepository.findAll();
    }

    public boolean getProductById(int id, int quantity) {
        for (Product product : ProductDB.products) {
            if (product.getProductCode() == id && quantity < product.quantity) {
                System.out.println("Bạn đã chọn " + quantity + " sản phẩm " + product.getProductName()
                + " tổng số tiền phải thanh toán là : " + product.getPrice() * quantity);
                return true;
            }
        } throw new NotFoundException("Không tìm thấy id hoặc số lượng vượt quá số lượng trong kho");
    }

    public boolean checkQuantity(int quantity) {
        for (Product product: ProductDB.products) {
            if (product.getQuantity() > quantity && quantity > 0) {
                return true;
            }
        }
        return false;
    }

    public void cart(ProductRequest productRequest) {
        List<ProductRequest> cartList = new ArrayList<>();
        cartList.add(productRequest);
    }
}
