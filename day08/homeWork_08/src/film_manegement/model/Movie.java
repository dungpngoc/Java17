package film_manegement.model;
// 1b. Tạo lớp Movie kế thừa lớp Film cha
// Tạo contructor và thêm thuộc tính của lớp Moive
public class Movie extends Film {
    private int time;


    // Khai báo contructor ko tham số và đủ tham số

    public Movie() {}

    public Movie(int id, String title, String category, String director, String premiereDate, int time) {
        super(id, title, category, director, premiereDate);
        this.time = time;
    }

    // Gọi hàm setter và getter

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
