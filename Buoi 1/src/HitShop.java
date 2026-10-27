import java.util.Scanner;
public class HitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenH = sc.nextLine();
        double donGia = sc.nextDouble();
        int soLuong = sc.nextInt();
        final double VAT_RATE = 0.10;
        final int SHIPPING_FEE = 20000;
        System.out.println("Nhap ten mat hang: "+ tenH);
        System.out.println("Nhap don gia: "+ donGia);
        System.out.println("Nhap so luong: "+ soLuong);
        double thanhTien = donGia * soLuong;
        double tongThanhToan = thanhTien + thanhTien * VAT_RATE + SHIPPING_FEE;
        System.out.println("So tien phai tra: "+ tongThanhToan);
    }
}

