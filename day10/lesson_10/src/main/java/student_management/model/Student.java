package student_management.model;

import lombok.*;

// id, name, age, address, point, classroom
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int point;
    private int classroom;
}
