package user_management.backend.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UpdateUserName {
    private String username;

    public UpdateUserName(String username) {
        this.username = username;
    }
}
