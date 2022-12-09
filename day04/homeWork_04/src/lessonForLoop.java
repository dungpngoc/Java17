import java.util.Arrays;
import java.util.Scanner;

public class lessonForLoop {
    public static void main(String[] args) {
        //Bài 1: Viết phương thức truyền vào 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có là chuỗi đối xứng hay không?
        // Kết quả trả về là true hoặc false (không phân biệt hoa thường, không tính khoảng trắng)
        //Ví dụ :
        //acbbca là chuỗi đối xứng
        //AcbbCa là chuỗi đối xứng
        //aCb bc a là chuỗi đối xứng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần so sánh");
        String randomString = sc.nextLine().toLowerCase();
        randomString = randomString.replaceAll(" ","");
        System.out.println(checkString(randomString));



        //Bài 2: Viết phương thức truyền vào 2 số nguyên bất kỳ, tính tổng tất cả các số nguyên nằm giữa chúng.
        // Ví dụ với tham số 3 và 8 ta có kết quả là 22 (bằng 4 + 5 + 6 + 7).
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số thứ nhất và số thứ hai: ");
//        number(sc.nextInt(),sc.nextInt());


        //Bài 3: Viết method truyền vào 1 số nguyên bất kỳ. Kiểm tra xem số đó có phải là số nguyên tố hay không?
        // Kết quả trả về true hoặc false.
        //Số nguyên tố là số nguyên dương > 1 và chỉ chia hết cho 1 và chính nó
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số cần kiểm tra");
//        int numberRandom = sc.nextInt();
//        System.out.println(numberRD(numberRandom));



        // Bài 4: Viết method truyền vào 1 số nguyên dương bất kỳ.
        // Tính tổng tất cả các số nguyên tố nhỏ hơn hoặc bằng tham số truyền vào.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số nguyên dương bất kỳ: ");
//        int numberRandom = sc.nextInt();
//        System.out.println("Tổng các số nhỏ hơn và bằng số vừa nhập là: ");
//        System.out.println(number(numberRandom));


        // Bài 5: Viết method truyền vào 1 số nguyên dương bất kỳ. Tính tổng tất cả các ước số của số đó.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
//        int numberRandom = sc.nextInt();
//        System.out.println("Tổng các ước số của số vừa nhập là: ");
//        System.out.println(number(numberRandom));

    }
        // method bài 1
        public static boolean checkString(String randomString) {
            String[] newrd = randomString.split("");
            for (int i = 0; i < (newrd.length/2); i++) {
                if (newrd[i] == newrd[(newrd.length-1)-i]) {
                    return true;
                }
            }
            return false;
        }



        // method bài 2
//    public static void number(int numberOne, int numberTwo) {
//        if (numberOne < numberTwo) {
//            int sum = 0;
//            for (int i = numberOne + 1; i < numberTwo;i++) {
//                sum += i;
//            }
//            System.out.println("Tổng các số ở giữa là: " + sum);
//        }
//    }

        // method bài 3
//    public static boolean numberRD(int numberRandom) {
//        for (int i = 2; i< numberRandom; i++) {
//           if (numberRandom % i == 0) {
//               return false;
//           }
//        }
//        return true;
//    }


        // method bài 4
//    public static int number(int numberRandom) {
//        int sum = 0;
//        for (int i = 0; i <= numberRandom; i++) {
//            sum += i;
//        }
//        return sum;
//    }

        // method bài 5
//    public static int number(int numberRandom) {
//        int sum = 0;
//        for (int i = 1; i <= numberRandom; i++) {
//            if (numberRandom % i == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
}

