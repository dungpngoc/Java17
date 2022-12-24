package book_management.backend.repository;

import book_management.backend.database.BookDB;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.utils.FileUtils;

import java.util.List;
// 7. Chỉ có repo mới thao tác trực tiếp với database
public class BookRepository {
    public List<Book> findAll() {
        return BookDB.books;
    }

    public Book findById(int id) {
        for (Book b: BookDB.books) {
            if (b.getId() == id) {
                return b;
            }
        }
        throw new NotFoundException("Không tìm thấy quyển sách có id = " + id);
    }

    public void delete(Book book) {
        BookDB.books.remove(book);
        FileUtils.setDataToFile("list-book.json",BookDB.books);
    }
}
