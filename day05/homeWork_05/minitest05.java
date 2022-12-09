package homeWork_05;

import java.util.Arrays;
import java.util.Scanner;

public class minitest05 {
    public static void main(String[] args) {
        //Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
        //Thực hiện:
        //Nhập các phần tử mảng
        //In thông tin mảng ra màn hình
        //Liệt kê các phần tử nằm trên đường chéo chính
        //Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        System.out.println("Mảng vừa tạo là: " + row + " x " + col);
        int[][] array = new int[row][col];

        // Nhập các phần tử của mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Thông tin mảng vừa nhập là: ");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // Liệt kê các phần tử trên đường chéo chính
        int[] diagonalLine = new int[col];
        if (row == col) {
            System.out.println("Các phần tử nằm trên đường chéo chính là: ");
            for (int i = 0; i < row; i++) {
                for (int j = i; j <= i; j++) {
                    diagonalLine[i] = array[i][j];
                }
            }
            System.out.println(Arrays.toString(diagonalLine));
        }

        System.out.println("Tạo mảng 2 chiều thứ 2: ");
        System.out.println("Nhập số dòng: ");
        int rowTwo = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int colTwo = sc.nextInt();
        int[][] arrayTwo = new int[rowTwo][colTwo];
        System.out.println("Nhập các phần tử của mảng mới: ");
        for (int i = 0; i < colTwo; i++) {
            for (int j = 0; j < rowTwo; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                arrayTwo[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều mới là: ");
        for (int i = 0; i < colTwo; i++) {
            System.out.println(Arrays.toString(arrayTwo[i]));
        }


        // Cộng 2 mảng

        int[][] addArray = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                addArray[i][j] = array[i][j] + arrayTwo[i][j];
            }
        }
        System.out.println("Mảng mới sau khi cộng 2 mảng là: ");
        for (int i = 0; i < col; i++) {
            System.out.println(Arrays.toString(addArray[i]));
        }
    }
}
