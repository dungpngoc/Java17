package TGDDproduct_management.frontend;


import TGDDproduct_management.backend.controller.ProductController;
import TGDDproduct_management.backend.controller.UserController;
import TGDDproduct_management.backend.database.AdminDB;
import TGDDproduct_management.backend.exception.NotFoundException;
import TGDDproduct_management.backend.model.Address;
import TGDDproduct_management.backend.model.Admin;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.request.UserRegister;

import java.util.Scanner;

public class Display {
    static UserController userController = new UserController();
    static ProductController productController = new ProductController();

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
                    System.out.println("-------------------------------------Happy New Year 2023-------------------------------------");
                    System.out.println("-------------------------Chúc quý khách năm mới an khang thinh vượng-------------------------\n");
                    productController.showProduct();
                    break;
                }
                case 2: {
                    System.out.println("-----------------Login-----------------");
                    System.out.print("Nhập email : ");
                    String email = sc.nextLine();
                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();
                    for (Admin admin1: AdminDB.admins) {
                        if (admin1.getEmail().equals(email) && admin1.getPassword().equals(password)) {
                            adminLoginSucces();
                            break;
                        }
                        else {
                            LoginSuccess(email,password);
                        }
                    }
                    break;
                }
                case 3: {
                    Registration();
                    break;
                }
                case 4: {
                    System.out.print("Nhập email : ");
                    String email = sc.nextLine();
                    findPasswordByEmail(email);
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không chính xác");
                    break;
                }
            }
        }
    }


    private void showMenuAdmin() {
        System.out.println("1 -- Xem danh sách sản phẩm");
        System.out.println("2 -- Thêm sản phẩm");
        System.out.println("3 -- Xoá sản phẩm");
        System.out.println("4 -- Sửa giá sản phẩm");
        System.out.println("5 -- Thoát");
    }

    // Menu ban đầu
    // Vào cửa hàng: Sẽ hiện ra tất cả các sản phẩm
    // Quên mật khẩu sẽ tìm = email và sẽ gửi lại password cho người dùng
    public static void showMenu() {
        System.out.println("----------------------------Chào mừng bạn đến với Thế Giới Di Động---------------------------");
        System.out.println("--------Hãy đăng nhập hoặc đăng ký làm thành viên mới để mua hàng và nhận những ưu đãi-------\n");
        System.out.println("1 -- Vào cửa hàng");
        System.out.println("2 -- Đăng nhập");
        System.out.println("3 -- Đăng ký");
        System.out.println("4 -- Quên mật khẩu");
        System.out.println("5 -- Thoát");
    }

    // case 2 mục 2 -> Sau khi đăng nhập thành công thì sẽ hiện menuTwo
    // Thay đổi thông tin cá nhân bao gồm : địa chỉ và mật khẩu.
    public static void showMenuTwo() {
        System.out.println("1 -- Chọn sản phẩm và cho vào giỏ hàng");
        System.out.println("2 -- Xem giỏ hàng và tổng giá tiền");
        System.out.println("3 -- Thay đổi, cập nhập thông tin cá nhân");
        System.out.println("4 -- Thoát");
    }

    // Nếu chọn xem giỏ hàng sẽ hiện ra các option ở MenuThree
    public static void showMenuThree() {
        System.out.println("1 -- Xoá sản phẩm trong giỏ hàng");
        System.out.println("2 -- Cập nhập số lượng sản phẩm");
        System.out.println("3 -- Quay lại và xem thêm sản phẩm");
        System.out.println("4 -- Thanh toán");
    }

    // Sau khi chọn MenuTwo và chọn mục 3 cập nhập thông tin cá nhân sẽ bao gồm địa chỉ và thay đổi password
    public static void showMenuFord() {
        System.out.println("1 -- Cập nhập địa chỉ cá nhân");
        System.out.println("2 -- Đổi mật khẩu");
        System.out.println("3 -- Quay lại cửa hàng");
    }

    // Admin đăng nhập và thao tác trong menu
    private void adminLoginSucces() {
        System.out.println("Good night ... Welcome Admin Store !!!");
        Scanner sc = new Scanner(System.in);
        boolean isQuitTwo = false;
        while (!isQuitTwo) {
            showMenuAdmin();
            int option = 0;
            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("----------Lựa chọn không hợp lệ----------");
                continue;
            }
            switch (option) {
                case 1: {
                    System.out.println("-----------------------------------------> LIST PRODUCT <-----------------------------------------");
                    productController.showProduct();
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    break;
                }
                case 2: {
                    int productCode = -1;
                    int price = -1;
                    boolean check = true;
                    do {
                        try {
                            System.out.println("-------------Nhập thông tin sản phẩm mới-------------");
                            System.out.print("Nhập mã sản phẩm : ");
                            productCode = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập tên sản phẩm : ");
                            String productName = sc.nextLine();
                            System.out.print("Nhập hệ điều hành : ");
                            String description = sc.nextLine();
                            System.out.print("Nhập giá : ");
                            price = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập hãng : ");
                            String brand = sc.nextLine();
                            System.out.print("Nhập loại máy : ");
                            String categories = sc.nextLine();
                            check = false;
                            if (!productController.checkProduct(productName)) {
                                System.out.println("Sản phẩm đã tồn tại");
                            } else if (productController.checkProduct(productName)) {
                                Product product = new Product(productCode,productName,description,price,brand,categories);
                                productController.addNewProduct(product);
                            }
                            break;
                        } catch (Exception e) {
                            System.out.println("Nhập dữ liệu không đúng đin dạng, hãy nhập lại !!!");
                        }
                    } while (check);
                    break;
                }
                case 3: {
                    int productCode = -1;
                    boolean check = true;
                    do {
                        try {
                            System.out.print("Nhập mã sản phẩm muốn xoá : ");
                            productCode = Integer.parseInt(sc.nextLine());
                            check = false;
                        } catch (Exception e) {
                            System.out.println("Sai định dạng, hãy nhập lại !!!");
                        }
                    } while (check);
                    productController.deleteById(productCode);
                    break;
                }
                case 4: {
                    int productCode = -1;
                    int newPrice = -1;
                    boolean check = true;
                    do {
                        try {
                            System.out.print("Nhập mã sản phẩm muốn sửa giá : ");
                            productCode = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập giá tiền : ");
                            newPrice = Integer.parseInt(sc.nextLine());
                            check = false;
                        } catch (Exception e) {
                            System.out.println("Nhập sai định dạng, hãy nhập lại !!!");
                        }
                    } while (check);
                    productController.updatePrice(productCode,newPrice);
                    break;
                }
                case 5: {
                    System.out.println("Thoát");
                    isQuitTwo = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    // User đăng nhập và thao tác trong menu
    public static void LoginSuccess(String email, String password) {
        Scanner sc = new Scanner(System.in);
        try {
            userController.checkLogin(email, password);
            System.out.println(". . . . . . . . . . . . . Hãy tham khảo các sản phẩm của chúng tôi . . . . . . . . . . . . . ");
            productController.showProduct();
            boolean isQuitTwo = false;
            while (!isQuitTwo) {
                showMenuTwo();
                int option;
                try {
                    System.out.print("Nhập lựa chọn : ");
                    option = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("----------Lựa chọn không hợp lệ----------");
                    continue;
                }
                switch (option) {
                    case 1: {
                        int productCode = -1;
                        int quantity = -1;
                        boolean flag = true;
                        do {
                            try {
                                System.out.print("Nhập mã sản phẩm : ");
                                productCode = Integer.parseInt(sc.nextLine());
                                System.out.print("Nhập số lượng : ");
                                quantity = Integer.parseInt(sc.nextLine());
                                flag = false;
                            } catch (NumberFormatException e) {
                                System.out.println("Sai định dạng. Vui lòng nhập lại!");
                            }
                        }
                        while (flag);
                        // Trong giỏ có sẵn rồi thì vào vòng if(true), chưa có thì vào else-if(false)
                        if (productController.checkDataCart(email)) {
                            productController.cart1(email,productCode,quantity);
                            break;
                        } else if (!productController.checkDataCart(email)) {
                            productController.cart(email,productCode,quantity);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        productController.showCart(email);
                        productController.totalCart(email);
                        boolean isQuitFord = false;
                        while (!isQuitFord) {
                            showMenuThree();
                            System.out.print("Nhập lựa chọn : ");
                            int option1 = Integer.parseInt(sc.nextLine());
                            switch (option1) {
                                case 1: {
                                    boolean check = true;
                                    int id = -1;
                                    do {
                                        try {
                                            System.out.print("Nhập mã sản phẩm cần xoá : ");
                                            id = Integer.parseInt(sc.nextLine());
                                            check = false;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Sai định dạng. Vui lòng nhập lại!");
                                        }
                                    }
                                    while (check);
                                    productController.deleteInCart(email,id);
                                    break;
                                }
                                case 2: {
                                    int productCode = -1;
                                    int productQuantity = -1;
                                    boolean check = true;
                                    do {
                                        try {
                                            System.out.println("--------------> Cập nhập số lượng trong giỏ hàng <--------------");
                                            System.out.print("Nhập mã sản phẩm : ");
                                            productCode = Integer.parseInt(sc.nextLine());
                                            System.out.print("Nhập số lượng cập nhập : ");
                                            productQuantity = Integer.parseInt(sc.nextLine());
                                            check = false;
                                        } catch (Exception e) {
                                            System.out.println("Sai định dạng. Vui lòng nhập lại!");
                                        }
                                    } while (check);
                                    if (productController.checkDataCart(email)) {
                                        productController.changeQuantyti(email,productCode,productQuantity);
                                        System.out.println("Cập nhập thành công !!!");
                                    } else if (!productController.checkDataCart(email)) {
                                        System.out.println("Không có sản phẩm nào trong giỏ, hãy quay lại và chọn sản phẩm !!!");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Hãy xem thêm sản phẩm của chúng tôi ...");
                                    productController.showProduct();
                                    isQuitFord = true;
                                    break;
                                }
                                case 4: {
                                    // Sau khi thanh toán, xoá ko hết dữ liệu
                                    try {
                                        System.out.print("Nhập số tài khoản ngân hàng : ");
                                        int paymentNumber = Integer.parseInt(sc.nextLine());
                                        userController.getAddress(email);
                                        productController.deleteByEmail(email);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("Chưa có thông tin địa chỉ của bạn, hãy cập nhập địa chỉ ...");
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Lựa chọn không hợp lệ");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 3: {
                        boolean isQuitFive = false;
                        while (!isQuitFive) {
                            showMenuFord();
                            System.out.print("Nhập lựa chọn : ");
                            int option2 = Integer.parseInt(sc.nextLine());
                            switch (option2) {
                                case 1: {
                                    int houseNumber = -1;
                                    boolean check = true;
                                    do {
                                        try {
                                            System.out.print("Nhập tỉnh : ");
                                            String province = sc.nextLine();
                                            System.out.print("Nhập quận : ");
                                            String district = sc.nextLine();
                                            System.out.print("Nhập đường : ");
                                            String street = sc.nextLine();
                                            System.out.print("Nhập số nhà : ");
                                            houseNumber = Integer.parseInt(sc.nextLine());
                                            Address address = new Address(province,district,street,houseNumber);
                                            userController.updateInfo(email,address);
                                            userController.showAddress(email,address);
                                            check = false;
                                        } catch (Exception e) {
                                            System.out.println("Sai định dạng số nhà, hãy nhập lại!");
                                        }
                                    } while (check);
                                    break;
                                }
                                case 2: {
                                    System.out.print("Nhập mật khẩu hiện tại : ");
                                    String currentPassword = sc.nextLine();
                                    System.out.print("Nhập password mới : ");
                                    String newPassword = sc.nextLine();
                                    if (!userController.checkCurrentPassword(email,currentPassword)) {
                                        System.out.println("Mật khẩu hiện tại không chính xác");
                                    } else if (!userController.checkPassword(newPassword)) {
                                        System.out.println("Password phải từ 7 đến 15 ký tự");
                                    } else if (userController.checkPassword(newPassword) && userController.checkCurrentPassword(email,currentPassword)) {
                                        userController.changePassword(email,newPassword);
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Quay lại cửa hàng ... Continue ------->");
                                    isQuitFive = true;
                                    break;
                                }
                                default: {
                                    System.out.println("Lựa chọn không chính xác");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Exited ...");
                        isQuitTwo = true;
                        break;
                    }
                    default: {
                        System.out.println("Lựa chọn không hợp lệ");
                        break;
                    }
                }
            }
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    // Đăng kí tài khoản
    public static void Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------> Đăng ký tài khoản <----------------------");
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
                    UserRegister register = new UserRegister(username, password, email, phoneNumber);
                    User user = userController.userRegister(register);
                    System.out.println("Đăng ký thành công");
                }
            }
        }
    }


    // Tìm lại mật khẩu
    public static void findPasswordByEmail(String email) {
        userController.findPasswordByEmail(email);
    }
}
