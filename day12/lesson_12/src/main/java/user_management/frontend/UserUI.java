package user_management.frontend;

import user_management.backend.controller.UserController;
import user_management.backend.database.UserDatabase;
import user_management.backend.request.UserRegister;
import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;

import java.util.Scanner;

public class UserUI {
    private final UserController userController = new UserController();
    private final FileUtils fileUtils = new FileUtils();

    public void run() {
        boolean isQuit = false;
        Scanner sc = new Scanner(System.in);
        while (!isQuit) {
            showMenu();
            int option = 0;
            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }
            switch (option) {
                case 0: {
                    System.out.println("Thông tin người dùng : ");
                    for (User user: UserDatabase.users) {
                        System.out.println(user);
                    }
                    break;
                }
                case 1: {
                    System.out.print("Nhập email : ");
                    String email = sc.nextLine();
                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();

                    userController.getUser(email,password);
                    break;
                }
                case 2: {
                    System.out.print("Nhập username : ");
                    String username = sc.nextLine();

                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();
                    if (7 <= password.length() && password.length() <= 15) {
                        System.out.print("Nhập email : ");
                        String email = sc.nextLine();
                        if (fileUtils.checkEmail(email) == true && UserController.checkEmailDB(email) == true) {
                            try {
                                UserRegister register = new UserRegister(username,password,email);
                                userController.userRegister(register);
                                System.out.println("Đăng ký thành công : ");
                            } catch (Exception e) {
                                System.out.println("Đăng ký ko thành công");
                            }
                        } else if (fileUtils.checkEmail(email) == false) {
                            System.out.println("Email ko đúng định dạng");
                        } else if (userController.checkEmailDB(email) == false) {
                            System.out.println("Email đã có người sử dụng");
                        }
                        break;
                    } else {
                        System.out.println("Password phải từ 7 đến 15 ký tự");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhập email để đổi password : ");
                    String email = sc.nextLine();
                    if (userController.checkEmailDB(email) == false) {
                        System.out.print("Nhập mật khẩu mới : ");
                        String newPassword = sc.nextLine();
                        if (7 < newPassword.length() && newPassword.length() < 15) {
                            userController.getEmail(email,newPassword);
                            break;
                        } else {
                            System.out.println("Password phải từ 7 đến 15 ký tự");
                        }
                    } else {
                        System.out.println("Không tìm thấy Email " + email);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Thoát");
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }

    public void showMenu() {
        System.out.println("0 -- In ra thông tin người dùng");
        System.out.println("1 -- Đăng nhập");
        System.out.println("2 -- Đăng ký");
        System.out.println("3 -- Quên mật khẩu");
        System.out.println("4 -- Thoát");
    }
}
