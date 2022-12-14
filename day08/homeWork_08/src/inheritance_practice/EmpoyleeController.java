package inheritance_practice;

import java.util.Scanner;

public class EmpoyleeController {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;
        EmpoyleeDatabase empoyleeDatabase = new EmpoyleeDatabase();
        while (!isQuit) {
            System.out.print("Nhập lựa chọn : ");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Nhập thông tin nhân viên Dev: ");
                    empoyleeDatabase.runDev();
                    break;
                }
                case 2: {
                    System.out.println("Nhập thông tin nhân viên Tester: ");
                    empoyleeDatabase.runTester();
                    break;
                }
                case 3: {
                    System.out.println("Exit");
                    isQuit = true;
                    break;
                }
            }
        }
    }
}
