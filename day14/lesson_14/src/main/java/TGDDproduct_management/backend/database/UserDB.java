package TGDDproduct_management.backend.database;

import TGDDproduct_management.backend.model.User;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;

public class UserDB {
    public static List<User> users = FileUtils.getDataUserFromFile("user.json");
}
