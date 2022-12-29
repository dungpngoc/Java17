package fptproduct_management.backend.database;

import fptproduct_management.backend.model.Product;

import java.util.ArrayList;
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
    public static ArrayList<Product> products = new ArrayList<>(List.of(
            new Product(1,"Iphone 12","iOS",11_200_000,5,10,"Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(2,"Iphone 13","iOS",18_880_000,20,20,"Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(3,"Iphone 14","iOS",30_990_000,30,30,"Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(4,"SamSung Z Series","Androi",20_600_000,20,15,"SamSung", List.of(new String[]{"Điện thoại", "SamSung"})),
            new Product(5,"SamSung A Series","Androi",2_700_000,10,12,"SamSung", List.of(new String[]{"Điện thoại", "SamSung"})),
            new Product(6,"SamSung Galaxy S10","Androi",15_100_000,15,16,"SamSung", List.of(new String[]{"Điện thoại", "SamSung"})),
            new Product(7,"Xiaomi Redmi A1","Androi",2_190_000,8,20,"Xiaomi", List.of(new String[]{"Điện thoại", "Xiaomi"})),
            new Product(8,"Xiaomi 11T","Androi",7_990_000,12,19,"Xiaomi", List.of(new String[]{"Điện thoại", "Xiaomi"})),
            new Product(9,"Xiaomi 11 Lite","Androi",9_490_000,9,22,"Xiaomi", List.of(new String[]{"Điện thoại", "Xiaomi"})),
            new Product(11,"MacBook Pro 16","iOS",62_990_000,10,15,"Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(12,"MacBook 14","iOS",45_990_000,12,10,"Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(13,"MacBook 13","iOS",27_999_000,25,9,"Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(14,"MacBook Air 13","iOS",22_999_000,30,8,"Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(15,"Asus TUF","Window",13_190_000,19,21,"Asus", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(16,"Xiaomi 12","Window",13_190_000,19,21,"Asus", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(17,"Xiaomi 12","Window",13_190_000,19,21,"Asus", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(18,"Xiaomi 12","Window",13_190_000,19,21,"Xiaomi", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(19,"Xiaomi 12","Window",13_190_000,19,21,"Xiaomi", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(20,"Xiaomi 12","Window",13_190_000,19,21,"Xiaomi", List.of(new String[]{"Laptop", "Xiaomi"})),
            new Product(21,"Xiaomi 12","Window",13_190_000,19,21,"Xiaomi", List.of(new String[]{"Laptop", "Xiaomi"}))
    ));

    public static ArrayList<Product> apple = new ArrayList<>(List.of(
            new Product(1, "Iphone 12", "iOS", 11_200_000, 5, 10, "Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(2, "Iphone 13", "iOS", 18_880_000, 20, 20, "Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(3, "Iphone 14", "iOS", 30_990_000, 30, 30, "Apple", List.of(new String[]{"Điện thoại", "Apple"})),
            new Product(11, "MacBook Pro 16", "iOS", 62_990_000, 10, 15, "Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(12, "MacBook 14", "iOS", 45_990_000, 12, 10, "Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(13, "MacBook 13", "iOS", 27_999_000, 25, 9, "Apple", List.of(new String[]{"Laptop", "Apple"})),
            new Product(14, "MacBook Air 13", "iOS", 22_999_000, 30, 8, "Apple", List.of(new String[]{"Laptop", "Apple"}))
    ));


    public static ArrayList<Product> laptop = new ArrayList<>(List.of(

    ));
}
