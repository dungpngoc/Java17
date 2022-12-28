package student_management.controller;

import student_management.database.StudentDatabase;
import student_management.repository.StudentRepository;
import student_management.service.StudentService;

import java.util.Scanner;

// Xem danh sách học sinh
// Thêm học sinh mới
// Cập nhập điểm học sinh
// Xóa học sinh
// Xem danh sách học sinh theo lớp
// Sắp xếp theo tên
// Sắp xếp theo tuổi
// Sắp xếp theo điểm
public class StudentController {

    StudentService studentService = new StudentService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;
        while (!isQuit) {

            showMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Danh sách học sinh là:");
                    studentService.showInfo();
                    break;
                }
                case 2: {
                    studentService.addNewStudent();
                    break;
                }
                case 3: {
                    studentService.editPoint();
                    break;
                }
                case 4: {
                    studentService.deleteStudent();
                    break;
                }
                case 5: {
                    studentService.findByClass();
                    break;
                }
                case 6: {
                    studentService.sortByName();
                    break;
                }
                case 7: {
                    studentService.sortByAge();
                    break;
                }
                case 8: {
                    studentService.sortByPoint();
                    break;
                }
                case 9: {
                    isQuit = true;
                    System.out.println("Thoát");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp");
                }
            }
        }
    }


    public void showMenu() {
        System.out.println("-----------Menu----------");
        System.out.println("1 -- Xem danh sách học sinh");
        System.out.println("2 -- Thêm học sinh mới");
        System.out.println("3 -- Cập nhập điểm học sinh");
        System.out.println("4 -- Xoá học sinh");
        System.out.println("5 -- Xem danh sách học sinh theo lớp");
        System.out.println("6 -- Sắp xếp theo tên");
        System.out.println("7 -- Sắp xếp theo tuổi");
        System.out.println("8 -- Sắp xếp theo điểm");
        System.out.println("9 -- Thoát");
    }
}
