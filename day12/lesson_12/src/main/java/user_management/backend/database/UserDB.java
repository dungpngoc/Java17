package user_management.backend.database;

import user_management.backend.user.User;
import user_management.backend.utils.FileUtils;

import java.util.List;

public class UserDB {
    public static List<User> users = FileUtils.getDataFromFile("list-user.json");
}
