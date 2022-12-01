public class vonglap {
    public static void main(String[] args) {
        // begin : Khởi tạo giá trị ban đầu cho vòng lặp
        // condition : Điều kiện để tiếp tục chạy vòng lặp
        // step : Cập nhật giá trị sau mỗi lần lặp


        // Thực hiện cv thức dậy lúc 5:00 trong vòng 30 ngày
//        for (int day = 1; day<=30; day++) {
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            if (day %2 == 0) {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            }else {
//                System.out.println("Ngày " + day + " thức dậy lúc 5h");
//            }
//        }

        // Thực hiện đến ngày số 20 => Chán quá ko thực hiện nữa
//        for (int day = 1; day<=30; day++) {
//            if (day == 20) {
//                System.out.println("Chán quá, từ bỏ");
//                break;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//        }

        // continue  Ví dụ 4 : Vẫn thực hiện cv nhưng cuối tuần nghỉ không thực hiện
//        for (int day = 1; day<=30; day++) {
//            if (day % 7 == 0) {
//                System.out.println("Nghỉ xả hơi, đi nhậu");
//                continue;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5h");
//        }

        // Tính tổng tiền tiết kiệm
        // Tiết kiệm tiền trong 10 ngày, mỗi ngày tiết kiệm 100.000
        // Đến ngày 8, lấy 500.000 ra đi nhậu
        int total = 0;
        for (int day = 0; day <= 10; day++) {
            if (day == 8) {
                total -= 500_000;
            }
            if (day >= 5) {
                total += 200_000;
            } else {
                total += 100_000;
            }
        }
        System.out.println("Tổng tiền : " + total);
    }
}
