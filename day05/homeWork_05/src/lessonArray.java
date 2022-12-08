import java.util.Arrays;

public class lessonArray {
    //Bài 1: Viết method cho phép truyền vào 1 mảng các số, kết quả trả về là 1 mảng mới với các số là số dư
    // tương ứng khi chia mảng cũ cho 2
    //Ví dụ : [4,2,5,6,2,7] => [0,0,1,0,0,1]

    // Bài 2: Viết method truyền vào 1 chuỗi bất kỳ, trả về kết quả là chuỗi đó
    // được sao chép lên 10 lần (sử dụng array để làm)
    //Ví dụ: repeatString(“a”) => “aaaaaaaaaa”

    // Bài 3: Viết method truyền vào 1 chuỗi bất kỳ, trả về kết quả là chuỗi đó được sao chép lên 10 lần,
    // ngăn cách nhau bởi dấu gạch ngang (sử dụng array để làm)
    //Ví dụ: repeatString(“a”) => “a-a-a-a-a-a-a-a-a-a”

    // Bài 4: Viết method để kiểm tra 1 giá trị có nằm trong mảng hay không?
    //checkElementExist([1,2,3,4,5], 5) => true
    //checkElementExist([1,2,3,4,5], 6) => false


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(numberArray(new int[]{1,2,3})));
//        System.out.println(repeatString("a"));
//        System.out.println(repeatString2("a"));
//        System.out.println(checkElementExist(new int[]{1,2,3,4,5},5));

    }

        // method bài 1
//    public static int[] numberArray(int[] number) {
//
//        for (int i = 0; i < number.length; i++) {
//            if (number[i]%2 == 0) {
//                number[i] = 0;
//            } else if (number[i]%2 !=0) {
//                number[i] = number[i]%2;
//            }
//        }
//        return number;
//    }

        // method bài 2
//    public static String repeatString(String randomString) {
//        String[] newArray = new String[10];
//        for (int i = 0; i < 10; i++){
//            newArray[i] = randomString;
//        }
//        String aString = String.join("",newArray);
//        return aString;
//    }

        // method bài 3
//    public static String repeatString2(String randomString) {
//        String[] newArray = new String[10];
//        for (int i = 0; i < 10; i++) {
//            newArray[i] = randomString;
//        }
//        String aString = String.join("-", newArray);
//        return aString;
//    }


        // method bài 4
//    public static boolean checkElementExist(int[] array, int number) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == number) {
//                return true;
//            }
//        }
//        return false;
//    }
}
