package gson_demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectJson {
    public static void main(String[] args) {
        // 1. Tạo đối tượng gson
//         Gson gson = new Gson();

        // 1. Nếu muốn format JSON cho đẹp
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // 2.  Khởi tạo đối tượng từ class Student
        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");

        // 3. Convert Object to JSON
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);

        // Binding chuỗi json vào class
        Student student1 = gson.fromJson(studentJson, Student.class);

        // In ra thông tin của đối tượng
        System.out.println(student1);
    }
}
