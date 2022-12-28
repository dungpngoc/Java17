package student_management.database;

import student_management.model.Student;

import java.util.ArrayList;
import java.util.List;
// id, name, age, address, point, classroom
public class StudentDatabase {

    public static ArrayList<Student> student = new ArrayList<>(List.of(
            new Student(1,"Nguyễn Văn Lân",12,"Hà Nội",6,6),
            new Student(2,"Hoàng Thuỳ Linh",16,"Hải Phòng",7,7),
            new Student(3,"Mai Phương Thuý",14,"Huế",8,6),
            new Student(4,"Nguyễn Tùng Anh",18,"Đà Nẵng",5,7),
            new Student(5,"Trần Trung Dũng",11,"Điện Biên",9,8),
            new Student(6,"Đào Ngọc Tú",10,"Bắc Giang",10,8),
            new Student(7,"Lê Phương Anh",17,"Nam Định",4,9),
            new Student(8,"Lã Phong Lâm",19,"Nghệ An",7,9),
            new Student(9,"Nguyễn Quang Tiến",20,"Pleiku",2,7),
            new Student(10,"Hà Hùng Hậu",8,"Hà Giang",3,6)
    ));
}
