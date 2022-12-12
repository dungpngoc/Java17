package staticDemo;

public class Test {
    public static void main(String[] args) {
        // Biến, phương thức static thuộc về class chứ ko phải đối tượng
        System.out.println(Film.category);
        Film.methodStatic();

        Film film = new Film();
        film.methodNormal();

        System.out.println(Film.category);

        Film.changeCategory();
    }
}
