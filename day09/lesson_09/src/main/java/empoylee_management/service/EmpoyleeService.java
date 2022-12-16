package empoylee_management.service;


import empoylee_management.database.EmpoyleeDB;
import empoylee_management.model.Empoylee;
import empoylee_management.repository.EmpoyleeRepository;

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

    // 3. Tìm nhân viên theo tên
    public void findByName(String name) {
        int count = 0;
        for (Empoylee names: empoyleeRepository.findByNameContainsIgnoreCase()) {
            if (names.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(names);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có nhân viên nào cùng tên " + name);
        }
    }

    // 4. Tìm theo id
    public void findById(int id) {
        int count = 0;
        for (Empoylee ids: empoyleeRepository.findAllId()) {
            if (ids.getId() == id) {
                System.out.println("Nhân viên có id " + id + " là: ");
                System.out.println(ids);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có nhân viên nào cùng có id là: " + id);
        }
    }

    // 5. Tìm id và xoá
    public void deleteById(int id) {
        int count = 0;
        for (Empoylee deleteInfo: empoyleeRepository.findIdDelete()) {
            if (deleteInfo.getId() == id) {
                EmpoyleeDB.empoylees.remove(deleteInfo);
                System.out.println("Danh sách nhân viên sau khi xoá");
                System.out.println(EmpoyleeDB.empoylees);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có id nào giống với id là: " + id);
        }
    }

    // 6. Tìm nhân viên có mức lương
    public void findBySalary(int minSalary,int maxSalary) {
        int count = 0;
        for (Empoylee findSalary:empoyleeRepository.findAllSalary()) {
            if (minSalary < findSalary.getSalary() && findSalary.getSalary() < maxSalary) {
                System.out.println(findSalary);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có nhân viên nào có mức lương trong khoảng");
        }
    }
}
