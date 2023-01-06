package TGDDproduct_management.backend.controller;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.service.ProductService;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();
    public void showProduct() {
        productService.showProduct();
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

    public void deleteById(int productCode) {
        productService.deleteById(productCode);
    }

    public void updatePrice(int productCode, int newPrice) {
        productService.updatePrice(productCode,newPrice);
    }

    public boolean checkDataCart(String email) {
        return productService.checkDataCart(email);
    }

    public void cart(String email,int productCode, int quantity ) {
        productService.cart(email,productCode,quantity);
    }

    public void cart1(String email, int productCode, int quantity) {
        productService.cart1(email,productCode,quantity);
    }
}
