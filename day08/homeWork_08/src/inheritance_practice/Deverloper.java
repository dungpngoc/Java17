package inheritance_practice;

public class Deverloper extends Empoylee {
    private int overtimeHours;

    public Deverloper() {}

    public Deverloper(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }



    // Tính lương
    public int calculateSalary() {
        return this.getSalaryBasic() + this.overtimeHours * 200_000;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void showInfoDev() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Deverloper{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phone= " + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", salaryBasic = " + getSalaryBasic() +
                ", overtimeHours = " + overtimeHours  +
                ", calculateSalary = " + calculateSalary() +
                '}';
    }
}
