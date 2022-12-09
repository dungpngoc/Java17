package homeWork_05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Cách 1 : Khai báo sô lượng phần tử cho mảng
        int[] numbers = new int[3]; // Mảng có 3 phần tử

        // Khai báo giá trị cho các phần tử theo chỉ số
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        // Cách 2 : Khai báo và khởi tạo giá trị cho mảng
        String[] names = {"hiên", "an", "huy"};
        System.out.println(Arrays.toString(names));

        // Tương đường
        String[] namesOther = new String[]{"hiên", "an", "huy"};
        System.out.println(Arrays.toString(namesOther));

        // Reference Type( Kiểu tham chiếu)
        String[] emails = {"a@gmail.com", "b@gmail.com", "c@gmail.com"};
        String[] emailsOther = emails; // địa chỉ bộ nhớ

        System.out.println("emails : " + Arrays.toString(emails));
        System.out.println("emailsOther : " + Arrays.toString(emailsOther));

        emailsOther[0] = "d@gmail.com";
        System.out.println("emails : " + Arrays.toString(emails));
        System.out.println("emailsOther : " + Arrays.toString(emailsOther));

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        for (String name:names) {
            System.out.println(name);
        }
        // Sử dụng String.join để convert từ array sang String ngăn cách nhau = " "
        String namesString = String.join(" ",names);
        System.out.println(namesString);
        // Sử dụng split để convert từ string sang array
        String message = "Một ngày nào đó";
        String[] messageArray = message.split(" ");
        System.out.println(Arrays.toString(messageArray));

        for (int j = 0; j < messageArray.length; j++) {
            messageArray[j] = messageArray[j].substring(0,1).toUpperCase() + messageArray[j].substring(1).toLowerCase();
        }

        System.out.println("After : " + Arrays.toString(messageArray));

        String mesageString = String.join(" ",messageArray);
        System.out.println("String mesage : " + mesageString);
    }
}
