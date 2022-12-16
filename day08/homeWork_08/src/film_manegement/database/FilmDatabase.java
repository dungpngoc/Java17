package film_manegement.database;

import film_manegement.model.Film;
import film_manegement.model.Movie;
import film_manegement.model.Serial;

public class FilmDatabase {
    // 2. Tạo database chứa dữ liệu film
    // Tạo lớp chứa các đối tượng có các thuộc tính theo như đề bài
    
    public static Film[] film = {
            new Film(1,"Thương ngày nắng về","Tình cảm, gia đình","Bùi Tiến Huy","15/11/2021"),
            new Film(2,"Chồng cũ, vợ cũ, người yêu cũ","Tình yêu đôi lứa, gia đình","Vũ Minh Trí","22/04/2022"),
            new Film(3,"Bão ngầm","Cảnh sát hình sự","Đinh Thái Thụy","21/02/2022"),
    };

    public static Movie[] movies = {
            new Movie(1,"Thương ngày nắng về","Tình cảm, gia đình","Bùi Tiến Huy","15/11/2021",60),
            new Movie(2,"Chồng cũ, vợ cũ, người yêu cũ","Tình yêu đôi lứa, gia đình","Vũ Minh Trí","22/04/2022",70),
            new Movie(3,"Bão ngầm","Cảnh sát hình sự","Đinh Thái Thụy","21/02/2022",80),
    };

    public static Serial[] serials = {
            new Serial(1,"Thương ngày nắng về","Tình cảm, gia đình","Bùi Tiến Huy","15/11/2021",33,65),
            new Serial(2,"Chồng cũ, vợ cũ, người yêu cũ","Tình yêu đôi lứa, gia đình","Vũ Minh Trí","22/04/2022",70,75),
            new Serial(3,"Bão ngầm","Cảnh sát hình sự","Đinh Thái Thụy","21/02/2022",80,82),
    };
}
