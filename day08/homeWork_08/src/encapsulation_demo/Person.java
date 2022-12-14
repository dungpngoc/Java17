package encapsulation_demo;


public class Person {
    // Định nghĩa các thuộc tính của đối tượng Person, thuộc tính phải là private đảm bảo tính đóng gói
    private int id;
    private String name;
    private int age;
    private String email;

    // Khai báo contructor ko tham số và full tham số
    public Person() {
    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5) {
            System.out.println("Độ dài tên không được < 5");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
