package student_management.model;

public class Student {
    // 1
    // Tạo class Student với các thuộc tính sau
    //id : Mã học viên
    //name : Tên học viên
    //theoryPoint : Điểm lý thuyết
    //practicePoint : Điểm thực hành
    public int id;

    public String name;

    public double theoryPoint;

    public double practicePoint;

    // Tạo constructor không có tham số, và có full tham số để khởi tạo đối tượng

    public Student() {}
    public Student(int id, String name, double theoryPoint, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }
}
