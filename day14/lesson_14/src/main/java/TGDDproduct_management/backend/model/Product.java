package TGDDproduct_management.backend.model;
// Mã sản phẩm
//Tên sản phẩm
//Mô tả
//Giá tiền
//Số lượng
//Số lượng bán
//Hãng
//Danh mục

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    public int productCode;
    public String productName;
    public String description;
    public int price;
    public String brand;
    public String categories;
}

