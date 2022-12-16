package empoylee_management.database;




import empoylee_management.model.Empoylee;

import java.util.ArrayList;
import java.util.List;
// 1 Tạo danh sách nhân viên
public class EmpoyleeDB {
    public static ArrayList<Empoylee> empoylees = new ArrayList<>(List.of(
            new Empoylee(1,"Nguyễn Văn A", "a@gmail.com",7_000_000),
            new Empoylee(2,"Trần Văn B", "b@gmail.com",15_000_000),
            new Empoylee(3,"Nguyễn Văn C", "c@gmail.com",8_000_000),
            new Empoylee(4,"Nguyễn Văn D", "d@gmail.com",4_000_000),
            new Empoylee(5,"Nguyễn Văn E", "e@gmail.com",20_000_000),
            new Empoylee(6,"Nguyễn Văn F", "f@gmail.com",9_000_000)
    ));
}
