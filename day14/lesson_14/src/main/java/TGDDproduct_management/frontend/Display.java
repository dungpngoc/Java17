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

import java.util.Random;
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
                    System.out.println("---------------------------------------------Happy New Year 2023---------------------------------------------");
                    System.out.println("---------------------------------Chúc quý khách năm mới an khang thinh vượng---------------------------------\n");
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
                case 5: {
                    System.out.println("Thoát !!!");
                    isQuit = true;
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
        System.out.println("2 -- Xen các sản phẩm đã bán");
        System.out.println("3 -- Thêm sản phẩm");
        System.out.println("4 -- Xoá sản phẩm");
        System.out.println("5 -- Update giá sản phẩm");
        System.out.println("6 -- Update số lượng sản phẩm");
        System.out.println("7 -- Thoát");
    }

    // Menu ban đầu
    // Vào cửa hàng: Sẽ hiện ra tất cả các sản phẩm
    // Quên mật khẩu sẽ tìm = email và sẽ gửi lại password cho người dùng
    public static void showMenu() {
        System.out.println("------------------------------------Chào mừng bạn đến với Thế Giới Di Động-----------------------------------");
        System.out.println("----------------Hãy đăng nhập hoặc đăng ký làm thành viên mới để mua hàng và nhận những ưu đãi---------------\n");
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
                    System.out.println("-----------------------------------------------> LIST PRODUCT <-----------------------------------------------");
                    productController.showProduct();
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    break;
                }
                case 2: {
                    productController.showCartHistory();
                    break;
                }
                case 3: {
                    int productCode = -1;
                    int price = -1;
                    int quantity = -1;
                    boolean check = true;
                    boolean check1 = true;
                    boolean check2 = true;
                    boolean check3 = true;
                    do {
                        try {
                            System.out.println("-------------Nhập thông tin sản phẩm mới-------------");
                            do {
                                System.out.print("Nhập mã sản phẩm : ");
                                productCode = Integer.parseInt(sc.nextLine());
                                if (productController.checkProductCode(productCode)) {
                                    check1 = false;
                                } else if (!productController.checkProductCode(productCode)) {
                                    System.out.println("Đã tồn tại mã sản phẩm : " + productCode + ", nhập lại !!!");
                                    check1 = true;
                                }
                            } while (check1);
                            String productName;
                            do {
                                System.out.print("Nhập tên sản phẩm : ");
                                productName = sc.nextLine();
                                if (!productController.checkProduct(productName)) {
                                    System.out.println("Sản phẩm đã tồn tại, nhập lại !!!");
                                    check3 = true;
                                } else if (productController.checkProduct(productName)) {
                                    check3 = false;
                                }
                            } while (check3);
                            System.out.print("Nhập hệ điều hành : ");
                            String description = sc.nextLine();
                            do {
                                try {
                                    System.out.print("Nhập giá : ");
                                    price = Integer.parseInt(sc.nextLine());
                                    if (price > 0) {
                                        check2 = false;
                                    } else if (price <= 0) {
                                        System.out.println("Giá phải lớn hơn 0, nhập lại !!!");
                                        check2 = true;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Sai định dạng giá, nhập lại");
                                }
                            } while (check2);
                            do {
                                try {
                                    System.out.print("Nhập số lượng : ");
                                    quantity = Integer.parseInt(sc.nextLine());
                                    if (quantity > 0) {
                                        check = false;
                                    } else if (quantity <= 0) {
                                        System.out.println("Số lượng phải lớn hơn 0, nhập lại !!!");
                                        check = true;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Sai định dạng số lượng, nhập lại !!!");
                                }
                            } while (check);
                            System.out.print("Nhập hãng : ");
                            String brand = sc.nextLine();
                            System.out.print("Nhập loại máy : ");
                            String categories = sc.nextLine();
                            Product product = new Product(productCode, productName, description, price, brand, categories, quantity);
                            productController.addNewProduct(product);

                            break;
                        } catch (Exception e) {
                            System.out.println("Nhập dữ liệu không đúng định dạng, hãy nhập lại !!!");
                        }
                    } while (check);
                    break;
                }
                case 4: {
                    int productCode = -1;
                    boolean check = true;
                    do {
                        try {
                            System.out.print("Nhập mã sản phẩm muốn xoá : ");
                            productCode = Integer.parseInt(sc.nextLine());
                            if (productController.checkProductCode1(productCode)) {
                                check = false;
                            } else if (!productController.checkProductCode1(productCode)) {
                                System.out.println("Không tìm thấy mã sản phẩm " + productCode + ", nhập lại !!!");
                                check = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Sai định dạng, hãy nhập lại !!!");
                        }
                    } while (check);
                    productController.deleteById(productCode);
                    break;
                }
                case 5: {
                    int productCode = -1;
                    int newPrice = -1;
                    boolean check = true;
                    boolean check1 = true;
                    do {
                        try {
                            System.out.print("Nhập mã sản phẩm muốn sửa giá : ");
                            productCode = Integer.parseInt(sc.nextLine());
                            if (productController.checkProductCode1(productCode)) {
                                check = false;
                            } else if (!productController.checkProductCode1(productCode)) {
                                System.out.println("Không tìm thấy mã sản phẩm " + productCode + ", nhập lại !!!");
                                check = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Nhập sai định dạng mã sản phẩm, hãy nhập lại !!!");
                        }
                    } while (check);

                    do {
                        try {
                            System.out.print("Nhập giá tiền : ");
                            newPrice = Integer.parseInt(sc.nextLine());
                            if (newPrice <= 0) {
                                System.out.println("Giá tiền phải lớn hơn 0, nhập lại !!!");
                                check1 = true;
                            } else if (newPrice > 0) {
                                check1 = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Nhập sai định dạng giá tiền, nhập lại !!!");
                        }
                    } while (check1);
                    productController.updatePrice(productCode,newPrice);
                    break;
                }
                case 6: {
                    int proDuctCode = -1;
                    int quantity = -1;
                    boolean check = true;
                    boolean check1 = true;
                    do {
                        try {
                            System.out.print("Nhập mã sản phẩm : ");
                            proDuctCode = Integer.parseInt(sc.nextLine());
                            if (productController.checkProductCode1(proDuctCode)) {
                                check = false;
                            } else if (!productController.checkProductCode1(proDuctCode)) {
                                System.out.println("Không tìm thấy mã sản phẩm " + proDuctCode + ", nhập lại !!!");
                                check = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Sai định dạng mã sản phẩm, nhập lại !!!");
                        }
                    } while (check);

                    do {
                        try {
                            System.out.print("Nhập số lượng sản phẩm : ");
                            quantity = Integer.parseInt(sc.nextLine());
                            if (quantity <= 0) {
                                System.out.println("Số lượng sản phẩm phải lớn hơn 0, nhập lại !!!");
                                check1 = true;
                            } else if (quantity > 0) {
                                check1 = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Sai định dạng số lượng, nhập lại !!!");
                        }
                    } while (check1);
                    productController.updateQuantity(proDuctCode,quantity);
                    break;
                }
                case 7: {
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
                        boolean check = true;
                        do {
                            try {
                                System.out.print("Nhập mã sản phẩm : ");
                                productCode = Integer.parseInt(sc.nextLine());
                                if (productController.checkProductCode(productCode)) {
                                    check = false;
                                } else if (!productController.checkProductCode(productCode)) {
                                    System.out.printf("Không có mã sản phẩm %d trong kho, nhập lại !!! %n", productCode);
                                    check = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Sai định dạng mã sản phẩm, nhập lại !!!");
                            }
                        } while (check);

                        do {
                            try {
                                System.out.print("Nhập số lượng : ");
                                quantity = Integer.parseInt(sc.nextLine());
                                if (quantity <= 0) {
                                    System.out.println("Số lượng phải lớn hơn 0, nhập lại !!!");
                                    flag = true;
                                } else if (!productController.checkProductQuantity(productCode,quantity)) {
                                    System.out.println("Số lượng trong kho không đủ, nhập lại !!!");
                                    flag = true;
                                } else if (quantity > 0 && productController.checkProductQuantity(productCode,quantity)) {
                                    flag = false;
                                }
                            } catch (Exception e) {
                                System.out.println("Sai định dạng số lượng, nhập lại !!!");
                            }
                        } while (flag);
                        // Trong giỏ có sẵn rồi thì vào vòng if(true), chưa có thì vào else-if(false)
                        if (productController.checkDataCart(email)) {
                            productController.cart1(email,productCode,quantity);
                            productController.showCart(email);
                            break;
                        } else if (!productController.checkDataCart(email)) {
                            productController.cart(email,productCode,quantity);
                            productController.showCart(email);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("------------------------------> List Product <------------------------------");
                        productController.showCart(email);
                        productController.totalCart(email);
                        boolean isQuitFord = false;
                        while (!isQuitFord) {
                            showMenuThree();
                            int option1 = -99999;
                            try {
                                System.out.print("Nhập lựa chọn : ");
                                option1 = Integer.parseInt(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("Lựa chọn không hợp lệ, nhập lại !!!");
                                continue;
                            }
                            switch (option1) {
                                case 1: {
                                    boolean check = true;
                                    int id = -1;
                                    if (productController.checkDataCart(email)) {
                                        do {
                                            try {
                                                do {
                                                    System.out.println("------------------------------> List Product <------------------------------");
                                                    productController.showCart(email);
                                                    System.out.print("Nhập mã sản phẩm cần xoá : ");
                                                    id = Integer.parseInt(sc.nextLine());
                                                    if (productController.checkDataCart1(email,id)) {
                                                        check = false;
                                                    } else if (!productController.checkDataCart1(email,id)) {
                                                        System.out.println("Không tìm thấy mã sản phẩm nào, nhập lại !!!");
                                                        check = true;
                                                    }
                                                } while (check);
                                            } catch (Exception e) {
                                                System.out.println("Sai định dạng. Vui lòng nhập lại !!!");
                                            }
                                        } while (check);
                                        productController.deleteInCart(email,id);
                                        System.out.println("------------------------------> List Product <------------------------------");
                                        productController.showCart(email);
                                        break;
                                    } else if (!productController.checkDataCart(email)) {
                                        System.out.println("Không có sản phẩm nào trong giỏ hàng !!!");
                                    }
                                    break;
                                }
                                case 2: {
                                    int productCode = -1;
                                    int productQuantity = -1;
                                    boolean check = true;
                                    boolean check1 = true;
                                    if (productController.checkDataCart(email)) {
                                        System.out.println("--------------------> Cập nhập số lượng trong giỏ hàng <--------------------");
                                        productController.showCart(email);
                                        do {
                                            try {
                                                System.out.print("Nhập mã sản phẩm : ");
                                                productCode = Integer.parseInt(sc.nextLine());
                                                if (productController.checkDataCart1(email,productCode)) {
                                                    check1 = false;
                                                } else if (!productController.checkDataCart1(email,productCode)) {
                                                    System.out.println("Không tìm thấy mã sản phẩm " + productCode + " , nhập lại !!!");
                                                    check1 = true;
                                                }
                                            } catch (Exception e) {
                                                System.out.println("Sai định dạng, nhập lại !!!");
                                            }
                                        } while (check1);
                                        do {
                                            try {
                                                do {
                                                    System.out.print("Nhập số lượng cập nhập : ");
                                                    productQuantity = Integer.parseInt(sc.nextLine());
                                                    if (productQuantity > 0) {
                                                        check = false;
                                                    } else if (productQuantity <= 0) {
                                                        System.out.println("Số lượng phải lớn hơn 0, nhập lại !!!");
                                                        check = true;
                                                    }
                                                } while (check);
                                            } catch (Exception e) {
                                                System.out.println("Sai định dạng, nhập lại !!!");
                                            }
                                        } while (check);
                                        if (productController.checkDataCart1(email,productCode)) {
                                            productController.changeQuantyti(email,productCode,productQuantity);
                                            System.out.println("Cập nhập thành công !!!");
                                            System.out.println("------------------------------> List Product <------------------------------");
                                            productController.showCart(email);
                                        }
                                    } else if (!productController.checkDataCart(email)) {
                                        System.out.println("Không có sản phẩm nào trong giỏ hàng !!!");
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
                                    if (productController.checkDataCart(email)) {
                                        try {
                                            if (userController.checkInfo(email)) {
                                                System.out.print("Nhập số tài khoản ngân hàng : ");
                                                int paymentNumber = Integer.parseInt(sc.nextLine());
                                                int min = 1000;
                                                int max = 9999;
                                                Random rand = new Random();
                                                int rdQR1 = rand.nextInt(max - min + 1) + min;
                                                System.out.println("Mã QR : " + rdQR1);
                                                boolean check = true;
                                                do {
                                                    try {
                                                        System.out.print("Nhập mã QR : ");
                                                        int qr = Integer.parseInt(sc.nextLine());
                                                        productController.checkQR(rdQR1,qr);
                                                        if (productController.checkQR(rdQR1,qr)) {
                                                            userController.getAddress(email);
                                                            productController.addCartHistory(email);
                                                            productController.deleteByEmail(email);
                                                            check = false;
                                                        } else if (!productController.checkQR(rdQR1, qr)) {
                                                            System.out.println("Nhập sai mã QR, nhập lại !!!");
                                                        }
                                                    } catch (Exception e) {
                                                        System.out.println("Sai định dạng, nhập lại !!!");
                                                    }
                                                } while (check);
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Chưa đủ thông tin cá nhân, hãy cập nhập !!!");
                                        }

                                    } else if (!productController.checkDataCart(email)) {
                                        System.out.println("Không có sản phẩm nào trong giỏ hàng !!!");
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
                            try {
                                userController.showInfo(email);
                            } catch (Exception e) {
                                System.out.println("Thông tin cá nhân chưa đầy đủ, hãy cập nhập !!!");
                            }
                            showMenuFord();
                            int option2 = -99999;
                            try {
                                System.out.print("Nhập lựa chọn : ");
                                option2 = Integer.parseInt(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("Lựa chọn không hợp lệ, nhập lại !!!");
                                continue;
                            }
                            switch (option2) {
                                case 1: {
                                    boolean check = true;
                                    System.out.print("Nhập tỉnh : ");
                                    String province = sc.nextLine();
                                    System.out.print("Nhập quận : ");
                                    String district = sc.nextLine();
                                    System.out.print("Nhập đường : ");
                                    String street = sc.nextLine();
                                    System.out.print("Nhập số nhà : ");
                                    String houseNumber = sc.nextLine();
                                    do {
                                        System.out.print("Nhập số điện thoại : ");
                                        String phoneNumber = sc.nextLine();
                                        if (userController.checkPhoneNumber(phoneNumber)) {
                                            Address address = new Address(province,district,street,houseNumber,phoneNumber);
                                            userController.updateInfo(email,address);
                                            check = false;
                                        } else if (!userController.checkPhoneNumber(phoneNumber)) {
                                            System.out.println("Sai định dạng số điện thoại, nhập lại !!!");
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
                UserRegister register = new UserRegister(username, password, email);
                User user = userController.userRegister(register);
                System.out.println("Đăng ký thành công");
            }
        }
    }


    // Tìm lại mật khẩu
    public static void findPasswordByEmail(String email) {
        userController.findPasswordByEmail(email);
    }
}
