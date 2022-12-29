package fptproduct_management.backend.model;
// Mã sản phẩm
//Tên sản phẩm
//Mô tả
//Giá tiền
//Số lượng
//Số lượng bán
//Hãng
//Danh mục

import lombok.*;

import java.util.List;

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
    public int quantity;
    public int soldQuantity;
    public String brand;
    public List<String> categories;
}
