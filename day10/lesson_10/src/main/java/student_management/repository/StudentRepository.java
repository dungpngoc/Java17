package student_management.repository;

import student_management.database.StudentDatabase;
import student_management.model.Student;

import java.util.ArrayList;

public class StudentRepository {
    public ArrayList<Student> allInfo() {
        return StudentDatabase.student;
    }


}
