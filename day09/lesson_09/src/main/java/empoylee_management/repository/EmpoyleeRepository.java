package empoylee_management.repository;

import empoylee_management.database.EmpoyleeDB;
import empoylee_management.exception.InValidSalaryException;
import empoylee_management.exception.NotFoundException;
import empoylee_management.model.Empoylee;


import java.util.ArrayList;

public class EmpoyleeRepository {
    // Repository chứa phương thức lấy dữ liệu từ database
    // 1 In ra thông tin tất cả nhân viên
    public ArrayList<Empoylee> findAll() {
        return EmpoyleeDB.empoylees;
    }



    // 3 Tìm theo tên
    public Empoylee findByNameContainsIgnoreCase(String name) {
        for (Empoylee empoylee: EmpoyleeDB.empoylees) {
            if (empoylee.getName().contains(name)) {
                return empoylee;
            }
        }
        throw new NotFoundException("Not found empoylee with name: " + name);
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

    // // 4. Tìm theo id
    public Empoylee findById(int id) throws NotFoundException {
        for (Empoylee e : EmpoyleeDB.empoylees) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new NotFoundException("Not found empoylee with id = " + id);
    }

    // 5. Tìm id và xoá
    public void deleteById(int id) throws NotFoundException {
        Empoylee empoylee = findById(id);
        EmpoyleeDB.empoylees.remove(empoylee);
        System.out.println("Xoá thành công");
    }


    // 6. Tìm nhân viên có mức lương
    public ArrayList<Empoylee> findBySalary(int minSalary, int maxSalary) {
        if (minSalary >= maxSalary) {
            throw new InValidSalaryException("minSalary không được >= maxSalary");
        }

        ArrayList<Empoylee> rs = new ArrayList<>();
        for (Empoylee e: EmpoyleeDB.empoylees) {
            if (e.getSalary() >= minSalary && e.getSalary() <= maxSalary) {
                rs.add(e);
            }
        }

        return rs;
    }
}
