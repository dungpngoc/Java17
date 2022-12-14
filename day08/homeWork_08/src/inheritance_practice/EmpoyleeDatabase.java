package inheritance_practice;

import java.util.Scanner;

public class EmpoyleeDatabase {
    Scanner sc = new Scanner(System.in);
    public void runDev() {
        Deverloper deverloper = new Deverloper();
        System.out.print("Nhập id nhân viên: ");
        deverloper.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập tên nhân viên: ");
        deverloper.setName(sc.nextLine());
        System.out.print("Nhập tuổi nhân viên: ");
        deverloper.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập số điện thoại nhân viên: ");
        deverloper.setPhone(sc.nextLine());
        System.out.print("Nhập Email nhân viên: ");
        deverloper.setEmail(sc.nextLine());
        System.out.print("Nhập lương cơ bản nhân viên: ");
        deverloper.setSalaryBasic(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập số giờ làm thêm: ");
        deverloper.setOvertimeHours(Integer.parseInt(sc.nextLine()));
        System.out.println("Thông tin nhân viên là: ");
        deverloper.showInfoDev();
        deverloper.calculateSalary();
    }

    public void runTester() {
        Tester tester = new Tester();
        System.out.print("Nhập id nhân viên: ");
        tester.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập tên nhân viên: ");
        tester.setName(sc.nextLine());
        System.out.print("Nhập tuổi nhân viên: ");
        tester.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập số điện thoại nhân viên: ");
        tester.setPhone(sc.nextLine());
        System.out.print("Nhập Email nhân viên: ");
        tester.setEmail(sc.nextLine());
        System.out.print("Nhập lương cơ bản nhân viên: ");
        tester.setSalaryBasic(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập số lỗi: ");
        tester.setError(Integer.parseInt(sc.nextLine()));
        System.out.println("Thông tin nhân viên là: ");
        tester.showInfoTester();
        tester.calculateSalary();
    }
}
