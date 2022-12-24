package book_management.backend.utils;

import book_management.backend.model.Book;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


// 2. Tạo hàm đọc dữ liệu từ file và hàm ghi dữ liệu vào file
public class FileUtils {
    // 1. Đọc dữ liệu từ file json
    public static ArrayList<Book> getDataFromFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            ArrayList<Book> books = gson.fromJson(reader, type);

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 2. Ghi dữ liệu vào file json
    public static void setDataToFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
