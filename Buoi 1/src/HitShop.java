import java.util.Scanner;
public class HitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VAT_RATE = 0.10;
        final int SHIPPING_FEE = 20000;
        System.out.print("Nhap ten mat hang: ");
        String tenH = sc.nextLine();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        double thanhTien = donGia * soLuong;
        double tongThanhToan = thanhTien + thanhTien * VAT_RATE + SHIPPING_FEE;
        System.out.println("So tien phai tra: "+ tongThanhToan);
    }
}

