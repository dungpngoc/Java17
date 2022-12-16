package main.java;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        // Cách 1 :Sử dụng contructor(gán đúng thứ tự giá trị)
        Person person = new Person(1,"DungPham","dung@gmail.com");
        System.out.println(person);

        // Cách 2 : Sử dụng builder (ko cần quan trọng thứ tự truyền giá trị cho đối tượng)
        Person person1 = Person.builder()
                .email("a@gmail.com")
                .id(2)
                .name("Nguyễn Văn A")
                .build();
        System.out.println(person1);

        // Tạo nhiều đối tượng Person
        Faker faker = new Faker();
        Person[] people = new Person[20];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(i + 1, faker.name().fullName(), faker.internet().emailAddress());
        }

        for (Person p: people) {
            System.out.println(p);
        }

        System.out.println(faker.leagueOfLegends().champion());
    }
}
