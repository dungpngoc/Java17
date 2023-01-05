package practice;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private int id;
    private String name;
    private int price;
    private String brand;
    private int count;
}
