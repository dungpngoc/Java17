import java.util.Random;
import java.util.Scanner;

public class LessonWhile {
//    Bài 1 :Sử dụng vòng lặp while cho người dùng nhập vào 1 số bất kỳ (number) từ bàn phím (quá trình nhập diễn ra liên tục,
//    chỉ kết thúc vòng lặp khi nào thỏa mãn điều kiện)
//
//    Nếu số người dùng nhập = 0 --> In ra “Số phải khác 0. Nhập lại” --> Tiếp tục nhập
//    Nếu số người dùng nhập != 0 --> In ra “Số vừa nhập là : …” --> Kết thúc vòng lặp;


        public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        boolean isQuit = false;
//
//
//        while (!isQuit) {
//            System.out.println("Nhập vào số bất kỳ :");
//            int inNumber = sc.nextInt();
//            switch (inNumber) {
//                case 0: {
//                    System.out.println("--> Số phải khác 0. Nhập lại");
//                }
//                default: {
//                    System.out.println("--> Số vừa nhập là : " + inNumber);
//                    isQuit = true;
//                    break;
//                }
//            }
//        }
        // Bài 2: Viết chương trình sinh 1 số ngẫu nhiên từ 0->100 (randomNumber)
        //
        //Sử dụng vòng lặp while cho người dùng nhập vào 1 số bất kỳ từ bàn phím (userNumber) để đoán số vừa random
        //
        //Thực hiện so sánh hai số randomNumber với userNumber
        //
        //Nếu userNumber > randomNumber -> Bạn nhập số lớn hơn rồi, cho nhập lại
        //Nếu userNumber < randomNumber -> Bạn nhập số nhỏ hơn rồi, cho nhập lại
        //Nếu userNumber == randomNumber -> Chúc mừng bạn nhập đúng rồi
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int randomNumber = sc.nextInt(100);
            boolean isQuit = false;
            while (!isQuit) {
            }
    }
}
