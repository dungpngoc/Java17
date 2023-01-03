package TGDDproduct_management.backend.database;

import TGDDproduct_management.backend.model.Admin;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;

public class AdminDB {
    public static List<Admin> admins = FileUtils.getDataAdminFromFile("admin.json");
}
