package book_management.controller;

import book_management.service.BookService;

import java.util.Scanner;
//Lấy thông tin toàn bộ sách
//Tim sách theo tên
//Tìm sách theo thể loại
//Sắp xếp sách theo số trang
//Sắp xếp sách theo năm xuất bản
public class BookController {
    BookService bookService = new BookService();

    public void run() {
        int option = 0;
        boolean isQuit = false;
        Scanner sc = new Scanner(System.in);
        while (!isQuit) {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    bookService.printInfo();
                    break;
                }
                case 2: {
                    bookService.findByName();
                    break;
                }
                case 3: {
                    bookService.findByCategory();
                    break;
                }
                case 4: {
                    bookService.sortByPageNumber();
                    break;
                }
                case 5: {
                    bookService.sortByReleaseYear();
                    break;
                }
                case 6: {
                    isQuit = true;
                    System.out.println("Thoát");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    public void showMenu() {
        System.out.println("----------Menu----------");
        System.out.println("1 -- In thông tin toàn bộ sách");
        System.out.println("2 -- Tìm sách theo tên");
        System.out.println("3 -- Tìm sách theo thể loại");
        System.out.println("4 -- Sắp xếp sách theo số trang");
        System.out.println("5 -- Sắp xếp sách theo năm xuất bản");
        System.out.println("6 -- Thoát");
    }
}
