package user_management.backend.service;

import book_management.backend.exception.NotFoundException;
import user_management.backend.database.UserDB;
import user_management.backend.repository.UserRepository;
import user_management.backend.request.UserRegister;
import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;

import java.util.List;
import java.util.regex.Pattern;

public class UserService {
    private final UserRepository userRepository = new UserRepository();
    public List<User> getUser() {
        return userRepository.findAll();
    }

    public User userRegister(UserRegister register) {
        User user = new User();
        user.setUsername(register.getUsername());
        user.setPassword(register.getPassword());
        user.setEmail(register.getEmail());

        userRepository.saveUser(user);
        return user;
    }

    public boolean checkEmail(String email) {
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return patternMatches(email,regexPattern);
    }


    public static boolean patternMatches(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

    public boolean checkPassword(String password) {
        if (7 <= password.length() && password.length() <= 15) {
            return true;
        }
        return false;
    }

    public boolean checkEmailDB(String email) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }


    public User checkLogin(String email, String password) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.printf("Chào mừng %s bạn có thể thực hiện các công việc sau : ", user.getUsername());
                System.out.println();
                return user;
            }
        } throw new NotFoundException("Tài khoản hoặc mật khẩu không chính xác");
    }

    public void setUserName(String email, String newUserName) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setUsername(newUserName);
                FileUtils.setDataToFile("list-user.json",UserDB.users);
                System.out.println("Thay đổi username thành công");
            }
        }
    }

    public void setUserEmail(String email, String newEmail) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setEmail(newEmail);
                FileUtils.setDataToFile("list-user.json",UserDB.users);
                System.out.println("Thay đổi Email thành công");
            }
        }
    }

    public void setUserPassword(String email, String newPassword) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setPassword(newPassword);
                FileUtils.setDataToFile("list-user.json",UserDB.users);
                System.out.println("Thay đổi password thành công");
            }
        }
    }
}
