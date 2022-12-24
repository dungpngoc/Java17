package book_management.backend.controller;

import book_management.backend.model.Book;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.service.BookService;

import java.util.List;
// 5. Để gọi được method trong Service thì phải tạo đối tượng service để lấy dữ liệu từ trên về
// Controller sẽ ko sử lý logic mà gọi trực tiếp phương thức từ service, giữ mỏng nhẹ nhất có thể
public class BookController {
    private final BookService bookService = new BookService();
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    public List<Book> getBooksByName(String name) {
        return bookService.getBooksByName(name);
    }

    public void deleteBook(int id) {
        bookService.deleteBook(id);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        // Những thông tin nhận đc từ giao diện ( id, request: title + author) sẽ đi vào controller. Gọ phương thức
        // updateBook ở bên service xử lý thông tin này
        return bookService.updateBook(id,request);
    }
}
