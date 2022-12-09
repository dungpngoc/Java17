package homeWork_05;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố đầu tiên cần tìm: ");
        int num = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n",num);
        int count = 0;
        int i = 2;
        while (count < num) {
            if (numberElement(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
    public static boolean numberElement(int n) {
        if (n < 2) {
            return false;
        }
        // kiểm tra số nguyên tố khi n >= 2
        int checkNumber = (int) Math.sqrt(n);
        for (int i = 2; i <= checkNumber; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
