package student_management;

import student_management.controller.StudentController;
import student_management.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.run();
    }
}
