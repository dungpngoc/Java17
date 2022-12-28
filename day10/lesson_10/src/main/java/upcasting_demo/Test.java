package upcasting_demo;

public class Test {
    public static void main(String[] args) {
        // Upcasting
        Person p = new Student("Dũng");
        // Nếu method overide bởi lớp con => gọi method overide ở lớp con
        // Nếu method không overide bởi lớp con => gọi method của lớp cha
        p.eat();
        p.sleep();
        p.work();
        ((Student) p).display();

        System.out.println();

        // Downcasting
        Student student = (Student) p;
        student.display();
        p.eat();
        p.sleep();
        p.work();
    }
}
