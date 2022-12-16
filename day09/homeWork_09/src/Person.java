public class Person {
    public String name;
    public int age;
    public Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.print(name + " - " + age + " - ");
        System.out.print(address.district + ", " + address.city + ", " + address.country);
    }
}
