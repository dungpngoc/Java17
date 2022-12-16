package film_manegement.service;

import film_manegement.database.FilmDatabase;
import film_manegement.model.Film;
import film_manegement.model.Serial;
import film_manegement.repository.FilmRepository;

// 4. Tạo Service để xử lý logic trong ứng dụng này
// Tìm kiếm film theo tiêu đề
public class FilmService {
    // Tạo đối tượng để lấy phương thức ở lớp repository
    FilmRepository filmRepository = new FilmRepository();


    public void findBytitle(String title) {
        int count = 0;
        for (Serial film:filmRepository.filmsInfo()) {
            if (film.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(film);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có bộ phim nào có title = " + title);
        }
    }

    public void filmInfo() {
        for (Serial film:filmRepository.filmsInfo()) {
            System.out.println(film);
        }
    }
}
