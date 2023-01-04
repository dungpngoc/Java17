package TGDDproduct_management.backend.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cart {
    private String email;
    private int productId;
    private String productName;
    private int productQuantity;
}
