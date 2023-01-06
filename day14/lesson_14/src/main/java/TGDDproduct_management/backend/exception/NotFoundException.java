package TGDDproduct_management.backend.exception;

import lombok.ToString;

@ToString
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
