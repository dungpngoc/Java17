package TGDDproduct_management.backend.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String province;
    private String district;
    private String street;
    private int houseNumber;
}
