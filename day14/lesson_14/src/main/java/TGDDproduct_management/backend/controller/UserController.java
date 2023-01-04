package TGDDproduct_management.backend.controller;

import TGDDproduct_management.backend.model.Address;
import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.request.UserRegister;
import TGDDproduct_management.backend.service.UserService;

import java.util.List;

public class UserController {
    private final UserService userService = new UserService();
    public List<User> getUser() {
        return userService.getUser();
    }
    public User userRegister(UserRegister register) {
        return userService.userRegister(register);
    }

    public boolean checkPassword(String password) {
        return userService.checkPassword(password);
    }

    public boolean checkEmail(String email) {
        return userService.checkEmail(email);
    }

    public boolean checkEmailDB(String email) {
        return userService.checkEmailDB(email);
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        return userService.checkPhoneNumber(phoneNumber);
    }

    public void checkLogin(String email, String password) {
        userService.checkLogin(email,password);
    }

    public void updateInfo(String email, Address address) {
        userService.updateInfo(email,address);
    }
}
