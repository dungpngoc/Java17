package pratice_constructor;

public class Employee {
    // Khai báo thuộc tính
    public String name;
    public int age;
    public String address;
    public int totalHours;

    // Khai báo contructor Employee 4 thuộc tính
    public Employee(String name,int age,String address,int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
    }

    // Khai báo phương thức

    public void printInfo() {
        System.out.println("Thông tin nhân viên là: " + name + " " + age + " tuổi ở " + address + " số giờ làm " + totalHours);
    }

    public int getSalary() {
        int salary = totalHours * 200000;
        return salary + getBonus(salary);
    }



    public int getBonus(int salary) {
        if (totalHours >= 200) {
            if (totalHours >= 200) return (int) (salary*0.2);
            if (totalHours >= 100) return (int) (salary*0.1);
        }
        return 0;
    }

}
