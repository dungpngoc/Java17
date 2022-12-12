package book_management.controller;

import book_management.service.BookService;

import java.util.Scanner;

public class BookController {
    // 4. Tạo ra cái menu để người dùng chọn
    // Khởi tạo đối tượng thì mới gọi được findByTitle để xử lý
    public BookService bookService = new BookService();
    public void run() {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Nhập tiêu đề cần tìm : ");
                    String title = sc.nextLine();
                    bookService.findByTitle(title);
                    break;
                }
                case 2: {
                    System.out.print("Nhập thể loại cần tìm: ");
                    String category = sc.nextLine();
                    bookService.findByCategory(category);
                    break;
                }
                case 3: {
                    System.out.print("Nhập năm sản xuất: ");
                    int yearOfManufacture = Integer.parseInt(sc.nextLine());
                    bookService.findByYear(yearOfManufacture);
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tìm kiếm theo tên");
        System.out.println("2 - Tìm kiếm theo thể loại");
        System.out.println("3 - Tìm kiếm theo năm sản xuất");
        System.out.println("4 - Thoát\n");
    }
}
