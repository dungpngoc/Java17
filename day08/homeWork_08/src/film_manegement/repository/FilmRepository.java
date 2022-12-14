package film_manegement.repository;

import film_manegement.database.FilmDatabase;
import film_manegement.model.Film;
import film_manegement.model.Movie;
import film_manegement.model.Serial;

// 3. Tạo repositoy để tạo phương thức lấy dữ liệu từ database
// Tạo 2 mảng để quản lý Movie và Serial
public class FilmRepository {
    public static Movie[] moviesInfo() {
        return FilmDatabase.movies;
    }
    public static Serial[] filmsInfo() {
        return FilmDatabase.serials;
    }
}
