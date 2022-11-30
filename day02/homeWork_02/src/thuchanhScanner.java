import java.util.Scanner;

public class thuchanhScanner {
    public static void main(String[] args) {
//        Bài 1 : Viết chương trình nhập vào 2 số nguyên dương a, b bất kỳ từ bàn phím
//        Thực hiện tính toán các phép tính sau đây và in ra kết quả:
//        a + b
//        a - b
//        a * b
//        a / b
//        a^b (a mũ b)
//        a % 2 (a chia dư cho b)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số a ");
//        int a = sc.nextInt();
//        System.out.println("Nhập vào số b ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        int tru = a-b;
//        int nhan = a*b;
//        int chia = a/b;
//        int mu = a^b;
//        int chialaydu = a%b;
//        System.out.println("Tổng 2 số a và b là " + sum +
//                ", hiệu 2 số là " + tru + ", tích 2 số là " + nhan + ", Chia 2 số là " + chia + ", mũ 2 số là " + mu +
//                ", chia lấy dư là " + chialaydu);

//        Bài 2 : Nhập vào 1 chuỗi bất kỳ từ bàn phím
//        Thực hiện các công việc sau:
//        In ra chuỗi in hoa của chuỗi vừa nhập
//        In ra chuỗi in thường của chuỗi vừa nhập
//        Đếm số ký tự trong chuỗi
//        In ra ký tự cuối cùng trong chuỗi
//        In ra 5 ký tự đầu tiên của chuỗi
//        Kiểm tra chuỗi vừa nhập có chứa chuỗi “hello” hay không? in ra true nếu chứa, ngược lại thì in ra false nếu không chứa
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String in = sc.nextLine();
        System.out.println("In hoa chuỗi vừa nhập " + in.toUpperCase());
        System.out.println("In thường chuỗi vừa nhập " + in.toLowerCase());
        System.out.println("Số ký tự trong chuỗi là " + in.length());
        System.out.println("Ký tự cuối cùng trong chuỗi là " + in.charAt(15));
        System.out.println("5 ký tự đầu tiên của chuỗi là " + in.substring(0,5));
        System.out.println("Chuỗi có chứa chữ hello ko " + in.equals("Hello"));
    }
}
