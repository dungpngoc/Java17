package book_management.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// 1 Khai báo các thuộc tính của class Book
public class Book {
    private int id;
    private String title;
    private List<String> category;
    private String author;
    @SerializedName("page_number")
    private int pageNumber;
    @SerializedName("release_year")
    private int releaseYear;
}
