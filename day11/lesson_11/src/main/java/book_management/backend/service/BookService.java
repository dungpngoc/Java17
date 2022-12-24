package book_management.backend.service;

import book_management.backend.database.BookDB;
import book_management.backend.model.Book;
import book_management.backend.repository.BookRepository;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
// 6. BookService lấy dữ liệu từ Repo nên phải khởi tạo đối tượng Repo để gọi phương thức lấy dữ liệu từ DB
// Logic sẽ đặt ở service( những tính toán phức tạp sẽ đặt ở đây)
public class BookService {
    private final BookRepository bookRepository = new BookRepository();
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByName(String name) {
        List<Book> books = bookRepository.findAll();
        List<Book> rs = new ArrayList<>();
        for (Book book: books) {
            if (book.getTitle().toLowerCase().contains(name.toLowerCase())){
                rs.add(book);
            }
        }
        return rs;
    }

    public void deleteBook(int id) {
        // Không có sách -> báo lỗi
        Book book = bookRepository.findById(id);

        // Có sách -> xoá
        bookRepository.delete(book);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        // Không có sách -> báo lỗi
        Book book = bookRepository.findById(id);

        // Có sách -> cập nhập
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        FileUtils.setDataToFile("json-book.json", BookDB.books);
        return book;
    }
}
