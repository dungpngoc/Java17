package book_management.frontend;

import book_management.backend.controller.BookController;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.utils.FileUtils;

import java.util.List;
import java.util.Scanner;
// 4. Tạo menu cho người dung nhập và tạo ngược các phương thức từ case 1
public class BookUI {
    private final BookController bookController = new BookController();

    public void run() {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            // Ngoại lệ khi nhập đúng thì sẽ chạy vào case, sai thì sẽ vào catch
            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }

            switch (option) {
                case 1: {
                    List<Book> books = bookController.getBooks();
                    if (books.isEmpty()) {
                        System.out.println("Không có quyển sách nào");
                    } else {
                        System.out.println("Danh sách book : ");
                        for (Book b: books) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhập tên cuốn sách : ");
                    String name = sc.nextLine();

                    List<Book> books = bookController.getBooksByName(name);
                    if (books.isEmpty()) {
                        System.out.println("Không có quyển sách nào có tên là " + name);
                    } else {
                        System.out.println("Danh sách book có tên " + name + " là : ");
                        for (Book b: books) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhập id cần xoá : ");
                    int id = Integer.parseInt(sc.nextLine());
                    try {
                        bookController.deleteBook(id);
                    } catch (NotFoundException e) {
                        System.out.println("Không tìm thấy quyển sách có id = " + id);
                    }

                    break;
                }
                case 4: {
                    System.out.print("Nhập id cần chỉnh sửa : ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập vào tiêu đề : ");
                    String title = sc.nextLine();

                    System.out.print("Nhập vào tên tác giả : ");
                    String author = sc.nextLine();

                    // Sau khi có hết thông tin nhập vào thì khởi tạo:
                    UpdateBookRequest request = new UpdateBookRequest(title,author);
                    // Sau khi cập nhập xong thì trả về thông tin đã cập nhập để hiển thị lên cho ng dùng nhìn thấy
                    try {
                        Book book = bookController.updateBook(id,request);
                        System.out.println("Thông tin sách sau khi cập nhập là : ");
                        System.out.println(book);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 5: {

                }
                case 6: {
                    isQuit = true;
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Xem danh sách book");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Xóa sách theo id");
        System.out.println("4 - Thay đổi thông tin book");
        System.out.println("5 - Tạo sách");
        System.out.println("6 - Thoát\n");
    }
}
