package TGDDproduct_management.backend.controller;

import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();
    public void showProduct() {
        productService.showProduct();
    }

    public boolean getProductById(int id, int quantity) {
        return productService.getProductById(id,quantity);
    }

    public boolean checkQuantity(int quantity) {
        return productService.checkQuantity(quantity);
    }

    public void cart(ProductRequest productRequest) {
        productService.cart(productRequest);
    }
}
