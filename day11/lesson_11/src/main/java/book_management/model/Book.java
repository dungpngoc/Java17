package book_management.model;

import lombok.*;

// Viết chương trình quản lý sách gồm các thông tin id, title, category, author, page_number, release_year,
// với category là một mảng String. Thực hiện các công việc sau:
//
//Lấy thông tin toàn bộ sách
//Tim sách theo tên
//Tìm sách theo thể loại
//Sắp xếp sách theo số trang
//Sắp xếp sách theo năm xuất bản
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int page_number;
    private int release_year;
}
