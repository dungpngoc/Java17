import java.util.Scanner;
import java.util.regex.Pattern;

public class minitest06 {
    public static void main(String[] args) {
        // Câu 6 (Nâng cao)
        //Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email và số điện thoại đó có hợp lệ không.
        //
        //Email phải đúng định dạng
        //Số điện thoại có chứa từ 9 đến 11 chữ số
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Email: ");
        String emailAddress = sc.nextLine();
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        System.out.print("Nhập SĐT: ");
        String phoneNumber = sc.nextLine();
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        System.out.println(checkFormat(emailAddress,EMAIL_PATTERN));
        System.out.println(checkPhoneNumber(phoneNumber,reg));

    }
    public static boolean checkFormat(String emailAddress, String EMAIL_PATTERN) {
        return Pattern.compile(EMAIL_PATTERN).matcher(emailAddress).matches();
    }

    public static boolean checkPhoneNumber(String phoneNumber,String reg) {
        return Pattern.compile(reg).matcher(phoneNumber).matches();
    }
}
