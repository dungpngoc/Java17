package product_management.controller;

import product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {

    ProductService productService = new ProductService();
    public void run() {
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Danh sách sản phẩm là:");
                    productService.printProduct();
                    break;
                }
                case 2: {
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    productService.findByName(name);
                    break;
                }
                case 3: {
                    System.out.print("Nhập id cần tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    productService.findById(id);
                    break;
                }
                case 4: {
                    System.out.println("Sản phẩm có số lượng dưới 5 là: ");
                    productService.findByQuantity();
                    break;
                }
                case 5: {
                    productService.findByPrice();
                    break;
                }
                case 6: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không đúng");
                }
            }
        }
    }


    public void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Tìm sản phẩm theo id");
        System.out.println("4 - Tìm sản phẩm có số lượng dưới 5");
        System.out.println("5 - Tìm sản phẩm theo mức giá");
        System.out.println("6 - Thoát\n");
    }
}
