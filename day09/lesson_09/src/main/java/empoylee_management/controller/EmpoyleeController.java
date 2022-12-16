package empoylee_management.controller;

import empoylee_management.repository.EmpoyleeRepository;
import empoylee_management.service.EmpoyleeService;


import java.util.Arrays;
import java.util.Scanner;

public class EmpoyleeController {
    EmpoyleeRepository empoyleeRepository = new EmpoyleeRepository();
    EmpoyleeService empoyleeService = new EmpoyleeService();
    public void run() {

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập lựa chọn:");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Thông tin tất cả các nhân viên là:");
                    empoyleeService.printInfo();
                    break;
                }
                case 2: {
                    System.out.println("Thêm thông tin thành viên mới:");
                    empoyleeService.saveInfo();
                    break;
                }
                case 3: {
                    System.out.print("Nhập tên nhân viên cần tìm:");
                    String name = sc.nextLine();
                    empoyleeService.findByName(name);
                    break;
                }
                case 4: {
                    System.out.print("Nhập id cần tìm:");
                    int id = Integer.parseInt(sc.nextLine());
                    empoyleeService.findById(id);
                    break;
                }
                case 5: {
                    System.out.print("Nhập id cần xoá: ");
                    int id = Integer.parseInt(sc.nextLine());
                    empoyleeService.deleteById(id);
                    break;
                }
                case 6: {
                    System.out.printf("Nhân viên có mức lương từ %d, đến %d là:",5_000_000,10_000_000);
                    empoyleeService.findBySalary(5_000_000,10_000_000);
                    break;
                }
                case 7: {
                    isQuit = true;
                    System.out.println("Thoát");
                    break;
                }
                default:{
                    System.out.println("Lựa chọn không đúng");
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - In ra thông tin tất cả nhân viên");
        System.out.println("2 - Thêm nhân viên mới");
        System.out.println("3 - Tìm kiếm nhân viên theo tên");
        System.out.println("4 - Tìm kiếm nhân viên theo id");
        System.out.println("5 - Xoá nhân viên theo id");
        System.out.println("6 - Tìm kiếm nhân viên có mức lương từ 5.000.000 --> 10.000.000");
        System.out.println("7 - Thoát\n");
    }
}
