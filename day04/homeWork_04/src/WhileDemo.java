public class WhileDemo {
    public static void main(String[] args) {
        // Thực hiện cv thức dậy lúc 5h trong vòng 30 ngày

//        int day = 1;
//        while (day <= 30) {
//            if (day%2==0) {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            } else {
//                System.out.println("Ngày " + day + " thức dậy lúc 7h");
//            }
//            day++;
//        }

        int day = 1 ;
        do {
            if (day%2==0) {
                System.out.println("Ngày " + day + " thức dậy lúc 5h");
            } else {
                System.out.println("Ngày " + day + " thức dậy lúc 7h");
            }
            day++;
        } while (day <= 30);
    }
}
