import java.util.Arrays;
import java.util.Scanner;

public class LessonArray {
    public static void main(String[] args) {
        // 1. Khởi tạo mảng số nguyên int arrayA[n] với chiều dài n ( n >0) và các phần tử được nhập từ bàn phím
        // In ra thông tin các phần từ arrayA
        // Tính tỏng các phần tử trong mảng arrayA
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng là :");
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i<array.length;i++) {
//            System.out.println("Phần tử tại vị trí :" + i);
//            array[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i< array.length;i++) {
//            sum += array[i];
//        }
//        System.out.println("Tổng của mảng vừa nhập là :" + sum);

        // 2. Khởi tạo mảng số nguyên int arrayA[n] với chiều dài n ( n> 0) và các phần tử được nhập từ bàn phím.
        // Số nguyên x được nhập từ bàn phím.
        // In ra thông tin các phần tử cửa arrayA dưới kiểu dữ liệu String, (Sử dụng Arrays.toString() )
        // Thực hiện sắp xếp mảng arrayA theo thứ tự tăng dần và in ra mảng sau sắp xếp.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chiều dài của mảng : ");
//        int arrLength = sc.nextInt();
//        int[] arrayA = new int[arrLength];
//        for (int i = 0;i<arrayA.length;i++) {
//            System.out.println("Phần tử tại vị trí thứ : " + i + " là : ");
//            arrayA[i] = sc.nextInt();
//        }
//        System.out.println("Thông tin mảng arrayA dưới dạng String là : " + Arrays.toString(arrayA));
//        Arrays.sort(arrayA);
//        System.out.println("Sắp xếp mảng arrayA theo thứ tự tăng dần : "+ Arrays.toString(arrayA));

        // 3. Khởi tạo mảng 2 chiều số nguyên int arrayB[m][n] với số hàng m, số cột n( m,n>0) và các phần tử
        // được nhập từ bàn phím.
        // Tìm phần tử lớn nhất trong mảng arrayB
        // Tính tổng các phần tử trong mảng arrayB
        // Gợi ý: Sử dụng lớp Scanner để nhập từ bàn phím


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng (m) của mảng 2 chiều B: ");
        int soHang = scanner.nextInt();

        System.out.println("Nhập vào số cột (n) của mảng 2 chiều B: ");
        int soCot = scanner.nextInt();

        int[][] arrayB = new int[soHang][soCot];
        System.out.println("Mảng 2 chiều: " + soHang + " x " +soCot);

        for (int i = 0;i< soHang;i++) {
            for (int j = 0;j<soCot;j++) {
                System.out.println("Nhập phân tử arrayB[" + i + "][" + j + "]: ");
                arrayB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < soHang; i++) {
            System.out.println(Arrays.toString(arrayB[i]));
        }

        for (int[] nameArrayB:arrayB) {
            for (int ijarrayB: nameArrayB) {
                System.out.print(ijarrayB + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");


//        int max = arrayB[0][0];
//        for (int i = 0;i<soHang;i++) {
//            for (int j=0;j<soCot;j++) {
//                if (max < arrayB[i][j]){
//                    max = arrayB[i][j];
//                }
//            }
//        }
//        System.out.println("Phan tu lon nhat trong mang B la: " + max);


    }
}
