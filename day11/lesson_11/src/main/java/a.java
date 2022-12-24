public class a {
    public static void main(String[] args) {
        try {
            int number = 9;
            int zero = 0;
            int result = number/zero;
        } catch (ArithmeticException e) {
            System.out.println("Lỗi rồi xử lý đi");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
