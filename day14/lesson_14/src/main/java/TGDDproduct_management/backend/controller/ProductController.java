package TGDDproduct_management.backend.controller;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();
    public void showProduct() {
        productService.showProduct();
    }


    public boolean checkQuantity(int quantity) {
        return productService.checkQuantity(quantity);
    }

    public Cart cart(String email, ProductRequest productRequest) {
        return productService.cart(email,productRequest);
    }

    public void showCart(String email) {
        productService.showCart(email);
    }

    public void totalCart(String email,ProductRequest productRequest) {
        productService.totalCart(email,productRequest);
    }
}
