package book_management.service;

import book_management.model.Book;
import book_management.repository.BookRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner sc = new Scanner(System.in);
    List<Book> book = BookRepository.getObjectFromJsonFile("list-book.json");
    public void printInfo() {
        System.out.println("Thông tin tất cả các cuốn sách:");
        for (Book book1: book) {
            System.out.println(book1);
        }
    }

    public void findByName() {
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        int count = 0;
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getTitle().contains(title)) {
                System.out.printf("Sách có title %s là: ",title);
                System.out.println(book.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Không tìm thấy sách nào có title %s",title);
        }
    }

    public void findByCategory() {
        int count = 0;
        System.out.print("Nhập thể loại sách cần tìm: ");
        String category = sc.nextLine();

        for (int i = 0; i < book.size(); i++) {
            for (int j = 0; j < book.get(i).getCategory().length; j++) {
                if (count == 0 && book.get(i).getCategory()[j].contains(category)) {
                    System.out.println("Sách có tiêu đề " + category + " là ");
                }
                if (book.get(i).getCategory()[j].contains(category)) {
                    System.out.println(book.get(i));
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.printf("Không tìm thấy sách có cùng thể loại %s ",category);
            System.out.println();
        }
    }

    public void sortByPageNumber() {
        book.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
               return o1.getPage_number() - o2.getPage_number();
            }
        });
        System.out.println("Sắp xếp số trang tăng dần:");
        for (Book book1: book) {
            System.out.println(book1);
        }
    }

    public void sortByReleaseYear() {
        book.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() - o2.getRelease_year();
            }
        });
        System.out.println("Sắp xếp sách theo năm tăng dần:");
        for (Book book1: book) {
            System.out.println(book1);
        }
    }
}
