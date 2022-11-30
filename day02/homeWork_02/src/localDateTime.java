import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class localDateTime {
    public static void main(String[] args) {
        // Khởi tạo ngày và giờ hiện tại
        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Ngày giờ hôm nay là : " + toDay);

        LocalDateTime toDay1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Ngay va gio hom nay la : " + toDay1);

        // Khởi tạo 1/12/2022
        LocalDateTime lcDateTime = LocalDateTime.of(2022,12,1,15,20);
        System.out.println(lcDateTime);

        // Múi giờ
        LocalDateTime toDayinHN = LocalDateTime.now(ZoneId.of("Asia/HaNoi"));
        System.out.println(toDayinHN);

    }
}
