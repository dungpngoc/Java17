package pratice_constructor;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Hien",20,"HN",210);
        employee.printInfo();
        System.out.println("Lương: " + employee.getSalary());


        Employee employee1 = new Employee("Dung",20,"HN",90);
        employee1.printInfo();
        System.out.println("Lương: " + employee1.getSalary());
    }
}
