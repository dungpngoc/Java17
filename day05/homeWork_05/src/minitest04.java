import java.util.Scanner;

public class minitest04 {
    public static void main(String[] args) {
        // Viết chương trình thực hiện:
        //Liệt kê 10 số nguyên tố đầu tiên
        //Liệt kê các số nguyên tố nhỏ hơn 10


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố đầu tiên cần tìm: ");
        int n = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n",n);
        int count = 0;
        int i = 2;
        while (count < n) {
            if (numberElement(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();

        // Liệt kê các số nguyên tố nhỏ hơn 10
        System.out.println("Tìm các số nguyên tố nhỏ hơn 10: ");
        int numberElement2 = sc.nextInt();
        System.out.printf("%d số nguyên tố nhỏ hơn 10 là: ",numberElement2);
        if (numberElement2 >= 2) {
            System.out.print(2 + " ");
        }
        for (int j = 3; j < numberElement2; j++) {
            if (numberElementTwo(j)) {
                System.out.print(j + " ");
            }
        }
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

    public static boolean numberElementTwo(int numberElement2) {
        if (numberElement2 < 2) {
            return false;
        }
        // kiểm tra số nguyên tố khi n >= 2
        int checkNumber = (int) Math.sqrt(numberElement2);
        for (int i = 2; i <= checkNumber; i++) {
            if (numberElement2 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
