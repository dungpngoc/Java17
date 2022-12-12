package classDemo;

public class Calculator {
    // Khai báo thuộc tính
    public int number1;
    public int number2;

    public void printInfo() {
        System.out.println("In ra 2 số: " + number1 + " " + number2);
    }

    public int addition() {
        double add = number1 + number2;
        return (int) add;
    }

    public int subtract() {
        double minus = number1 - number2;
        return (int) minus;
    }

    public double multi() {
        double multiplication = number1*number2;
        return multiplication;
    }

    public double division() {
        double result = 0.0;
        try {
            result = (double) (number1 / number2);
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
