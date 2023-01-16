package TGDDproduct_management.backend.utils;

import TGDDproduct_management.backend.model.Cart;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import TGDDproduct_management.backend.model.Admin;
import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.model.User;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileUtils {
    // 1. Đọc dữ liệu Product từ file list-product.json
    public static ArrayList<Product> getDataFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Type type = new TypeToken<ArrayList<Product>>(){}.getType();
            ArrayList<Product> products = gson.fromJson(reader, type);
            reader.close();
            return products;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 2. Đọc dữ liệu User từ file user.json
    public static ArrayList<User> getDataUserFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Type type = new TypeToken<ArrayList<User>>(){}.getType();
            ArrayList<User> users = gson.fromJson(reader, type);
            reader.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 3. Đọc dữ liệu Admin từ file admin.json
    public static ArrayList<Admin> getDataAdminFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Type type = new TypeToken<ArrayList<Admin>>(){}.getType();
            ArrayList<Admin> admin = gson.fromJson(reader, type);
            reader.close();
            return admin;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 4. Ghi dữ liệu vào file json
    public static void setDataToFile(String fileName, Object obj) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            gson.toJson(obj, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5. Lấy dữ liệu Cart từ file cart.json
    public static ArrayList<Cart> getDataCartFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Type type = new TypeToken<ArrayList<Cart>>(){}.getType();
            ArrayList<Cart> carts = gson.fromJson(reader, type);
            reader.close();
            return carts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
