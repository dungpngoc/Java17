public class switchcase {
    public static void main(String[] args) {
        int money = 8000;

        switch (money) {
            case 12000:
            case 15000:
            case 18000:{
                System.out.println("Cà phê sữa");
                break;
            }
            case 10000: {
                System.out.println("Cà phê đá");
                break;
            }
            case 8000: {
                System.out.println("Sting dâu");
                break;
            }
            case 2000: {
                System.out.println("Trà đá");
                break;
            }
            default: {
                System.out.println("Không có đồ uống phù hợp");
                break;
            }
        }
    }
}
