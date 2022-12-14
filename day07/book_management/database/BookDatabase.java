package book_management.database;

import book_management.model.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 2.
// Chứa dữ liệu( Chứa những cuốn sách của mình)
public class BookDatabase {
    // 4. database
    // 2. Tạo database để chứa dữ liệu( Chứa những cuốn sách của mình)
    public static Book[] books = {
            new Book(1,"Người khốn khổ"),
            new Book(2,"Dế mèn phiêu lưu ký"),
            new Book(3,"Trò chuyện buổi sáng"),
            new Book(4,"Đắc nhân tâm")
    };

    public static Book[] getBooks = {
            new Book(1,"Người khốn khổ","Tiểu thuyết"),
            new Book(2,"Dế mèn phiêu lưu ký","Hư cấu"),
            new Book(3,"Trò chuyện buổi sáng","Tâm sự"),
            new Book(4,"Đắc nhân tâm","Sách tự lực")
    };

    public static Book[] getYearOfBooks = {
            new Book(1,"Người khốn khổ","Tiểu thuyết", 2022),
            new Book(2,"Dế mèn phiêu lưu ký","Hư cấu",2022),
            new Book(3,"Trò chuyện buổi sáng","Tâm sự",2021),
            new Book(4,"Đắc nhân tâm","Sách tự lực",2019)
    };
}
