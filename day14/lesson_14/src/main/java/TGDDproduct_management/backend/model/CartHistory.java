package TGDDproduct_management.backend.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CartHistory {
    private String email;
    private int productId;
    private String productName;
    public int productQuantity;
}
