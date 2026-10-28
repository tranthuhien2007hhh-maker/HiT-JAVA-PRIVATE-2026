import java.util.ArrayList;
import java.util.Scanner;
public class for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tenH = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String ten = sc.nextLine();
            tenH.add(ten);
        }
        System.out.println();
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < tenH.size(); i++) {
            System.out.println((i + 1) + ". " + tenH.get(i));
        }
        sc.close();
    }
}