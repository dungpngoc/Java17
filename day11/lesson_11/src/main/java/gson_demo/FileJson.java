package gson_demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileJson {
    public static void main(String[] args) {
        Student student = getObjectFromJsonFile("student.json");
        System.out.println(student);

        List<Student> studentList = getListObjectFromJsonFile("list-student.json");
        for (Student s: studentList) {
            System.out.println(s);
        }

        ArrayList<Student> studentList1 = getListObjectFromJsonFile1("list-student.json");
        for (Student s: studentList1) {
            System.out.println(s);
        }

        // Khởi tạo Object student
        Student student1 = new Student(1, "Bùi Hiên", 28, "hien@techmaster.vn");

        // Ghi đối tượng student vào file "student.json"
        convertObjectToJsonFile("student.json", student1);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn A", 30, "a@gmail.com"));
        students.add(new Student(2, "Ngô B", 31, "b@gmail.com"));
        students.add(new Student(3, "Trần C", 23, "c@gmail.com"));

        // Ghi danh sách student vào file "list-student.json"
        convertObjectToJsonFile("list-student.json", students);
    }

    // 1. Lấy Object đơn từ file json
    public static Student getObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get("student.json"));

            // Đọc thông tin từ file và binding và class
            Student student = gson.fromJson(reader, Student.class);

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // 2. Lấy List object từ file json
    public static List<Student> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Student> students = Arrays.asList(gson.fromJson(reader, Student[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // 2. Lấy List object từ file json
    public static ArrayList<Student> getListObjectFromJsonFile1(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            Type type = new TypeToken<ArrayList<Student>>(){}.getType();

            ArrayList<Student> students = gson.fromJson(reader, type);

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
