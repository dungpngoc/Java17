import java.util.Scanner;

public class thuchanhifelse1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số chiều cao");
        double height = sc.nextDouble();
        System.out.println("Nhập chỉ số cân nặng ");
        double weight = sc.nextDouble();
        double BMI = weight/height*height;

        if (BMI < 18.5) {
            System.out.println("Thiếu cân");
        } else if (18.5 < BMI && BMI <= 24.9) {
            System.out.println("Bình thường");
        } else if (BMI > 24.9) {
            System.out.println("Thừa cân");
        }
    }
}
