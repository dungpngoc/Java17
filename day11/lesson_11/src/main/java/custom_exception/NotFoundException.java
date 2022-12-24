package custom_exception;

public class NotFoundException extends RuntimeException {
    // Tạo contructor để thông báo nguyên nhân lỗi là gì (message)
    public NotFoundException(String message) {
        super(message);
    }
}
