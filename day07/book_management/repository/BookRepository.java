package book_management.repository;


import book_management.database.BookDatabase;
import book_management.model.Book;

// 3a
public class BookRepository {
    public Book[] fildAll() {
        return BookDatabase.books;
    }

    public Book[] findAllCatagory() {
        return BookDatabase.getBooks;
    }

    public Book[] findAllYear() {
        return BookDatabase.getYearOfBooks;
    }
}
