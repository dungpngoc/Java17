package user_management.backend.repository;

import book_management.backend.exception.NotFoundException;
import user_management.backend.database.UserDB;
import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;

import java.util.List;

public class UserRepository {
    public List<User> findAll() {
        return UserDB.users;
    }

    public void saveUser(User user) {
        UserDB.users.add(user);
        FileUtils.setDataToFile("list-user.json",UserDB.users);
    }


}
