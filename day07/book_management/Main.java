package book_management;

import book_management.controller.BookController;

public class Main {
    // Chi tiết các layer 1 gọi 2 gọi 3 gọi 4
    // 1. controller : Tiếp nhận request từ người dùng (Nhấn 1,2,3 để thực hiện các chức năng - làm menu)
    // 2. service : Chứa các đối tượng (Student, Person, Film,...)
    // 3. repository : Chứa phương thức để lấy dữ liệu
    // 4. database : Chứa dữ liệu của ứng dụng (database)

    // model : Chứa các đối tượng (Student, Person, Film,...)

    // actor --> gửi request (1,2,3) --> controller --> gửi thông tin request --> service --> repository

    // 6. tạo đối tượng để gọi phương thức chạy chương trình ở BookController (Mục 5)
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
