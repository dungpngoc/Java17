import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class localdate {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Local Date
        // Khởi tạo đối tượng localdate với ngày tháng năm hiện tại
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

        // Khởi tạo đối tượng localdate với ngày tháng năm được chỉ định hiện tại
//        LocalDate localDate1 = LocalDate.of(2022,8,14);
//        System.out.println(localDate1);

        // Một số phương thức
//        System.out.println("Năm " + localDate.getYear());
//        System.out.println("Tháng " + localDate.getMonth().getValue());
//        System.out.println("Ngày " + localDate.getDayOfMonth());
//        System.out.println("Thứ " + localDate.getDayOfWeek().getValue());
//        System.out.println("Ngày thứ bao nhiêu của năm " + localDate.getDayOfYear());

        // Cộng ngày tháng năm
//        System.out.println("Năm sau khi cộng 3 : " + localDate.plusYears(3));
//        System.out.println("Tháng sau khi cộng 2 : " + localDate.plusMonths(2));
//        System.out.println("Ngày sau khi cộng 10 : " + localDate.plusDays(10));
//        System.out.println("Week sau khi cộng 12 : " + localDate.plusWeeks(12));

        // Trừ ngày tháng năm
//        System.out.println("Năm sau khi trù 2 : " + localDate.minusYears(2));
//        System.out.println("Tháng sau khi trừ 5 : " + localDate.minusMonths(5));
//        System.out.println("Ngày sau khi trừ 10 : " + localDate.minusDays(10));
//        System.out.println("Week sau khi trừ 2 : " + localDate.minusWeeks(2));

        // Convert đối tượng LocalDate
        //Convert LocaDate thành String
//        String strDate = ld1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(strDate);

        // Conver String thành LocalDate
//        String strDate1 = "22/05/2022";
//        LocalDate ld4 = LocalDate.parse(strDate1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(ld4);
    }
}
