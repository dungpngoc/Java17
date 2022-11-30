import java.util.Scanner;

public class homeWork_day02 {
    public static void main(String[] args) {
        //1. Viết chương trình tính chu vi và diện tích của hình chữ nhật với chiều dài và chiều rộng nhập vào từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chiều rộng ");
//        double width = sc.nextDouble();
//        System.out.print("Nhập chiều cao ");
//        double height = sc.nextDouble();
//        double area = width * height;
//        System.out.println("Diện tích hình chữ nhật là " + area);

        //2. Viết chương trình giới thiệu bản thân gồm các thông tin họ tên, tuổi, giới tính,
        // địa chỉ, với các thông tin cá nhân được nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính");
        String sex = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("Tôi tên là " + name + ", năm nay " + age + " tuổi " + ", hiện tại đang sinh sống tại "
                + address);
    }
}

