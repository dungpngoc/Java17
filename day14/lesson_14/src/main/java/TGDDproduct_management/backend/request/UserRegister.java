package TGDDproduct_management.backend.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegister {
    private String username;
    private String password;
    private String email;
}
