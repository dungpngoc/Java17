package book_management.backend.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

// Tạo request để lưu trữ thông tin các yêu cầu
// Yêu cầu từ người dùng nhập vào bàn phím để tóm hết 1 cục vào đây và gửi sang controller xử lý
public class UpdateBookRequest {
    private String title;
    private String author;
}
