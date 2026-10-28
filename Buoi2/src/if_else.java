import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VAT_RATE = 0.10;
        final int SHIPPING_FEE = 20000;
        System.out.print("Nhập tên sản phẩm: ");
        String tenH = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        double price = sc.nextDouble();
        if (price <= 0) {
            System.out.println("Giá phải lớn hơn 0.");
        } else {
            System.out.print(" (Giá hợp lệ)");
        }
        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();
        if (quantity <= 0) {
            System.out.println("Số lượng phải lớn hơn 0.");
        } else {
            System.out.println(" (Số lượng hợp lệ)");
        }
        sc.nextLine();
        double thanhTien = price * quantity;
        double tongThanhToan = thanhTien + thanhTien * VAT_RATE + SHIPPING_FEE;
        System.out.println("Số tiền cần thanh toán: "+ tongThanhToan);
    }

}
