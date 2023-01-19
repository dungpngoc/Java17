package TGDDproduct_management.backend.service;

import TGDDproduct_management.backend.database.CartDB;
import TGDDproduct_management.backend.database.CartHistoryDB;
import TGDDproduct_management.backend.database.ProductDB;
import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.CartHistory;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.repository.ProductRepository;
import TGDDproduct_management.backend.utils.FileUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public void showProduct() {
        productRepository.findAll();
    }

    public boolean checkCartByEmail(String email) {
        for (Cart cart: CartDB.carts) {
            if(cart.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    public void showCart(String email) {
        if (checkCartByEmail(email)) {
            System.out.printf("%-20s | %-15s | %-22s | %-8s | %n", "Email", "Mã sản phẩm", "Tên sản phẩm", "Số lượng");
            for (Cart cart: CartDB.carts) {
                if (cart.getEmail().equals(email)) {
                    System.out.printf("%-20s | %-15d | %-22s | %-8d | %n", cart.getEmail(), cart.getProductId(),
                            cart.getProductName(), cart.getProductQuantity());
                }
            }
        } else if (!checkCartByEmail(email)) {
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
        int count = 0;
        for (int i = 0; i < CartDB.carts.size(); i++) {
            if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() == id) {
                CartDB.carts.remove(CartDB.carts.get(i));
                FileUtils.setDataToFile("cart.json", CartDB.carts);
                System.out.println("Xoá thành công");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào trong giỏ có id " + id);
        }
    }

    public void deleteByEmail(String email) {
        for (int i = 0; i < CartDB.carts.size(); i++) {
            for (int j = 0; j < ProductDB.products.size(); j++) {
                if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() == ProductDB.products.get(j).getProductCode()) {
                    ProductDB.products.get(j).setQuantity(ProductDB.products.get(j).getQuantity() - CartDB.carts.get(i).getProductQuantity());
                    FileUtils.setDataToFile("list-product.json", ProductDB.products);
                }
            }
        }
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
        product1.setQuantity(product.getQuantity());
        productRepository.productSave(product1);
        System.out.println("Thêm sản phẩm mới thành công !!!");
        return product1;
    }

    public void deleteById(int productCode) {
        int count = 0;
        for (int i = 0; i < ProductDB.products.size(); i++) {
            if (ProductDB.products.get(i).getProductCode() == productCode) {
                ProductDB.products.remove(ProductDB.products.get(i));
                productRepository.saveById(ProductDB.products);
                System.out.println("Deleted ...");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy mã sản phẩm " + productCode);
        }
    }

    public void updatePrice(int productCode, int newPrice) {
        int count = 0;
        for (Product product: ProductDB.products) {
            if(product.getProductCode() == productCode) {
                product.setPrice(newPrice);
                productRepository.saveById(ProductDB.products);
                System.out.println("Updated ... ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy mã sản phẩm " + productCode);
        }
    }

    public boolean checkDataCart(String email) {
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkDataCart1(String email, int productCode) {
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email) && cart.getProductId() == productCode) {
                return true;
            }
        }
        return false;
    }

    public void cart(String email, int productCode, int quantity) {
        Cart cart = new Cart();
        int count = 0;
        for (Product product: ProductDB.products) {
            if (product.getProductCode() == productCode) {
                cart.setEmail(email);
                cart.setProductId(productCode);
                cart.setProductName(product.getProductName());
                cart.setProductQuantity(quantity);
                productRepository.cartSave(cart);
                System.out.println("Đã thêm vào giỏ ^^!");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy mã sản phẩm : " + productCode);
        }
    }

    public void cart1(String email, int productCode, int quantity) {
        int count = 0;
        for (int i = 0; i < CartDB.carts.size(); i++) {
            if (CartDB.carts.get(i).getEmail().equals(email) && CartDB.carts.get(i).getProductId() == productCode) {
                CartDB.carts.get(i).setProductQuantity(quantity);
                FileUtils.setDataToFile("cart.json",CartDB.carts);
                System.out.println("Đã thêm vào giỏ ^^!");
                count++;
            }
        }
        if (count == 0) {
            int count1 = 0;
            Cart cart = new Cart();
            for (Product product: ProductDB.products) {
                if (product.getProductCode() == productCode) {
                    cart.setEmail(email);
                    cart.setProductId(productCode);
                    cart.setProductName(product.getProductName());
                    cart.setProductQuantity(quantity);
                    productRepository.cartSave(cart);
                    System.out.println("Đã thêm vào giỏ ^^!");
                    count1++;
                }
            }
            if (count1 == 0) {
                System.out.println("Không tìm thấy mã sản phẩm : " + productCode);
            }
        }
    }

    public void changeQuantity(String email, int productCode, int productQuantity) {
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email) && cart.getProductId() == productCode) {
                cart.setProductQuantity(productQuantity);
                FileUtils.setDataToFile("cart.json",CartDB.carts);
            }
        }
    }

    public boolean checkQR(int rdQR1, int qr) {
        if (rdQR1 == qr) {
            return true;
        }
        return false;
    }

    public boolean checkProductQuantity(int productCode, int quantity) {
        for (Product product: ProductDB.products) {
            if (product.getProductCode() == productCode && product.getQuantity() >= quantity) {
                return true;
            }
        }
        return false;
    }

    public boolean checkProductCode(int productCode) {
        for (Product product: ProductDB.products) {
            if (product.getProductCode() == productCode) {
                return true;
            }
        }
        return false;
    }

    public boolean checkProductCode1(int productCode) {
        for (Product product: ProductDB.products) {
            if (product.getProductCode() == productCode) {
                return true;
            }
        }
        return false;
    }

    public void updateQuantity(int proDuctCode, int quantity) {
        for (Product product: ProductDB.products) {
            if(product.getProductCode() == proDuctCode) {
                product.setQuantity(quantity);
                FileUtils.setDataToFile("list-product.json", ProductDB.products);
                System.out.println("Updated ...");
            }
        }
    }

    public void addCartHistory(String email) {
        for (Cart cart: CartDB.carts) {
            if (cart.getEmail().equals(email)) {
                CartHistoryDB.carts.add(cart);
            }
        }
        FileUtils.setDataToFile("cart-history.json",CartHistoryDB.carts);
    }

    public void showCartHistory() {

        System.out.printf("%-20s | %-15s | %-22s | %-8s | %n", "Email", "Mã sản phẩm", "Tên sản phẩm", "Số lượng");
        for (Cart cart: CartHistoryDB.carts) {
            System.out.printf("%-20s | %-15d | %-22s | %-8d | %n", cart.getEmail(), cart.getProductId(),
                    cart.getProductName(), cart.getProductQuantity());
        }
    }
}
