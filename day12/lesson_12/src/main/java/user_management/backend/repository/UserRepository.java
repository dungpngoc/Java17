package user_management.backend.repository;

import user_management.backend.controller.UserController;
import user_management.backend.database.UserDatabase;
import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;
import java.util.Scanner;


public class UserRepository {
    FileUtils fileUtils = new FileUtils();


    Scanner sc = new Scanner(System.in);
    public void findByData(String email, String password) {
        int count = 0;
        for (int i = 0; i < UserDatabase.users.size(); i++) {
            if (UserDatabase.users.get(i).getEmail().contains(email) && UserDatabase.users.get(i).getPassword().contains(password)) {
                System.out.println("Chúc mừng " + UserDatabase.users.get(i).getUsername() + ", bạn có thể thực hiện các công việc sau: ");
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
                        case 1: {
                            System.out.print("Nhập username : ");
                            String newUserName = sc.nextLine();
                            UserDatabase.users.get(i).setUsername(newUserName);
                            FileUtils.setDataToFile("list-user.json",UserDatabase.users);
                            System.out.println("Thay đổi username thành công");
                            break;
                        }
                        case 2: {
                            System.out.print("Nhập Email : ");
                            String newEmail = sc.nextLine();
                            if (fileUtils.checkEmail(newEmail) == true && UserController.checkEmailDB(newEmail) == true) {
                                UserDatabase.users.get(i).setEmail(newEmail);
                                FileUtils.setDataToFile("list-user.json",UserDatabase.users);
                                System.out.println("Thay đổi Email thành công");
                            } else if (fileUtils.checkEmail(email) == false) {
                                System.out.println("Email ko đúng định dạng");
                            } else if (UserController.checkEmailDB(email) == false) {
                                System.out.println("Email đã có người sử dụng");
                            }
                            break;
                        }
                        case 3: {
                            System.out.print("Nhập password : ");
                            String newPassword = sc.nextLine();
                            if (7 <= newPassword.length() && newPassword.length() <= 15) {
                                UserDatabase.users.get(i).setPassword(newPassword);
                                FileUtils.setDataToFile("list-user.json",UserDatabase.users);
                                System.out.println("Thay đổi password thành công");
                            } else {
                                System.out.println("Password phải từ 7 đến 15 ký tự");
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Đăng xuất");
                            isQuit = true;
                            break;
                        }
                        case 5: {
                            System.out.println("Thoát");
                            isQuit = true;
                            break;
                        }
                    }
                }
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Chưa tồn tại tài khoản");
        }
    }

    // Tìm email có tồn tại trong list ko
    public boolean checkByEmail(String email) {
        for (User user: UserDatabase.users) {
            if (user.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public void saveUser(User user) {
        UserDatabase.users.add(user);
        FileUtils.setDataToFile("list-user.json",UserDatabase.users);
    }

    public void showMenu() {
        System.out.println("1 -- Thay đổi username");
        System.out.println("2 -- Thay đổi email");
        System.out.println("3 -- Thay đổi password");
        System.out.println("4 -- Đăng xuất");
        System.out.println("5 -- Thoát");
    }


    public void savePassword(String email, String newPassword) {
        for (int i = 0; i < UserDatabase.users.size(); i++) {
            if (UserDatabase.users.get(i).getEmail().equals(email)) {
                UserDatabase.users.get(i).setPassword(newPassword);
            }
        }
        System.out.println("Thay đổi password thành công");
        FileUtils.setDataToFile("list-user.json",UserDatabase.users);
    }
}
