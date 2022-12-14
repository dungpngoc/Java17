package encapsulation_practice;

// Tạo class Student lưu trữ thông tin của học viên bao gồm:
//
//Mã sinh viên : Chứa 8 ký tự
//Điểm trung bình : từ 0.0 -> 10.0
//Tuổi : Phải lớn hơn hoặc bằng 18
//Lớp : Phải bắt đầu = ký “A” hoặc “C”
//Và các phương thức sau
//constructor không tham số, constructor đầy đủ tham số
//Các hàm getter, setter
//showInfo() : Hiển thị tất cả thông tin về student
//Viết phương thức kiểm tra xem student có nhận được học bổng không? Điểm trung bình >= 8.0 là nhận được học bổng
public class Student {
    private String id;

    private double avgPoint;

    private int age;

    private String className;


    // Tạo contructor


    public Student() {}

    public Student(String id, double avgPoint, int age, String className) {
        setId(id);
        setAvgPoint(avgPoint);
        setAge(age);
        setClassName(className);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() == 8){
            this.id = id;
            return;
        } else {
            System.out.println("Độ dài id bao gồm 8 ký tự");
        }
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if (avgPoint < 0 || avgPoint > 10) {
            System.out.println("avgPoint phải trong khoảng từ 0 -> 10");
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Tuổi phải > 18");
            return;
        }
        this.age = age;
    }

    public String getClassName() {
        return className;
    }


    public void setClassName(String className) {
        if (!className.startsWith("A") && !className.startsWith("C")) {
            System.out.println("Tên lớp phải bắt đầu bằng A hoặc C");
            return;
        }
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", avgPoint=" + avgPoint +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }

    public void calculateScholarship() {
        if(avgPoint >= 8) {
            System.out.println("Nhận được học bổng");
        } else {
            System.out.println("Không nhận được học bổng");
        }
    }
}
