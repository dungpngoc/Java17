package user_management.backend.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UpdateUserPassword {
    private String newPassword;

    public UpdateUserPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
