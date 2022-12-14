package encapsulation_demo;

import encapsulation_practice.Student;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Dũng Phạm");
        person.setAge(26);
        person.setEmail("dungpngoc@gmail.com");

        System.out.println(person);
    }
}
