public class thuchanhie {
    public static void main(String[] args) {
//        System.out.println(repeatString("a"));
        System.out.println(repeatString2("a-",5));
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
    public static String repeatString2(String a, int count) {
        String rpa = "";
        for (int i = 0; i < count; i++){
            rpa += a;
        }
        return rpa;
    }
    // Bài 3: Viết method truyền vào 1 chuỗi bất kỳ và 1 số nguyên dương n > 1,
    // hãy viết hàm có tác dụng sao chép đó chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang.
}
