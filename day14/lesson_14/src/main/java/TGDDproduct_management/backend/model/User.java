package TGDDproduct_management.backend.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    public String username;
    public String password;
    public String email;
    private Address address;
}
