package TGDDproduct_management.backend.database;

import TGDDproduct_management.backend.model.Product;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;
// Mã sản phẩm
//Tên sản phẩm
//Mô tả
//Giá tiền
//Số lượng
//Số lượng bán
//Hãng
//Danh mục

public class ProductDB {
    public static List<Product> products = FileUtils.getDataFromFile("list-product.json");
}
