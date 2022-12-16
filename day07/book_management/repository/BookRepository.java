package book_management.repository;


import book_management.database.BookDatabase;
import book_management.model.Book;

public class BookRepository {
    // 3 repository
    // 3 Chứa các phương thức để lấy dữ liệu từ database
    public Book[] fildAll() {
        return BookDatabase.books;
    }

    public Book[] findAllCategory() {
        return BookDatabase.getBooks;
    }

    public Book[] findAllYear() {
        return BookDatabase.getYearOfBooks;
    }
}