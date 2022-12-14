package student_management.service;

import student_management.model.Student;

import java.util.Random;
import java.util.Scanner;

    // 2. Tạo class StudentService để thực hiện 1 số chức năng liên quan đến student:

public class StudentService {
    // Tạo học viên bằng cách nhập vào thông tin học viên từ bàn phím:
    // name, theoryPoint, practicePoint (id thì được random ngẫu nhiên trong khoảng 1 -->100)
    public Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int id = rd.nextInt(100) + 1;
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter theoryPoint : ");
        double theoryPoint = Double.parseDouble(sc.nextLine());

        System.out.print("Enter practicePoint : ");
        double practicePoint = Double.parseDouble(sc.nextLine());

        Student std = new Student(id,name,theoryPoint,practicePoint);
        return std;
    }

    // Method tính toán điểm trung bình của học viên điểm TB = (Điểm lý thuyết + Điểm thực hành) / 2
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return (theoryPoint + practicePoint) / 2;
    }

    // Method để in ra thông tin của học viên bao gồm : Thông tin của học viên + điểm TB
    public void printInfo(Student s) {
        System.out.println("id : " + s.id);
        System.out.println("name : " + s.name);
        System.out.println("theoryPoint : " + s.theoryPoint);
        System.out.println("practicePoint : " + s.practicePoint);
        System.out.println("avgPoint : " + calculateAvgPoint(s.theoryPoint, s.practicePoint));
    }
}
