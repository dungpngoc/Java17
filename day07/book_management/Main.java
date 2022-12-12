package book_management;

import book_management.controller.BookController;

public class Main {
    // Chi tiết các layer
    // 1. controller : Tiếp nhận request từ người dùng (Nhấn 1,2,3 để thực hiện các chức năng - làm menu)
    // 2. model : Chứa các đối tượng (Student, Person, Film,...)
    // 3. service: Chứa business logic của ứng dụng
    // 4. database : Chứa dữ liệu của ứng dụng (database)
    // 5. Repository : Chứa phương thức để lấy dữ liệu
    //    // model : Chứa các đối tượng (Student, Person, Film,...)
    // actor --> gửi request (1,2,3) --> controller --> gửi thông tin request --> service --> repository

    // 5.
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
