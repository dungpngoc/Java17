package student_management.service;

import student_management.database.StudentDatabase;
import student_management.model.Student;
import student_management.repository.StudentRepository;

import java.util.*;


// Xem danh sách học sinh
// Thêm học sinh mới
// Cập nhập điểm học sinh
// Xóa học sinh
// Xem danh sách học sinh theo lớp
// Sắp xếp theo tên
// Sắp xếp theo tuổi
// Sắp xếp theo điểm
public class StudentService {
    // 1. Xem danh sách học sinh
    StudentRepository studentRepository = new StudentRepository();
    Scanner sc = new Scanner(System.in);
    public void showInfo() {
        for (Student listStudent: studentRepository.allInfo()) {
            System.out.println(listStudent);
        }
    }

    // 2. Thêm hoc sinh mới ( Tạo đối tượng student rồi add vào arraylist của student database)
    public void addNewStudent() {
        Student student = new Student();
        System.out.print("Nhập id: ");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập tên: ");
        student.setName(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập địa chỉ: ");
        student.setAddress(sc.nextLine());
        System.out.print("Nhập điểm: ");
        student.setPoint(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập lớp: ");
        student.setClassroom(Integer.parseInt(sc.nextLine()));
        System.out.println("Thêm thành viên mới thành công");
        System.out.println("Thông tin học sinh mới là:");
        System.out.println(student);
        StudentDatabase.student.add(student);
    }

    // 3. Cập nhập điểm học sinh

    public void editPoint() {
        int count = 0;
        System.out.print("Nhập id học sinh cần sửa điểm: ");
        int idStudent = Integer.parseInt(sc.nextLine());
        for (Student findById: StudentDatabase.student) {
            if (findById.getId() == idStudent) {
                System.out.print("Nhập số điểm muốn sửa: ");
                findById.setPoint(Integer.parseInt(sc.nextLine()));
                System.out.println("Thông tin học sinh có id " + idStudent + " sau khi sửa điểm là:");
                System.out.println(findById);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không khớp id");
        }
    }

    // 4. Xoá học sinh
    public void deleteStudent() {
        int count = 0;
        System.out.print("Nhập id học sinh muốn xoá: ");
        int idStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < studentRepository.allInfo().size(); i++) {
            if (studentRepository.allInfo().get(i).getId() == idStudent) {
                studentRepository.allInfo().remove(studentRepository.allInfo().get(i));
                System.out.println("Xoá thành công học sinh có id " + idStudent);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không giống id");
        }
    }

    // 5. Xem danh sách học sinh theo lớp
    public void findByClass() {
        int count = 0;
        System.out.print("Nhập class muốn tìm: ");
        int classStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Danh sách học sinh cùng lớp:");
        for (int i = 0; i < StudentDatabase.student.size(); i++) {
            if (StudentDatabase.student.get(i).getClassroom() == classStudent) {
                System.out.println(StudentDatabase.student.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Không có học sinh lớp %d nào",classStudent);
        }
    }


    // 6. Sắp xếp theo tên
    public void sortByName() {

    }



    // 7. Sắp xếp theo tuổi tăng dần
    public void sortByAge() {
        studentRepository.allInfo().sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("Sắp xếp theo tuổi tăng dần:");
        for (Student sortAge: studentRepository.allInfo()) {
            System.out.println(sortAge);
        }
    }

    // 8. Sắp xếp theo điểm giảm dần
    public void sortByPoint() {
        StudentDatabase.student.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getPoint() - o1.getPoint();
            }
        });
        System.out.println("Sắp xếp theo điểm giảm dần:");
        for (Student sortPoint: studentRepository.allInfo()) {
            System.out.println(sortPoint);
        }
    }
}
