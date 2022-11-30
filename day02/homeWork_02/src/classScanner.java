import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập dữ liệu từ bàn phím");
//        byte b = sc.nextByte();
//        short s = sc.nextShort();
//        int i = sc.nextInt();
//        long l = sc.nextLong();
//        float f = sc.nextFloat();
//        double d= sc.nextDouble();
//        String str = sc.next();
//        String str1 = sc.nextLine();
//        System.out.println("Dữ liệu vừa nhập là : " + str1);
        System.out.println("Nhập tên : ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi : ");
//      Cách 1:
//         Khắc phục trôi lệnh sử dụng Integer.parseInt
//        int age = Integer.parseInt(sc.nextLine());

//      Cách 2:
//      Khắc phục trôi lệnh sử dụng nextLine()
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập email : ");
        String email = sc.nextLine();

        System.out.println("--- Thông tin user ---");
        System.out.println("Họ : " + name);
        System.out.println("Tuổi : " + age);
        System.out.println("Email : " + email);



    }
}
