package book_management;

import book_management.controller.BookController;

public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
