package classDemo;

public class test {
    public static void main(String[] args) {
        // Tạo ra đối tượng contructor ko có thuộc tính
        Person person = new Person();

        System.out.println(person.name); //null (default value của string)
        System.out.println(person.age);

        // gán giá trị cho thuộc tính của đối tượng
        person.name = "Nguyễn Văn A";
        person.email = "a@gmail.com";
        person.age = 20;
        person.address = "Hà Nội";

        // in ra các đối tượng
        System.out.println(person.name + " - " + person.email + " - " + person.age + " - " + person.address);

        // gọi phương thức
        person.showInfo();
        person.eat();
        person.play("Bóng đá");

        System.out.println(person);

        // Khởi tạo đối tượng phone
        Phone phone = new Phone();
        phone.name = "iPhone 13 pro";
        phone.brand = "Apple";
        person.usePhone(phone);
        System.out.println(phone); // cần generrate sang toString thuộc tính của đối tượng Phone mới in đc

        System.out.println(person.getYearOfBirth());



        // Khởi tạo đối tượng Calculator
        Calculator calculator = new Calculator();
        calculator.number1 = 10;
        calculator.number2 = 2;

        calculator.printInfo();
        System.out.println("Cộng 2 số: " + calculator.addition());
        System.out.println("Trừ 2 số: " + calculator.subtract());
        System.out.println("Nhân 2 số: " + calculator.multi());
        System.out.println("Chia 2 số: " + calculator.division());


        System.out.println("Code continue");

        // Khởi tạo đối tượng person tới contructor
        Person person1 = new Person("Trần Văn B","b@gmail.com");
        System.out.println(person1);

        Person person2 = new Person("Ngô Thị C","c@gmail.com",30,"Hải Phòng");
        System.out.println(person2);
    }
}