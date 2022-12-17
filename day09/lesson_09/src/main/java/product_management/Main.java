package product_management;

import product_management.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.run();
    }
}
