package exception_demo;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        // Khi chia 1 số cho 0
        // 1. ArithmeticException
//        int number = 9;
//        int zero = 0;
//        int result = number/zero;


        // 2. NullPointerException
        String str = null;
        System.out.println(str.length());

        // Lỗi ép kiểu
        // 3. NumberFormatException
//        String str = "Chuỗi";
//        int number = Integer.parseInt(str);

        // Thêm phần tử sai index trong mảng
        // 4. ArrayIndexOutOfBoundsException
        int []arr = new int[5];
        arr[10] = 7;

        // 5. Kích thước mảng là 1 số âm
        // NegativeArraySizeException
//        int[] arr = new int[-5];
    }
}
