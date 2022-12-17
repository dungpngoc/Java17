package product_management.database;

import product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    public static ArrayList<Product> products = new ArrayList<>(List.of(
            new Product(1,"Sữa","Béo",6,10_000),
            new Product(2,"Bánh","Ngọt",8,15_000),
            new Product(3,"Kem","Lạnh",4,12_000),
            new Product(4,"Áo","Ấm",10,80_000),
            new Product(5,"Giày","Đẹp",3,120_000)
    ));
}
