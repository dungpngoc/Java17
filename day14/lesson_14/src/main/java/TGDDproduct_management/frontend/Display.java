package TGDDproduct_management.frontend;


import TGDDproduct_management.backend.controller.ProductController;
import TGDDproduct_management.backend.controller.UserController;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.request.ProductRequest;
import TGDDproduct_management.backend.request.UserRegister;

import java.util.Scanner;

public class Display {
    UserController userController = new UserController();
    ProductController productController = new ProductController();
    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();
            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("----------Lựa chọn không hợp lệ----------");
                continue;
            }
            switch (option) {
                case 1: {
                    productController.showProduct();
                    break;
                }
                case 2: {
                    try {
                        System.out.println("-----------------Login-----------------");
                        System.out.print("Nhập email : ");
                        String email = sc.nextLine();

                        System.out.print("Nhập password : ");
                        String password = sc.nextLine();
                        userController.checkLogin(email,password);
                        System.out.println("Hãy tham khảo các sản phẩm của chúng tôi : ");
                        productController.showProduct();
                        boolean isQuitTwo = false;
                        while (!isQuitTwo) {
                            showMenuTwo();
                            try {
                                System.out.print("Nhập lựa chọn : ");
                                option = Integer.parseInt(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("----------Lựa chọn không hợp lệ----------");
                                continue;
                            }
                            switch (option) {
                                case 1: {
                                    try {
                                        System.out.print("Nhập id sản phẩm : ");
                                        int id = Integer.parseInt(sc.nextLine());
                                        System.out.print("Nhập số lượng : ");
                                        int quantity = Integer.parseInt(sc.nextLine());
                                        productController.getProductById(id,quantity);
                                        ProductRequest productRequest = new ProductRequest(id,quantity);
                                        productController.cart(productRequest);
                                        boolean isQuitThree = false;
                                        while (!isQuitThree) {
                                            System.out.println("1 -- Yes        2 -- No");
                                            int option1 = Integer.parseInt(sc.nextLine());
                                            switch (option1) {
                                                case 1: {
                                                    System.out.println("Chúc mừng bạn đã thanh toán thành công");
                                                    System.out.println("Hay tham khảo thêm sản phẩm của chúng tôi ^^!");
                                                    isQuitThree = true;
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Hãy xem sản phẩm khác phù hợp hơn với !!!");
                                                    isQuitThree = true;
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Good bye, See you again...");
                                                    isQuitThree = true;
                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Lựa chọn không phù hợp");
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("");
                                }
                            }
                        }

                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    System.out.println("----------------------Đăng ký tài khoản----------------------");
                    System.out.print("Nhập username : ");
                    String username = sc.nextLine();
                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();
                    if (!userController.checkPassword(password)) {
                        System.out.println("Password phải từ 7 đến 15 ký tự");
                    } else if (userController.checkPassword(password)) {
                        System.out.print("Nhập email : ");
                        String email = sc.nextLine();
                        if (!userController.checkEmail(email)) {
                            System.out.println("Email không đúng định dạng");
                        } else if (!userController.checkEmailDB(email)) {
                            System.out.println("Email đã tồn tại");
                        } else if (userController.checkEmail(email) && userController.checkEmailDB(email)) {
                            System.out.print("Nhập số điện thoại : ");
                            String phoneNumber = sc.nextLine();
                            if (!userController.checkPhoneNumber(phoneNumber)) {
                                System.out.println("Số điện thoại không đúng định dạng");
                            } else if (userController.checkPhoneNumber(phoneNumber)) {
                                UserRegister register = new UserRegister(username,password,email,phoneNumber);
                                User user = userController.userRegister(register);
                                System.out.println("Đăng ký thành công");
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("------------------------Chào mừng bạn đến với Thế Giới Di Động-----------------------");
        System.out.println("---------Hãy đăng nhập hoặc đăng ký làm thành viên mới để mua hàng và nhận những ưu đãi---------");
        System.out.println("1 -- Vào cửa hàng");
        System.out.println("2 -- Đăng nhập");
        System.out.println("3 -- Đăng ký");
        System.out.println("4 -- Quên mật khẩu");
        System.out.println("5 -- Thoát");
    }

    public static void showMenuTwo() {
        System.out.println("1 -- Chọn sản phẩm và cho vào giỏ hàng");
        System.out.println("2 -- Xem giỏ hàng");
        System.out.println("3 -- Thay đổi, cập nhập thông tin cá nhân");
        System.out.println("4 -- Thoát");
    }

    public static void LoginSuccess() {

    }
}
