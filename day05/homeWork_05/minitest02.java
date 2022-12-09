package homeWork_05;

import java.util.Arrays;
import java.util.Scanner;

public class minitest02 {
    public static void main(String[] args) {
        // Câu 2
        //Viết phương thức truyền vào 1 chuỗi bất kỳ
        //Thực hiện:
        //Đếm số từ trong chuỗi
        //Đếm và in ra index của các ký tự o trong chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String checkString = sc.nextLine();


        String[] newCheck = checkString.split(" ");
        System.out.println(Arrays.toString(newCheck));

        int count = newCheck.length;
        System.out.println("Số từ trong chuỗi là: " + count);


        int counto = 0;

        String newString = String.join("",newCheck);
        System.out.println(newString);
//        String[] newCheck2 = newString.split("");
//        System.out.println(Arrays.toString(newCheck2));
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == 'o') {
                counto += 1;
            }
        }
        System.out.println("Số ký tự o trong chuỗi là: " + counto);
    }
}
