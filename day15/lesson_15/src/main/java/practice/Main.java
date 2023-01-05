package practice;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iphone 14 Pro Max",35_000_000,"Apple",2));
        products.add(new Product(2,"OPPO Find X3 Pro",9_000_000,"OPPO",1));
        products.add(new Product(3,"Xiaomi Mi 13",15_000_000,"Xiaomi",3));
        products.add(new Product(4,"Iphone 13",21_000_000,"Apple",2));
        products.add(new Product(5,"Samsung Ze Fold 4",42_000_000,"Samsung",4));

        // 1.
        System.out.println("Thông tin các sản phẩm : ");
        printInfo(products);


        // 2.
        System.out.println("Tổng tiền tất cả các sản phẩm : ");
        System.out.println(getTotalProduct(products));
        System.out.println("Cách 2, sử dụng formatMoney : ");
        System.out.println(formatMoney(getTotalProduct(products)));


        // 3.
        System.out.println("Tìm các sản phẩm của thuơng hiệu “Apple : ");
        printInfo(findByBrand(products,"Apple"));

        // 4.
        System.out.println("Tất cả các sản phẩm có giá > 20000000 là : ");
        printInfo(findByPrice(products,20000000));

        // 5.
        System.out.println("Tất cả các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường) là : ");
        printInfo(findByPro(products,"pro"));

        // 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product
        System.out.println("Tất cả các sản phẩm sau khi thêm 1 sản phẩm bất kỳ là : ");
        printInfo(addRandomProduct(products));

        // 7. Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng
        System.out.println("Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng : ");
        printInfo(deleteByBrand(products,"Samsung"));

        // 8. Sắp xếp giỏ hàng theo price tăng dần
        System.out.println("Sắp xếp giỏ hàng theo price tăng dần (Sử dụng lambda) : ");
        printInfo(sortByPrice(products));

        // 9. Sắp xếp giỏ hàng theo count giảm dần
        System.out.println("Sắp xếp giỏ hàng theo count giảm dần (Sử dụng collection lambda) : ");
        printInfo(sortByCount(products));

        // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
        System.out.println("Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng : ");
        printInfo(putOutRandom(products));
    }


//        In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
//        ID - Tên - Giá - Thương Hiệu - Số lượng
//        Ví dụ : 1- OPPO Find X3 Pro - 19500000 - OPPO - 3

    public static void printInfo(List<Product> products) {
        products.forEach(product -> System.out.println(product.getId() + " - "
                + product.getName() + " - " + (formatMoney(product.getPrice())) + " - "
                + product.getBrand() + " - " + product.getCount()));
    }


//        Tính tổng tiền tất cả sản phẩm trong giỏ hàng
//        Tổng tiền mỗi sản phẩm = price * count

    public static int getTotalProduct(List<Product> products) {
        return products.stream()
                .map(product -> product.getCount() * product.getPrice())
                .mapToInt(Integer::valueOf).sum();
    }

    public static String formatMoney(long price) {
        DecimalFormat formatter = new DecimalFormat("###,###,### VND");
        return formatter.format(price);
    }


//        Tìm các sản phẩm của thuơng hiệu “Apple”
    public static List<Product> findByBrand(List<Product> products,String brand) {
        return products.stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

//        Tìm các sản phẩm có giá > 20000000
    public static List<Product> findByPrice(List<Product> products,int price) {
        List<Product> list = products.stream()
                .filter(product -> product.getPrice() > price).toList();
        return list;
    }

//        Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)
    public static List<Product> findByPro(List<Product> products,String str) {
        List<Product> list = products.stream()
                .filter(product -> product.getName().toLowerCase().contains(str.toLowerCase())).toList();
        return list;
    }


//        Thêm 1 sản phẩm bất kỳ vào trong mảng product
    public static List<Product> addRandomProduct(List<Product> products) {
        Random rd = new Random();
        int id = rd.nextInt(5);
        List<Product> list = products.stream()
                .filter(product -> product.getId() == id).toList();
        products.addAll(list);
        return products;
    }

//        Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng
    public static List<Product> deleteByBrand(List<Product> products, String brand) {
        List<Product> list = products.stream()
                .filter(product -> product.getBrand() != brand)
                .toList();
        return list;
    }

//        Sắp xếp giỏ hàng theo price tăng dần
    public static List<Product> sortByPrice(List<Product> products) {
        Collections.sort(products,(o1, o2) -> {
            return o1.getPrice() - o2.getPrice();
        });
        return products;
    }

//        Sắp xếp giỏ hàng theo count giảm dần
    public static List<Product> sortByCount(List<Product> products) {
        Collections.sort(products,(o1, o2) -> {
            return o2.getCount() - o1.getCount();
        });
        return products;
    }

//        Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng

    public static List<Product> putOutRandom(List<Product> products) {
        Collections.shuffle(products);
        return products.stream()
                .limit(2)
                .collect(Collectors.toList());
    }
}
