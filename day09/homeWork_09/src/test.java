public class test {
    public static void main(String[] args)  {
        Address address = new Address("Nam Tu Liem", "Ha Noi", "Viet Nam");
        Person person = new Person("Ngoc", 25, address);
        person.display();
    }
}
