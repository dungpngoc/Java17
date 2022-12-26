package user_management.frontend;

import book_management.backend.exception.NotFoundException;
import user_management.backend.controller.UserController;
import user_management.backend.database.UserDB;
import user_management.backend.request.UserRegister;
import user_management.backend.user.User;


import java.util.Scanner;

public class UserUI {
    private final UserController userController = new UserController();

    public void run() {
        boolean isQuit = false;
        Scanner sc = new Scanner(System.in);
        while (!isQuit) {
            showMenuOne();
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
                    for (User user: UserDB.users) {
                        System.out.println(user);
                    }
                    break;
                }
                case 1: {
                    try {
                        System.out.println("-------Login-------");
                        System.out.print("Nhập email : ");
                        String email = sc.nextLine();

                        System.out.print("Nhập password : ");
                        String password = sc.nextLine();
                        userController.checkLogin(email,password);

                        boolean isQuitTwo = false;
                        while (!isQuitTwo) {
                            showMenuTwo();
                            try {
                                System.out.print("Nhập lựa chọn : ");
                                option = Integer.parseInt(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("Lựa chọn không hợp lệ");
                                continue;
                            }
                            switch (option) {
                                case 1: {
                                    System.out.print("Nhập username : ");
                                    String newUserName = sc.nextLine();
                                    userController.setUserName(email,newUserName);
                                    break;
                                }
                                case 2: {
                                    System.out.print("Nhập email mới : ");
                                    String newEmail = sc.nextLine();
                                    if (userController.checkEmail(newEmail) == true && userController.checkEmailDB(newEmail) == true) {
                                        userController.setUserEmail(email,newEmail);
                                        break;
                                    } else if (userController.checkEmail(newEmail) == false) {
                                        System.out.println("Email không đúng định dạng");
                                    } else if (userController.checkEmailDB(newEmail) == false) {
                                        System.out.println("Email đã tồn tại, hãy sử dụng email khác");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.print("Nhập password mới : ");
                                    String newPassword = sc.nextLine();
                                    if (userController.checkPassword(newPassword) == true) {
                                        userController.setUserPassword(email,newPassword);
                                        break;
                                    } else if (userController.checkPassword(newPassword) == false) {
                                        System.out.println("Password phải từ 7 đến 15 ký tự");
                                    }
                                }
                                case 4: {
                                    System.out.println("Quay lại menu chính");
                                    isQuitTwo = true;
                                    break;
                                }
                                case 5: {
                                    System.out.println("Exit, Goodbye see you again");
                                    isQuitTwo = true;
                                    isQuit = true;
                                    break;
                                }
                                default: {
                                    System.out.println("Lựa chọn không hợp lệ");
                                }
                            }
                        }
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    System.out.println("----Đăng ký tài khoản mới----");
                    System.out.print("Nhập user : ");
                    String username = sc.nextLine();

                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();
                    if (userController.checkPassword(password) == false) {
                        System.out.println("Password phải từ 7 đến 15 ký tự");
                    } else if (userController.checkPassword(password) == true) {
                        System.out.print("Nhập Email : ");
                        String email = sc.nextLine();
                        if (userController.checkEmail(email) == true && userController.checkEmailDB(email) == true) {
                            UserRegister register = new UserRegister(username,password,email);

                            User user = userController.userRegister(register);
                            System.out.println("Đăng ký thành công");
                            break;
                        } else if (userController.checkEmail(email) == false) {
                            System.out.println("Email không đúng định dạng");
                        } else if (userController.checkEmailDB(email) == false) {
                            System.out.println("Email đã tồn tại, hãy sử dụng email khác");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhập email để đổi password : ");
                    String email = sc.nextLine();
                    if (userController.checkEmailDB(email) == false) {
                        System.out.print("Nhập mật khẩu mới : ");
                        String newPassword = sc.nextLine();
                        if (userController.checkPassword(newPassword) == true) {
                            userController.setUserPassword(email,newPassword);
                            System.out.println("Hãy đăng nhập lại");
                            break;
                        } else if (userController.checkPassword(newPassword) == false) {
                            System.out.println("Password phải từ 7 đến 15 ký tự");
                        }
                    } else if (userController.checkEmailDB(email) == true) {
                        System.out.println("Tài khoản chưa tồn tại");
                    }
                    break;
                }
            }
        }
    }

    private void showMenuOne() {
        System.out.println("0 -- In ra thông tin người dùng");
        System.out.println("1 -- Đăng nhập");
        System.out.println("2 -- Đăng ký");
        System.out.println("3 -- Quên mật khẩu");
        System.out.println("4 -- Thoát");
    }

    private void showMenuTwo() {
        System.out.println("1 -- Thay đổi username");
        System.out.println("2 -- Thay đổi email");
        System.out.println("3 -- Thay đổi password");
        System.out.println("4 -- Đăng xuất");
        System.out.println("5 -- Thoát");
    }
}
