package film_manegement.model;
// 1c. Tạo lớp con Serial kế thừa thuộc tính lớp Film cha
// Tạo contructor và thêm thuộc tính của lớp Serial
public class Serial extends Film {
    private int episodes;
    private int avgDuration;

    // Khởi tạo contructor
    public Serial() {}
    // id, tiêu đề, thể loại, đạo diễn, ngày công chiếu,  thời lượng, số tập, thời lượng trung bình
    public Serial(int id, String title, String category, String director, String premiereDate, int episodes, int avgDuration) {
        super(id, title, category, director, premiereDate);
        this.episodes = episodes;
        this.avgDuration = avgDuration;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(int avgDuration) {
        this.avgDuration = avgDuration;
    }

    @Override
    public String toString() {
        return "Film{" +
                " id = " + getId() +
                ", title= '" + getTitle() + '\'' +
                ", category ='" + getCategory() + '\'' +
                ", director ='" + getDirector() + '\'' +
                ", premiereDate = " + getPremiereDate() +
                ", episodes = " + episodes +
                ", avgDuration = " + avgDuration +
                '}';
    }
}
