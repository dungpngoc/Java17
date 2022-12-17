package product_management.service;

import product_management.database.ProductDB;
import product_management.model.Product;
import product_management.repository.ProductRepository;

import java.util.Scanner;

public class ProductService {


    // 1. In danh sách sản phẩm
    ProductRepository productRepository = new ProductRepository();
    public void printProduct() {
        for (Product listProduct: ProductDB.products) {
            System.out.println(listProduct);
        }
    }

    // 2. Tìm sản phẩm theo tên
    public void findByName(String name) {
        int count = 0;
        for (Product names:ProductDB.products) {
            if (names.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(names);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào có tên là " + name);
        }
    }


    // 3. Tìm sản phẩm theo id, Xoá sản phẩm, Cập nhập số lượng sản phẩm
    public void findById(int id) {
        int count = 0;
        for (int i = 0; i < productRepository.findProduct().size(); i++) {
            if (productRepository.findProduct().get(i).getId() == id) {
                System.out.println("Sản phẩm có id " + id + " là: ");
                System.out.println(productRepository.findProduct().get(i));
                count++;

                boolean isQuit = false;
                while (!isQuit) {
                    showEdit();
                    Scanner sc = new Scanner(System.in);
                    int option = Integer.parseInt(sc.nextLine());
                    switch (option) {
                        case 1: {
                            productRepository.findProduct().remove(productRepository.findProduct().get(i));
                            System.out.println("Đã xoá sản phẩm có id là: " + id);
                            break;
                        }
                        case 2: {
                            System.out.println("Nhập số lượng sản phẩm cần cập nhập");
                            int updateQuantity = Integer.parseInt(sc.nextLine());
                            productRepository.findProduct().get(i).setQuantity(updateQuantity);
                            System.out.println("Số lượng đã được cập nhập");
                            break;
                        }
                        case 3: {
                            isQuit = true;
                            System.out.println("Quay lại Menu chính");
                            break;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào có id là " + id);
        }
    }
    public void showEdit() {
        System.out.println("1 -- Xoá sản phẩm");
        System.out.println("2 -- Cập nhập số lượng sản phẩm");
        System.out.println("3 -- Quay lại Menu chính");
    }

    // 4. Tìm sản phẩm có số lượng dưới 5

    public void findByQuantity() {
        for (Product findQuantity: productRepository.findProduct()) {
            if (findQuantity.getQuantity() < 5) {
                System.out.println(findQuantity);
            }
        }
    }

    // 5. Tim sản phẩm theo mức giá: Dưới 50.000, Từ 50.000 đến 100.000, Trên 100.000

    public void findByPrice() {

        boolean isQuit = false;
        while (!isQuit) {
            showAllPrice();
            Scanner sc = new Scanner(System.in);
            System.out.print("Chọn mức giá muôn tìm: ");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    for (int i = 0; i < productRepository.findProduct().size(); i++) {
                        if (productRepository.findProduct().get(i).getPrice() < 50_000) {
                            System.out.println("Sản phẩm có giá dưới 50.000 là: ");
                            System.out.println(productRepository.findProduct().get(i));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < productRepository.findProduct().size(); i++) {
                        if (productRepository.findProduct().get(i).getPrice() > 50_000
                                && productRepository.findProduct().get(i).getPrice() < 100_000) {
                            System.out.println("Sản phẩm có giá từ 50.000 - 100.000 là: ");
                            System.out.println(productRepository.findProduct().get(i));
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    for (int i = 0; i < productRepository.findProduct().size(); i++) {
                        if (productRepository.findProduct().get(i).getPrice() > 100_000) {
                            System.out.println("Sản phẩm có giá trên 100.000 là: ");
                            System.out.println(productRepository.findProduct().get(i));
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    isQuit = true;
                    System.out.println("Quay lại Menu chính");
                    break;
                }
            }
        }
    }

    public void showAllPrice() {
        System.out.println("1 -- Sản phẩm dưới 50.000");
        System.out.println("2 -- Sản phẩm từ 50.000 - 100.000");
        System.out.println("3 -- Sản phẩm trên 100.000");
        System.out.println("4 -- Quay lại Menu");
    }
}
