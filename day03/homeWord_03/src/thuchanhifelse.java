import java.util.Scanner;

public class thuchanhifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm ");
        int mark = sc.nextInt();
        if (mark >= 85) {
            System.out.println("A");
        } else if (70 <= mark && mark < 85 ) {
            System.out.println("B");
        } else if (40 <= mark && mark < 70) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}





