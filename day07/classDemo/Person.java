package classDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Chú ý khi viết code: Thuộc tính --> Contructor --> Các phương thức --> ...

public class Person {
    // Thuộc tính của đối tượng Person (property)
    public String name;
    public String email;
    public int age;
    public String address;

    // Khai báo đối tượng contructor có 4 thuộc tính
    public Person(String name, String email,int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    // Khai báo đối tượng contructor có 2 tham số
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Phải viết contructor ko có tham số ra ko thì báo lỗi
    public Person() {}


    // Phương thức (method - hành động)
    public void play(String sportName) {
        System.out.println("Chơi " + sportName);
    }

    public void eat() {
        System.out.println("Ăn ...");
    }

    public void showInfo() {
        System.out.println(name + " - " + email + " - " + age + " - " + address);
    }

    public void usePhone(Phone phone) {
        System.out.println(name + " đang sử dụng điện thoại " + phone.name + " của hãng " + phone.brand);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public int getYearOfBirth() {
        System.out.println("Method getYearOfBirth được gọi!");
        return LocalDate.now().getYear() - age;
    }
}
