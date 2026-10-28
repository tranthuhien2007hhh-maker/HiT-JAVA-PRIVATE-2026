import java.util.Scanner;
public class do_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Thêm mặt hàng");
            System.out.println("2. Xóa mặt hàng");
            System.out.println("3. Xem giỏ");
            System.out.println("4. Xem tổng tiền");
            System.out.println("0. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Đang thêm");
                case 2 -> System.out.println("Đang xóa");
                case 3 -> System.out.println("Đang xem giỏ");
                case 4 -> System.out.println("Đang tính tổng");
                case 0 -> System.out.println("Kết thúc.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }while(choice != 0);
        sc.close();
    }
}