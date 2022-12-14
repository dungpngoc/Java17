package film_manegement;

import book_management.controller.BookController;
import film_manegement.controller.FilmController;

public class Test {
    public static void main(String[] args) {
        FilmController filmController = new FilmController();
        filmController.run();
    }
}
