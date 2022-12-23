package user_management.backend.utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import user_management.backend.user.User;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FileUtils {
    public static ArrayList<User> getDataFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Type type = new TypeToken<ArrayList<User>>(){}.getType();
            ArrayList<User> users = gson.fromJson(reader, type);
            reader.close();
            return users;
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return new ArrayList<>();
    }

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

    // Sử dụng regex để check email đúng định dạng

    public boolean checkEmail(String email) {
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return patternMatches(email,regexPattern);
    }


    public static boolean patternMatches(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

}
