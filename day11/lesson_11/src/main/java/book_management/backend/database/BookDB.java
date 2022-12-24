package book_management.backend.database;

import book_management.backend.model.Book;
import book_management.backend.utils.FileUtils;

import java.util.List;
// 3. Tạo biến để hứng dữ liệu từ file, để lấy dữ liệu làm logic
public class BookDB {
    // Tạo biến books dữ liệu trả về là List<Book>, hứng dữ liệu lấy ra từ file "list-book.json" sử dụng hàm getDataFromFile
    // lấy ra từ class FileUtils
    // public static ArrayList<Book> books = new ArrayList<>();
     public static List<Book> books = FileUtils.getDataFromFile("list-book.json");
}
