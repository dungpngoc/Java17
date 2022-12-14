package film_manegement.controller;

import film_manegement.repository.FilmRepository;
import film_manegement.service.FilmService;

import java.util.Scanner;

// 5. Tạo ra cái menu để người dùng chọn
// Khởi tạo đối tượng thì mới gọi được findByTitle để xử lý
public class FilmController {
    public FilmService filmService = new FilmService();
    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Thông tin các bộ phim");
                    filmService.filmInfo();
                    break;
                }
                case 2: {
                    System.out.print("Nhập tiêu đề phim cần tìm: ");
                    String title = sc.nextLine();
                    filmService.findBytitle(title);
                    break;
                }
                case 3: {
                    System.out.println("Thoát");
                    isQuit = true;
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("*********Menu*********");
        System.out.println("1 - In ra thông tin phim");
        System.out.println("2 - Tìm kiếm phim theo tiêu đề");
        System.out.println("3 - Thoát");
    }
}
