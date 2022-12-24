package user_management.backend.controller;

import user_management.backend.request.UserRegister;
import user_management.backend.service.UserService;
import user_management.backend.user.User;


public class UserController {
    UserService userService = new UserService();
    public void getUser(String email, String password) {
        userService.getUser(email,password);
    }


    public User userRegister(UserRegister register) {
        return userService.userRegister(register);
    }

    public static boolean checkEmailDB(String email) {
       return UserService.checkEmailDB(email);
    }

    public void getEmail(String email, String newPassword) {
        userService.getEmail(email,newPassword);
    }
}
