package book_management.service;


import book_management.database.BookDatabase;
import book_management.model.Book;
import book_management.repository.BookRepository;

import java.time.LocalDate;

// 3b.
// Sử lý những logic trong ứng dụng này ( Tìm kiếm sách theo tên...)--> Phải tạo ra dữ liệu của nó ( Tạo BookRepository)
public class BookService {
    public BookRepository bookRepository = new BookRepository();

    public void findByTitle(String title) {
        int count = 0;
        for (Book book: bookRepository.fildAll()) {
            if (book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có quyển sách nào có title = " + title);
        }
    }

    public void findByCategory(String category) {
        int count = 0;
        for (Book book: bookRepository.findAllCatagory()) {
            if (book.category.toLowerCase().contains(category.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có quyển sách nào có category = " + category);
        }
    }

    public void findByYear(int yearOfManufacture) {
        int count = 0;
        for (Book book:bookRepository.findAllYear()) {
            if (book.yearOfManufacture == LocalDate.now().getYear()) {
                System.out.println(book);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có quyển sách nào sản xuất năm nay");
        }
    }
}
