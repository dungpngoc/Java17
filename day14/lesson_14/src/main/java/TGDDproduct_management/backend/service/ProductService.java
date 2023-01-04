package TGDDproduct_management.backend.service;

import TGDDproduct_management.backend.database.CartDB;
import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.repository.ProductRepository;
import TGDDproduct_management.backend.request.ProductRequest;


public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public void showProduct() {
        productRepository.findAll();
    }



    public boolean checkQuantity(int quantity) {
        for (Product product: ProductDB.products) {
            if (product.getQuantity() > quantity && quantity > 0) {
                return true;
            }
        }
        return false;
    }

    public Cart cart(String email, ProductRequest productRequest) {
        Cart cart = new Cart();
        for (Product product: ProductDB.products) {
            if (productRequest.getProductCode() == product.getProductCode()) {
                cart.setEmail(email);
                cart.setProductId(productRequest.getProductCode());
                cart.setProductName(product.getProductName());
                cart.setProductQuantity(productRequest.getQuantity());
            }
        }
        productRepository.cartSave(cart);
        return cart;
    }

    public void showCart(String email) {
        int count = 0;
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email)) {
                System.out.println(cart);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào trong giỏ hàng");
        }
    }

    public void totalCart(String email,ProductRequest productRequest) {
        int total = 0;
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email)) {
                for (Product product: ProductDB.products) {
                    if (product.getProductCode() == productRequest.getProductCode()) {
                        total += product.getPrice() * cart.getProductQuantity();
                    }
                }
            }
        }
        System.out.println("Tổng số tiền bạn phải thanh toán là : " + total);
    }
}
