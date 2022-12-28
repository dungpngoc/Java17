package interface_demo;

public interface IShape {
    String massage = "shape"; // pulic, static, final
    double getArea();
    double getPerimeter();

    default void sayHello() {
        System.out.println("Hello shape");
    }

    static void hi() {
        System.out.println("Hi");
    }
}
