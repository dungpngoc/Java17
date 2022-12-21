package book_management.repository;

import book_management.model.Book;
import com.google.gson.Gson;
import gson_demo.Student;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Lấy thông tin toàn bộ sách
// Tim sách theo tên
// Tìm sách theo thể loại
// Sắp xếp sách theo số trang
// Sắp xếp sách theo năm xuất bản
public class BookRepository {

    // Lấy dữ liệu từ file json binding vào class để in ra
    List<Book> book = getObjectFromJsonFile("list-book.json");
    public void printInfo() {
        System.out.println("Thông tin tất cả các cuốn sách:");
        for (Book book1: book) {
            System.out.println(book1);
        }
    }
    public static List<Book> getObjectFromJsonFile(String fileName) {
        try {
            // Tạo đối tượng json
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file json
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Tạo đối tượng stundent để binding vào class thông tin đã đọc từ file json
            List<Book> book = Arrays.asList(gson.fromJson(reader, Book[].class));

            // Đọc xong file thì đóng lại và trả về kết quả
            reader.close();
            return book;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
