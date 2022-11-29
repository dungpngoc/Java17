public class homeWork_day1 {
//     1. In ra dòng chữ: Xin chào các bạn.
    // Đầu tiên là khai báo biến và gán giá trị trong method main, sau đó mới tạo được method mới ở dướigit p

    public static void main(String[] args) {
        xinChao();
        xinChaoX("Pham Ngoc Dung");
        xinChaoRandom("Ha Noi");
        square(20);
        sum(20,10);
        century(20);
        BIM(170,50);
    }
    // tạo method mới gọi biến đã được khai báo ở trên
    public static void xinChao() {
        System.out.println("Xin chao cac ban");
    }

    //2.In ra dòng chữ : Xin chào X (với X là một chuỗi bất kỳ, nhập vào tham số khi gọi method).
    // tạo method mới và gọi biến đã được gán giá trị ở trên, truyền vào trong () là tên biến có kiểu dữ liệu là chuỗi ( String name)
    public static void xinChaoX(String name) {
        System.out.println("Xin chao " + name);
    }

    //3.In ra dòng chữ : Xin chào “X” (với X là một chuỗi bất kỳ, nhập vào tham số khi gọi method).
    // chưa hiểu dấu \ kết thúc chuỗi
    public static void xinChaoRandom(String address) {
        System.out.println("Song o " + "\"" + address + "\"");
    }

    //4. Tính tổng 2 số a, b bất kỳ.
    // Khai báo method với kiểu giữ liệu số nguyên int, khai báo biến với kiểu giữ liệu số nguyên int a , int b
    public static int sum(int a,int b) {
        System.out.println(a+b);
        return a+b;
    }

    //5.Tính bình phương 1 số bất kỳ.
    //Khai báo method có tên biến là number kiểu dữ liệu là số nguyên int
    public static int square(int a){
        System.out.println(a*a);
        return a*a;
    }
    //6. Tính thế kỷ của 1 năm bất kỳ (năm là 1 số nguyên dương).
    public static int century(double a) {
        double century = a / 100;
        return (int) Math.ceil(century);
    }

    //7. Viết method truyền vào cân nặng (weight) và chiều cao (height). Tính chỉ số BMI với giá trị cân nặng và chiều cao đã cho
    public static double BIM(double weight, double height) {
        return weight / (height*height);
    }
}