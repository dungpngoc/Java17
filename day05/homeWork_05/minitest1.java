package homeWork_05;

import java.util.Scanner;

public class minitest1 {
    public static void main(String[] args) {
        printRectangle(4,4);
        System.out.println();
        printTriangle(4);

    }
    // 1 In hình chữ nhật đặc
    public static void printRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //2 In ra hình tam giác
    public static void printTriangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
