package book_management.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// 1. Khai báo cá thuộc tính
public class Book {
    private int id;
    private String title;

    // Sử dụng @SerialzedName để map đúng tên với tên của file dữ liệu
    @SerializedName("category")
    private List<String> categories;

    private String author;

    @SerializedName("page_number")
    private int pageNumber;

    @SerializedName("release_year")
    private int releaseYear;
}