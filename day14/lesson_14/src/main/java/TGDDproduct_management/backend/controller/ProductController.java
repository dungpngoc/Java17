package TGDDproduct_management.backend.controller;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.service.ProductService;

import java.util.List;
import java.util.Random;

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

    public void cart(String email, int productCode, int quantity ) {
        productService.cart(email,productCode,quantity);
    }

    public void cart1(String email, int productCode, int quantity) {
        productService.cart1(email,productCode,quantity);
    }

    public void changeQuantyti(String email, int productCode, int productQuantity) {
        productService.changeQuantity(email,productCode,productQuantity);
    }

    public boolean checkDataCart1(String email, int productCode) {
        return productService.checkDataCart1(email,productCode);
    }

    public boolean checkQR(int rdQR1, int qr) {
        return productService.checkQR(rdQR1,qr);
    }

    public boolean checkProductQuantity(int productCode, int quantity) {
        return productService.checkProductQuantity(productCode, quantity);
    }

    public boolean checkProductCode(int productCode) {
        return productService.checkProductCode(productCode);
    }

    public boolean checkProductCode1(int productCode) {
        return productService.checkProductCode1(productCode);
    }

    public void updateQuantity(int proDuctCode, int quantity) {
        productService.updateQuantity(proDuctCode,quantity);
    }

//    public void setProductQuantity(String email) {
//        productService.setProductQuantity(email);
//    }
//
//    public List<Cart> listCartByEmail(String email) {
//        return productService.listCartByEmail(email);
//    }
}
