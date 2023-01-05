package stream_api;

import java.util.List;
import java.util.Optional;

public class Pratice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);
//        1. Duyệt numbers
        System.out.println("1. Duyệt numbers : ");
        numbers.stream().forEach(n -> System.out.println(n));

//        2. Tìm các giá trị chẵn trong list
        System.out.println("2. Tìm các giá trị chẵn : ");
//        List<Integer> rs = numbers.stream().filter(n -> n % 2 == 0).toList();
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);


//        3. Tìm các giá trị > 5 trong list
        System.out.println("3. Tìm các giá trị > 5 trong list : ");
        numbers.stream().filter(n -> n % 5 == 0).forEach(System.out::println);


//        4. Tìm giá trị max trong list
        System.out.println("4. Cách 1 Tìm giá trị max trong list : ");
        List<Integer> listSortAsc = numbers.stream().sorted().toList();
        Integer max = listSortAsc.get(listSortAsc.size() - 1);
        System.out.println("Max : " + max);

        System.out.println("Cách 2 optional Tìm giá trị max trong list : ");
        Optional<Integer> optionalMax = numbers.stream().max((a,b) -> a - b);
        optionalMax.ifPresent(System.out::println);
//        5. Tìm giá trị min trong list
        System.out.println("5. Tìm giá trị min trong list : ");
        List<Integer> listSorted = numbers.stream().sorted().toList();
        Integer min = listSorted.get(0);
        System.out.println("Min : " + min);


//        6. Tính tổng các phần tử của mảng
        System.out.println("6. Tính tổng các phần tử của mảng : ");
        int total = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Sum : " + total);

        System.out.println("Cách 2");
        int total1 = numbers.stream().reduce(0,(a,b) -> a + b);
        System.out.println("Total1 : " + total1);

//        7. Lấy danh sách các phần tử không trùng nhau
        System.out.println("7. Lấy danh sách các phần tử không trùng nhau : ");
        numbers.stream().distinct().forEach(System.out::println);


//        8. Lấy 5 phần tử đầu tiên trong mảng
        System.out.println("8. Lấy 5 phần tử đầu tiên trong mảng : ");
        numbers.stream().limit(5).forEach(System.out::println);


//        9. Lấy phần tử từ thứ 3 -> thứ 5
        System.out.println("9. Lấy phần tử từ thứ 3 -> thứ 5 : ");
        numbers.stream().skip(2).limit(3).forEach(System.out::println);


//        10. Lấy phần tử đầu tiên > 5
        System.out.println("10. Lấy phần tử đầu tiên > 5 : ");
        numbers.stream().filter(n -> n > 5).findFirst().ifPresent(System.out::println);
        System.out.println("Cách 2 :");
        List<Integer> list = numbers.stream().filter(n -> n > 5).limit(1).toList();
        if (list.size() > 0) {
            System.out.println(list.get(0));
        }


//        11. Kiểm tra xem list có phải là list chẵn hay không
        System.out.println("11. Kiểm tra xem list có phải là list chẵn hay không : ");
        System.out.println(numbers.stream().allMatch(n -> n % 2 == 0));

//        12. Kiểm tra xem list có phần tử > 10 hay không
        System.out.println("12. Kiểm tra xem list có phần tử > 10 hay không : ");
        System.out.println(numbers.stream().anyMatch(n -> n > 10));

//        13. Có bao nhiêu phần tử > 5
        System.out.println("13. Có bao nhiêu phần tử > 5 : ");
        System.out.println(numbers.stream().filter(n -> n > 5).count());

//        14. Nhân đôi các phần tủ trong list và trả về list mới
        System.out.println("14. Nhân đôi các phần tủ trong list và trả về list mới : ");
        List<Integer> listx2 = numbers
                .stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(listx2);

//        15. Kiểm tra xem list không chứa giá trị nào = 8 hay không
        System.out.println("15. Kiểm tra xem list không chứa giá trị nào = 8 hay không : ");
        System.out.println(numbers.stream().noneMatch(n -> n == 8));
        System.out.println("Cách 2 sử dụng anyMatch : ");
        System.out.println(numbers.stream().anyMatch(n -> n != 8));

    }
}
