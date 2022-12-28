package empoylee_management.service;


import empoylee_management.database.EmpoyleeDB;
import empoylee_management.model.Empoylee;
import empoylee_management.repository.EmpoyleeRepository;

import java.util.Iterator;
import java.util.Scanner;

public class EmpoyleeService {
    public EmpoyleeRepository empoyleeRepository = new EmpoyleeRepository();



    // 1. In ra thông tin tất cả nhân viên
    public void printInfo() {
        for (int i = 0; i < empoyleeRepository.findAll().size(); i++) {
            System.out.println(empoyleeRepository.findAll().get(i));
        }
    }
    // 2 Thêm thành viên mới
    public void saveInfo() {
        Empoylee empoylee = new Empoylee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        empoylee.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập tên: ");
        empoylee.setName(sc.nextLine());
        System.out.print("Nhập email: ");
        empoylee.setEmail(sc.nextLine());
        System.out.print("Nhập salary: ");
        empoylee.setSalary(Integer.parseInt(sc.nextLine()));
        System.out.println("Thông tin thành viên mới là:");
        System.out.println(empoylee);
        EmpoyleeDB.empoylees.add(empoylee);
    }
}
