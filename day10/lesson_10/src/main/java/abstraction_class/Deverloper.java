package abstraction_class;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Deverloper extends Employee {
    private int overtimeHours;

    public Deverloper(int id, String name, int age, int salaryBasic, int overtimeHours) {
        super(id, name, age, salaryBasic);
        this.overtimeHours = overtimeHours;
    }


    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public int calculateSalary() {
        return this.getSalaryBasic() + this.overtimeHours * 200_000;
    }

    @Override
    void showInfo() {
        String massage = String.format("id : %d, name : %s, age : %d, salaryBasic : %d, overtimeHours : %d, salary : %d",
                this.getId(), this.getName(), this.getAge(), this.getSalaryBasic(), this.overtimeHours, this.calculateSalary());
        System.out.println(massage);
    }
}
