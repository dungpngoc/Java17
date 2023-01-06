package TGDDproduct_management.backend.service;

import TGDDproduct_management.backend.database.CartDB;
import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.repository.ProductRepository;
import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.utils.FileUtils;

import java.text.DecimalFormat;
import java.util.List;


public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public void showProduct() {
        productRepository.findAll();
    }


    public Cart cart(String email, ProductRequest productRequest) {
        for (int i = 0; i < CartDB.carts.size(); i++) {
            if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() == productRequest.getProductCode()) {
                int setQuantity = productRequest.getQuantity() + CartDB.carts.get(i).getProductQuantity();
                CartDB.carts.get(i).setProductQuantity(setQuantity);
                FileUtils.setDataToFile("cart.json", CartDB.carts);
                System.out.println("Đã cho vào giỏ hàng, hãy chọn thêm sản phẩm");
                return CartDB.carts.get(i);
            } else if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() != productRequest.getProductCode()) {
                for (Product product: ProductDB.products) {
                    Cart cart = new Cart();
                    if (productRequest.getProductCode() == product.getProductCode()) {
                        cart.setEmail(email);
                        cart.setProductId(productRequest.getProductCode());
                        cart.setProductName(product.getProductName());
                        cart.setProductQuantity(productRequest.getQuantity());
                        productRepository.cartSave(cart);
                        System.out.println("Đã cho vào giỏ hàng, hãy chọn thêm sản phẩm");
                        return cart;
                    }
                }
            } else if (CartDB.carts.get(i).getEmail() != email) {
                for (Product product: ProductDB.products) {
                    Cart cart = new Cart();
                    if (productRequest.getProductCode() == product.getProductCode()) {
                        cart.setEmail(email);
                        cart.setProductId(productRequest.getProductCode());
                        cart.setProductName(product.getProductName());
                        cart.setProductQuantity(productRequest.getQuantity());
                        productRepository.cartSave(cart);
                        System.out.println("Đã cho vào giỏ hàng, hãy chọn thêm sản phẩm");
                        return cart;
                    }
                }
            }
        }
        throw new NotFoundException("Không tìm thấy sản phẩm có id " + productRequest.getProductCode());
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

    public static String formatMoney(long price) {
        DecimalFormat formatter = new DecimalFormat("###,###,### VND");
        return formatter.format(price);
    }
    public void totalCart(String email) {
        int total = 0;
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email)) {
                for (Product product: ProductDB.products) {
                    if (product.getProductCode() == cart.getProductId()) {
                        total += product.getPrice() * cart.getProductQuantity();
                    }
                }
            }
        }
        System.out.println("Tổng số tiền bạn phải thanh toán là : " + formatMoney(total));
    }

    public void deleteInCart(String email, int id) {
        for (int i = 0; i < CartDB.carts.size(); i++) {
            if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() == id) {
                CartDB.carts.remove(CartDB.carts.get(i));
            }
        }
        FileUtils.setDataToFile("cart.json", CartDB.carts);
        System.out.println("Xoá thành công");
    }

    public void deleteByEmail(String email) {
        CartDB.carts.removeIf(cart1 -> cart1.getEmail().equals(email));
        FileUtils.setDataToFile("cart.json", CartDB.carts);
    }

    public boolean checkProduct(String productName) {
        for (Product product: ProductDB.products) {
            if (product.getProductName().equals(productName)) {
                return false;
            }
        }
        return true;
    }

    public Product addNewProduct(Product product) {
        Product product1 = new Product();
        product1.setProductCode(product.getProductCode());
        product1.setProductName(product.getProductName());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setBrand(product.getBrand());
        product1.setCategories(product.getCategories());
        productRepository.productSave(product1);
        System.out.println("Thêm sản phẩm mới thành công !!!");
        return product1;
    }

    public List<Product> deleteById(int productCode) {
        for (Product product: ProductDB.products) {
            if (product.getProductCode() == productCode) {
                ProductDB.products.remove(product);
                productRepository.saveById(ProductDB.products);
                return ProductDB.products;
            }
        }
        throw new NotFoundException("Không tìm thấy mã sản phẩm " + productCode);
    }

    public List<Product> updatePrice(int productCode, int newPrice) {
        for (Product product: ProductDB.products) {
            if(product.getProductCode() == productCode) {
                product.setPrice(newPrice);
                productRepository.saveById(ProductDB.products);
                return ProductDB.products;
            }
        }
        throw new NotFoundException("Không tìm thấy mã sản phẩm " + productCode);
    }
}
