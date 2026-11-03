import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantitys = new ArrayList<>();

        names.add("Áo thun");
        prices.add(12000.0);
        quantitys.add(2);

        names.add("Quần bò");
        prices.add(20000.0);
        quantitys.add(1);

        System.out.println("===========Danh sách hiền có=============");
        for(int i=0 ;i< names.size(); i++){
            System.out.println("Mặt hàng: "+ names.get(i)+ "| Giá: "+ prices.get(i)+"| Số lượng: "+ quantitys.get(i));
        }
        System.out.println("==========================================");
        System.out.println();

        System.out.println("--------------Menu---------------");
        int choice;
        do {
            System.out.println("1. Thêm mặt hàng");
            System.out.println("2. Xóa mặt hàng");
            System.out.println("3. Xem giỏ");
            System.out.println("4. Xem tổng tiền");
            System.out.println("5. Thêm Số lượng");
            System.out.println("0. Thoát");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");

            switch (choice) {
                case 1 -> {
                    System.out.println("Đang thêm");
                    System.out.println("Số lượng mặt hàng muốn thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thêm mặt hàng " + (i + 1) + ": ");
                        String nameNews = sc.nextLine();
                        names.add(nameNews);
                        System.out.println("Giá mặt hàng: ");
                        double pricesNew = sc.nextDouble();
                        prices.add(pricesNew);
                        System.out.println("Số lượng mặt hàng: ");
                        int quantitysNew = sc.nextInt();
                        sc.nextLine();
                        quantitys.add(quantitysNew);
                        System.out.println();
                    }
                }

                case 2 -> {
                    System.out.println("Đang xóa");
                    System.out.println("Muốn xóa mặt hàng thứ: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    int indexCanXoa = a - 1;
                    if (indexCanXoa >= 0 && indexCanXoa < names.size()) {
                        names.remove(indexCanXoa);
                        prices.remove(indexCanXoa);
                        quantitys.remove(indexCanXoa);
                        System.out.println(">>>Đã xóa thành công!");
                    } else {
                        System.out.println(">>>Số thứ tự không tồn tại!");
                    }
                }

                case 3 -> System.out.println("Đang xem giỏ");
                case 4 -> {
                    System.out.println("Đang tính tổng");
                    double Sum = 0;
                    for (int i = 0; i < names.size(); i++) {
                        Sum +=quantitys.get(i) * prices.get(i);
                    }
                    System.out.println("Tổng tièn: " + Sum);
                }
                case 5 -> {
                    System.out.println("Dang thêm số lượng");
                    System.out.println("Thêm số lượng mặt hàng: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập số lượng mới: ");
                    int soLuongMoi = sc.nextInt();
                    for (int i = 0; i < names.size(); i++) {
                        if (name.equals(names.get(i))) {
                            quantitys.set(i,soLuongMoi);
                        }
                    }
                }
                case 0 -> System.out.println("Kết thúc.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
        System.out.println("========Danh sách sau khi thay đổi=======");
        for(int i=0 ;i< names.size(); i++){
            System.out.println("Mặt hàng: "+ names.get(i)+ "| Giá: "+ prices.get(i)+"| Số lượng: "+ quantitys.get(i));
        }
        System.out.println("==========================================");
    }

}
