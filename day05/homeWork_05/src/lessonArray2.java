import java.util.Arrays;
import java.util.Scanner;

public class lessonArray2 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào từ bàn phím số hàng, số cột của mảng 2 chiều
        //Và thực hiện các yêu cầu sau
        //Nhập vào các phần tử của mảng (các phần tử của mảng là số nguyên)
        //In ra mảng vừa nhập
        //Tính tổng các phần tử chẵn có trong mảng
        //Tìm giá trị lớn nhất của mảng
        //Tìm giá trị lớn nhất của từng row

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng số cột của mảng 2 chiều: ");
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        int[][] array2d = new int[row][col];
        System.out.println("Mảng 2 chiều vừa tạo có độ dài hàng và cột là: " + row + " x " + col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + "][" + j + "]: ");
                array2d[i][j] = sc.nextInt();
            }
        }

        // In ra thông tin vừa nhập
        System.out.println("Mảng vừa nhập là (in ra kiểu String): ");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }


        System.out.println("Mảng vừa nhập là (sử dụng forEach in ra kiểu ma trận): ");
        for (int[] nameArray2d : array2d) {
            for (int name2: nameArray2d) {
                System.out.print(name2 + "  ");
            }
            System.out.println();
        }

        // Tính tổng các phần tử chẵn trong mảng
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array2d[i][j] % 2 == 0) {
                    sum += array2d[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + sum);

        // Tìm giá trị lơn nhất trong mảng
        int max = array2d[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < array2d[i][j]) {
                    max = array2d[i][j];
                }
            }
        }
        System.out.println("Giá trị lơn nhất trong mảng là: " + max);

        // Tìm giá trị nhỏ nhất trong mảng
        int min = array2d[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min > array2d[i][j]) {
                    min = array2d[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
