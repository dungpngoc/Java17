public class ifDemo {
    public static void main(String[] args) {
        // Toán tử && , || , !
        // Vi du
        int hour = 6;
        if (hour < 10) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }

        // Kết hợp nhiều điều kiện && , ||\ !
        boolean troiDep = true;
        boolean coTien = true;
        if(troiDep && coTien) {
            System.out.println("Đi chơi");
        }

        if (!troiDep || coTien){
            System.out.println("Đi chơi lần 2");
        }

        // Toán tử 3 ngôi
        String message = (troiDep && coTien) ? "Đi chơi" : "Ở nhà";
        System.out.println(message);

        int number = 0;
        String text = number > 0 ? "Số dương" : number == 0 ? " Số không" : "Số âm";
        System.out.println(text);
    }
}
