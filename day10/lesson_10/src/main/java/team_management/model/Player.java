package team_management.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

// 2. Tạo class Plaer và khai báo các thuộc tính , generrate
public class Player {
    private int number;
    private String name;
    private Position position;

}
