package TGDDproduct_management.backend.controller;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();
    public void showProduct() {
        productService.showProduct();
    }


    public Cart cart(String email, ProductRequest productRequest) {
        return productService.cart(email,productRequest);
    }

    public void showCart(String email) {
        productService.showCart(email);
    }

    public void totalCart(String email) {
        productService.totalCart(email);
    }

    public void deleteInCart(String email,int id) {
        productService.deleteInCart(email,id);
    }

    public void deleteByEmail(String email) {
        productService.deleteByEmail(email);
    }

    public boolean checkProduct(String productName) {
        return productService.checkProduct(productName);
    }

    public Product addNewProduct(Product product) {
        return productService.addNewProduct(product);
    }
}
