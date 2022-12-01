public class homeWork_day03 {
    public static void main(String[] args) {
//        System.out.println(repeatString("a"));
//        System.out.println(repeatString2("a-"));
//        System.out.println(repeatString ("a-",5));
//        System.out.println("Tổng các số chia hết cho 5 từ 0 đến 100 là : "+ sum());
//        System.out.println("Thể tích hình cầu là : " + volume(5));
        FizzBuzz();
    }
    // Bài 1. Viết method truyền vào 1 chuỗi bất kỳ, hãy sao chép chuỗi đó lên 10 lần.
    //Ví dụ : repeatString(“a”) => Kết quả trả về là “aaaaaaaaaa”
//    public static String repeatString(String string) {
//        String text = "";
//        for (int i = 0;i < 10; i++) {
//            text += string;
//        }
//        return text;
//    }
    //Bài 2:  Viết method truyền vào 1 chuỗi bất kỳ, hãy viết hàm có tác dụng sao chép đó chuỗi lên 10 lần,
    // ngăn cách nhau bởi dấu gạch ngang.
    //Ví dụ: repeatString(“a”) => Kết quả trả về là “a-a-a-a-a-a-a-a-a-a”
//    public static String repeatString2(String a) {
//        String rpa = "";
//        for (int i = 0; i < 10; i++){
//            rpa += a;
//        }
//        return rpa.substring(0,19);
//    }
    // Bài 3: Viết method truyền vào 1 chuỗi bất kỳ và 1 số nguyên dương n > 1,
    // hãy viết hàm có tác dụng sao chép đó chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang.
    // Ví dụ: repeatString(“a”, 5) => Kết quả trả về là ‘a-a-a-a-a’
//    public static String repeatString (String rpa3,int count) {
//        String rpa = "";
//        for (int i = 0; i < count; i++) {
//            rpa += rpa3;
//        }
//        return rpa.substring(0,9);
//    }
    // Bài 4. Viết method tính tổng các số chia hết cho 5 từ 0 -> 100
//    public static int sum() {
//        int sum = 0;
//        for (int i = 0; i <= 100;i++) {
//            if (i%5==0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
    // Bài 5: Viết method tính thể tích hình cầu, với tham số truyền vào là bán kính của hình cầu.
//    public static double volume(double radius) {
//        double volumeGlobular = (4/3)*Math.PI*Math.pow(radius,3);
//        return volumeGlobular;
//    }

//    Bài6. Viết method để in ra các số từ 1 đến 100.
//    Trong đó
//    Những số nào chia hết cho 3 thì in chữ “Fizz”
//    Những số chia hết cho 5 thì in chữ “Buzz”,
//    Còn những số chia hết cho cả 3 và 5 thì in chữ “FizzBuzz”
        public static void FizzBuzz() {
        for (int i = 0; i < 100; i++) {
           if (i%3==0 && i%5==0) {
               System.out.println("FizzBuzz");
           } else if (i%3==0) {
               System.out.println("Fizz");
           } else if (i%5==0) {
               System.out.println("Buzz");
           }
           else {
               System.out.println(i);
           }
        }
    }
}
