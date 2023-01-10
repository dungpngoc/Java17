package TGDDproduct_management.backend.repository;

import TGDDproduct_management.backend.database.UserDB;
import TGDDproduct_management.backend.model.Address;
import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;

public class UserRepository {
    public void saveUser(User user) {
        UserDB.users.add(user);
        FileUtils.setDataToFile("user.json",UserDB.users);
    }

    public List<User> findAllUser() {
        return UserDB.users;
    }


    public void updateInfo(String email, Address address) {
        for (User user: UserDB.users) {
            if (user.getEmail().equals(email)) {
                user.setAddress(address);
                FileUtils.setDataToFile("user.json",UserDB.users);
            }
        }
        System.out.println("Cập nhập thành công");
    }
}
