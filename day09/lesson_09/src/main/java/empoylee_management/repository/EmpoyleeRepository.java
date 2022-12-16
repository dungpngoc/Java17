package empoylee_management.repository;

import empoylee_management.database.EmpoyleeDB;
import empoylee_management.model.Empoylee;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class EmpoyleeRepository {
    // Repository chứa phương thức lấy dữ liệu từ database
    // 1 In ra thông tin tất cả nhân viên
    public ArrayList<Empoylee> findAll() {
        return EmpoyleeDB.empoylees;
    }



    // 3 Tìm theo tên
    public ArrayList<Empoylee> findByNameContainsIgnoreCase() {
       return EmpoyleeDB.empoylees;
    }

    // 4. Tìm theo id
    public ArrayList<Empoylee> findAllId() {
        return EmpoyleeDB.empoylees;
    }

    // 5. Xoá theo id
    public ArrayList<Empoylee> findIdDelete() {
        return EmpoyleeDB.empoylees;
    }

    // Tìm mức lương trong khoảng
    public ArrayList<Empoylee> findAllSalary() {
        return EmpoyleeDB.empoylees;
    }
}
