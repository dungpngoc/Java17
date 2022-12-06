import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homeWork_day04 {
    public static void main(String[] args) {
        //Câu 1: Viết chương trình thực hiện công việc:
        //Nhập vào từ bàn phím họ và tên bạn
        //Thực hiện chuẩn hóa chuỗi vừa nhập (in hoa chữ cái đầu của họ và tên)
        // Ví dụ: bùi văn hiên -> Bùi Văn Hiên
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Họ và tên: ");
//        String fullName = sc.nextLine().toLowerCase();
//        // Chuyên chuỗi vừa nhập thành mảng cách nhau bởi dấu cách, sử dụng phương thức split của chuỗi.
//        String[] ArfullName = fullName.split(" ");
//        // Tạo mảng rỗng có các phần tử = với mảng vửa chuyển từ chuỗi trên
//        String[] Aritem = new String[ArfullName.length];
//        // Tạo mảng rỗng để cho các phần tử của mảng vào và in ra
//        String space = "";
//        for (int i = 0; i < ArfullName.length; i++) {
//            String item = ArfullName[i];
//            String firstName = item.substring(0, 1).toUpperCase();
//            item = firstName + item.substring(1).toLowerCase();
//            Aritem[i] = item;
//            space += Aritem[i] + " ";
//        }
//        System.out.println(space.trim());
//    }
//}
        // Câu 2: Viết chương trình thực hiện:
        //Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
        //Nhập các phần tử mảng
        //In mảng ra màn hình
        //Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
        //Ví dụ : [1,4,7,6,2,3] -> [1,5,7,7,3,3]
        //Làm menu cho bài này
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