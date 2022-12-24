package exception_demo;

public class HandleException {
    public static void main(String[] args) {
//        try {
//            int number = 9;
//            int zero = 0;
//            int result = number/zero;
//        } catch (ArithmeticException e) {
//            // Phần try lỗi chạy xuông phần catch xử lý
//            System.out.println("Lỗi rồi xử lý đi");
//
//            System.out.println(e.getMessage()); // In ra nguyên nhân lỗi
//            e.printStackTrace(); // In ra vị trí lỗi
//        }


        try {
            methodOne();
            methodTwo();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Lỗi rùi");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

//        catch (NullPointerException e) {
//            System.out.println("Xử lý lỗi NullPointerException");
//        }

        System.out.println("Code continue ...");
    }

    public static void methodOne() {
        int number = 9;
        int zero = 1;
        System.out.println(number/zero);
    }

    public static void methodTwo() {
        String str = null;
        System.out.println(str.length());
    }
}
