public class t {
    public static void main(String[] args) {
        //khai báo và khởi tạo một chuỗi có nội dung nhất địng
        String sentence = "F   re et     u  t  s.n et";
        System.out.println("\n\nChuỗi ban đầu: " + sentence);
        //sử dụng phương thức replaceAll() để xóa khoảng trắng
        sentence = sentence.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence);
    }
}
