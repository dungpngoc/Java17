package encapsulation_practice;



public class Test {
    public static void main(String[] args) {
        // tạo đối tượng truyền trực tiếp tham số vào nó và in ra
        Student student = new Student("12345678",6,19,"A29");
        student.showInfo();
        student.calculateScholarship();

        Student student1 = new Student("23456788",9,20,"A321312");
        student1.showInfo();
        student1.calculateScholarship();
    }
}
