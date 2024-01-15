import java.io.FileNotFoundException;
import java.util.*;

public class Product {
    public static int productCode;
    public static String name;
    public static double price;
    public static double quantity;
    public static String describe;

    public Product() {
    }
    public void imput() {
        Scanner inputm = new Scanner(System.in);
        System.out.println("Nhập vào mã sản phẩm");
        productCode = inputm.nextInt();
        inputm.nextLine();
        System.out.println("Nhập tên sản phẩm");
        name = inputm.nextLine();
        System.out.println("Nhập giá sản phẩm");
        price = inputm.nextDouble();
        inputm.nextLine();
        System.out.println("Nhập số lượng sản phẩm");
        quantity = inputm.nextDouble();
        System.out.println("Nhập mô tả sản phẩm");
        describe = inputm.nextLine();
        inputm.nextLine();
    }

    public Product(int productCode, String name, double price, double quantity, String describe) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "product{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", describe='" + describe + '\'' +
                '}';
    }
    public static Product menu(){
        Product newwproduct = new Product();
        newwproduct.imput();
        System.out.println(newwproduct);
        return newwproduct;
    }

    public static ArrayList<Product> productList = new ArrayList<>();

    public static void addNew(Product product){
        productList.add(product);
    }

    private static void add(List<Product> productList) {
    }
    public static void hien(){
        System.out.println(productList);
    }
    public static boolean checkma(int id){
        boolean check = false;
        for (Product p: productList){
            if (p.getProductCode() == id){
                check = true;
            }
        }
        return check;
    }
    public static void updateName(int ma, double giaMoi){
        for (Product i : productList) {
            if (i.getProductCode()== ma) {
                i.setQuantity(giaMoi);
            }
        }
    }
    public static void remove(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Mời nhập tên vật liệu cần xoá");
        String name = sc2.nextLine();

        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getName().equals(name)) {
                productList.remove(i);
            }
        }
    }
    public static void sort(){
        Comparator<Product> com = new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice()-o1.getPrice());
            }

        };
        Collections.sort(productList, com);
        System.out.println("sản phẩm được sắp xếp theo giá từ cao nhất đến thấp nhất");
        for (Product m: productList) {
            System.out.println(m);
        }
    }
    public static void max(){
        Product mostExpensiveProduct = productList.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Sản phẩm có giá đắt nhất là:");
        System.out.println(mostExpensiveProduct);
    }

    public void setCode(String part) {
    }
}
