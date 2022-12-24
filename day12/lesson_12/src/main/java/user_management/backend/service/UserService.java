package user_management.backend.service;

import user_management.backend.database.UserDatabase;
import user_management.backend.repository.UserRepository;
import user_management.backend.request.UserRegister;
import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;


public class UserService {
    static UserRepository userRepository = new UserRepository();
    public void getUser(String email, String password) {
        userRepository.findByData(email,password);
    }

    public User userRegister(UserRegister register) {
        User user = new User();
        user.setUsername(register.getUsername());
        user.setPassword(register.getPassword());
        user.setEmail(register.getEmail());
        userRepository.saveUser(user);

        return user;
    }

    public static boolean checkEmailDB(String email) {
        return userRepository.checkByEmail(email);
    }

    public void getEmail(String email, String newPassword) {
        userRepository.savePassword(email,newPassword);
    }
}
