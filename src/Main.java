import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luachon, i=0;
        while (i==0) {
            System.out.println("*********************MENU********************");
            System.out.println("1 Xem danh sách");
            System.out.println("2 Thêm mới");
            System.out.println("3 Cập nhập số lượng");
            System.out.println("4 Xoá");
            System.out.println("5 Sắp xếp danh sách theo giá");
            System.out.println("6 Tìm kiếm giá lơn nhất");
            System.out.println("7 Đọc");
            System.out.println("8 Ghi");
            System.out.println("9 Thoát");
            System.out.print("NHẬP LỰA CHỌN: ");
            luachon = input.nextInt();
            switch (luachon) {
                case 1:
                    Product.hien();
                    break;
                case 2:
                Product.addNew(Product.menu());
//                Product.writeFile();
                    break;
                case 3:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập mã vật liệu cần sửa: ");
                    int ma = scanner.nextInt();
                    if (Product.checkma(ma)){
                        System.out.println("Nhập giá mới: ");
                        double soluong = scanner.nextDouble();
                        Product.updateName(ma, soluong);
//                        Product.writeFile();
                    }else {
                        System.out.println("Không có sản phẩm cần tìm");
                    }
                    break;
                case 4:
                     Product.remove();
                    break;
                case 5:
                    Product.sort();
                    break;
                case 6:
                Product.max();
                    break;
                case 7:
                ReadWriteFile.readDataFromFile();
                    break;
                case 8:
                    ReadWriteFile.writeDataToFile(Product.productList);
                    break;
                case 9:
                    System.exit(0);
                    break;

            }
        }
    }
}