import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Nhap chieu dai: ");
        int a = sc.nextInt();
        System.out.println ("Nhap chieu rong: ");
        int b = sc.nextInt();
        double price= a*b;
        int chuVi = 2*(a+b);
        System.out.println("chu vi: "+ chuVi);
        System.out.println("Dien tich: "+price);
    }
}