package inheritance_practice;

public class Tester extends Empoylee {
    private int error;

    public Tester() {}

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }


    // Tính luơng
    public int calculateSalary() {
        return this.getSalaryBasic() + this.error * 50_000;
    }
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public void showInfoTester() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tester{" + "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", age = " + getAge() +
                ", phone = " + getPhone() +
                ", email = '" + getEmail() + '\'' +
                ", salaryBasic = " + getSalaryBasic() +
                ", error = " + error +
                ", calculateSalary = " + calculateSalary() +
                '}';
    }
}
