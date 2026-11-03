
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class mmm {
    static final List<String> names = new ArrayList<>();
    static final List<Double> prices = new ArrayList<>();
    static final List<Integer> quantities = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so san pham: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten san pham thu " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Nhap gia: ");
            double price = sc.nextDouble();
            System.out.print("Nhap so luong: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            addItem(name, price, quantity);
        }
        int choice;
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them mat hang");
            System.out.println("2. Xoa mat hang");
            System.out.println("3. Xem gio hang");
            System.out.println("4. Xem tong tien");
            System.out.println("5. Them so luong");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Nhap ten san pham: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = sc.nextDouble();
                    System.out.print("Nhap so luong: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    if (name.trim().isEmpty()
                            || price <= 0 || quantity <= 0) {
                        System.out.println("Du lieu khong hop le!");
                    } else {
                        addItem(name, price, quantity);
                        System.out.println("Da them mat hang!");
                    }
                    break;
                }
                case 2: {
                    printCart();
                    if (names.isEmpty()) {
                        break;
                    }
                    System.out.print("Nhap so thu tu can xoa: ");
                    int displayNumber = sc.nextInt();
                    sc.nextLine();
                    removeItem(displayNumber - 1);
                    break;
                }
                case 3:
                    printCart();
                    break;
                case 4:
                    System.out.println("Tong tien: " + totalPrice());
                    break;
                case 5: {
                    printCart();
                    if (names.isEmpty()) {
                        break;
                    }
                    System.out.print("Nhap so thu tu san pham: ");
                    int displayNumber = sc.nextInt();
                    int index = displayNumber - 1;
                    if (index < 0 || index >= names.size()) {
                        System.out.println("Khong tim thay mat hang.");
                    } else {
                        System.out.print("Nhap so luong muon them: ");
                        int amount = sc.nextInt();
                        if (amount <= 0) {
                            System.out.println(
                                    "So luong phai lon hon 0!"
                            );
                        } else {
                            quantities.set(
                                    index,
                                    quantities.get(index) + amount
                            );
                            System.out.println("Da cap nhat so luong!");
                        }
                    }
                    sc.nextLine();
                    break;
                }

                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 0);

        sc.close();
    }
    static void addItem(String name, double price, int quantity) {
        names.add(name);
        prices.add(price);
        quantities.add(quantity);
    }
    static void printCart() {
        if (names.isEmpty()) {
            System.out.println("Gio hang dang trong!");
            return;
        }
        for (int i = 0; i < names.size(); i++) {
            double amount = prices.get(i) * quantities.get(i);

            System.out.println(
                    (i + 1) + ". " + names.get(i)
                            + " | Gia: " + prices.get(i)
                            + " | So luong: " + quantities.get(i)
                            + " | Thanh tien: " + amount
            );
        }
    }
    static void removeItem(int index) {
        if (index < 0 || index >= names.size()) {
            System.out.println("Khong tim thay mat hang.");
            return;
        }
        names.remove(index);
        prices.remove(index);
        quantities.remove(index);
        System.out.println("Da xoa mat hang!");
    }

    static double totalPrice() {
        double total = 0;
        for (int i = 0; i < names.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }
        return total;
    }
}

