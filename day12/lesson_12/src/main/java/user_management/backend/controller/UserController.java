package user_management.backend.controller;

import user_management.backend.request.UserRegister;
import user_management.backend.service.UserService;
import user_management.backend.user.User;

import java.util.List;

public class UserController {
    private final UserService userService = new UserService();
    public List<User> getUser() {
        return userService.getUser();
    }

    public User userRegister(UserRegister register) {
        return userService.userRegister(register);
    }

    public boolean checkEmail(String email) {
        return userService.checkEmail(email);
    }

    public boolean checkPassword(String password) {
        return userService.checkPassword(password);
    }


    public boolean checkEmailDB(String email) {
        return userService.checkEmailDB(email);
    }


    public void checkLogin(String email, String password) {
        userService.checkLogin(email,password);
    }

    public void setUserName(String email, String newUserName) {
        userService.setUserName(email,newUserName);
    }

    public void setUserEmail(String email, String newEmail) {
        userService.setUserEmail(email,newEmail);
    }

    public void setUserPassword(String email, String newPassword) {
        userService.setUserPassword(email,newPassword);
    }
}
