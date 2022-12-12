package book_management.model;

import java.time.LocalDate;

public class Book {
    // 1.
    // Khai báo thuộc tính id và title của lớp Book
    public int id;
    public String title;
    public String category;
    public int yearOfManufacture;


    // Khai báo contructor để tí khởi tạo đối tượng
    public Book() {}

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, String category) {
        this(id,title);
        this.category = category;
    }

    public Book(int id, String title, String category, int yearOfManufacture) {
        this(id,title,category);
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
