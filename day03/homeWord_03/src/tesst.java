import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class tesst {
    // Câu 2: Viết chương trình thực hiện:
    //Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
    //Nhập các phần tử mảng
    //In mảng ra màn hình
    //Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
    //Ví dụ : [1,4,7,6,2,3] -> [1,5,7,7,3,3]
    //Làm menu cho bài này

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng: ");
        int n = sc.nextInt();
        int[] Array = new int[n];

        boolean isQuit = false;
        int option = 0;
        while (!isQuit) {
            showMenu();
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    for (int i = 0; i< Array.length; i++) {
                        System.out.println("Phần tử thứ " + i + " là: ");
                        Array[i] = sc.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Mảng vừa nhập là: " + Arrays.toString(Array));
                    break;
                }
                case 3: {
                    for (int i = 0; i< Array.length; i++) {
                        if (Array[i]%2==0) {
                            Array[i] = Array[i] + 1;
                        }
                    }
                    System.out.println("Mảng sau khi tăng giá trị các số chẵn lên 1 là: " + Arrays.toString(Array));
                    break;
                }
                case 4: {
                    System.out.println("4 -- Thoát chương trình");
                    isQuit = true;
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 -- Nhập các phần tử của mảng: ");
        System.out.println("2 -- In các phần tử của mảng: ");
        System.out.println("3 -- Thay đổi các phần tử là số chẵn trong mảng tăng lên 1: ");
        System.out.println("4 -- Thoát");
    }
}
