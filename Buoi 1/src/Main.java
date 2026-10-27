import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println ("Nhap chieu dai: "+ a);
        System.out.println ("Nhap chieu rong: "+ b);
        double price= a*b;
        int chuVi = 2*(a+b);
        System.out.println("chu vi: "+ chuVi);
        System.out.println("Dien tich: "+price);
    }
}