import java.util.Arrays;
import java.util.Scanner;

public class lessonArray4 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 1 mảng số nguyên bao gồm n phần tử. Thực hiện các công việc sau:
        //In ra các phần tử trong mảng
        //Tính tổng các phần tử trong mảng
        //Tìm phần tử nhỏ nhất
        //Tìm phần tử lớn nhất
        //Đếm số lượng phần tử chẵn
        //Đếm số lượng phần tử lẻ
        //Note : Làm menu cho bài này
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng số nguyên array: ");
        int[] array = new int[sc.nextInt()];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + i + " là: ");
            array[i] = sc.nextInt();
        }

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.println("Nhập lựa chọn :");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
                    break;
                }
                case 2: {
                    int sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        sum += array[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + sum);
                    break;
                }
                case 3: {
                    int min = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (min > array[i]) {
                            min = array[i];
                        }
                    }
                    System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
                    break;
                }
                case 4: {
                    int max = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (max < array[i]) {
                            max = array[i];
                        }
                    }
                    System.out.println("Phần tử lớn nhât trong mảng là: " + max);
                    break;
                }
                case 5: {
                    int count = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            count += 1;
                        }
                    }
                    System.out.println("Số phần tử chẵn trong mảng là : " + count);
                    break;
                }
                case 6: {
                    int count = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 != 0) {
                            count += 1;
                        }
                    }
                    System.out.println("Số phần tử lẻ trong mảng là : " + count);
                    break;
                }
                case 7: {
                    isQuit = true;
                    System.out.println("Đã thoát chương trình");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("----------Menu---------");
        System.out.println("1 -- In ra các phần tử trong mảng");
        System.out.println("2 -- Tính tổng các phần tử trong mảng");
        System.out.println("3 -- Tìm phần tử nhỏ nhất trong mảng");
        System.out.println("4 -- Tìm phần tử lớn nhất trong mảng");
        System.out.println("5 -- Đếm số lượng phần tử chẵn trong mảng");
        System.out.println("6 -- Đếm số lượng phần tử lẻ trong mảng");
        System.out.println("7 -- Thoát chương trình");
    }
}

