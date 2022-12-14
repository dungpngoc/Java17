package student_management;

import student_management.model.Student;
import student_management.service.StudentService;
    // 3 Test chức năng
    // Tạo 1 class với tên bất kỳ
    // Tạo phương thức main() trong class đó để test các chức năng đã làm trong StudentService
public class Test {
    public static void main(String[] args) {
        // 3 Tạo đối tượng
        StudentService studentService = new StudentService();

        Student student = studentService.createStudent();
        studentService.printInfo(student);

        // Nhập nhiều đối tượng
        Student[] students= new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentService.createStudent();
        }

        for (Student value: students) {
            studentService.printInfo(value);
        }
    }
}
