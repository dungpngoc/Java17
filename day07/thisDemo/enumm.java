package thisDemo;

public class enumm {


    public static void main(String[] args) {
//        Size size = Size.MEDIUM;
//        System.out.println(size);

//        for (Size size: Size.values()) {
//            System.out.println(size);

        Size size = Size.SMALL;

        float height = 1.63f;
        if (height >= 1.5 && height < 1.6) {
            size = Size.SMALL;
        }

        if (height >= 1.6 && height < 1.65) {
            size = Size.MEDIUM;
        }

        if (height > 1.65 && height < 1.75) {
            size = Size.LARGE;
        }
        System.out.println(size.getValue());
        }
    }

