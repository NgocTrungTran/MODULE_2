import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Product {

    private long productId;
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Product(long productId, String productName, int productQuantity, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                '}';
    }
}

public class ProductManager {


    private static final Scanner SCANNER = new Scanner(System.in);
    private final ArrayList<Product> PRODUCTS = new ArrayList<>();


    public ProductManager() {
        PRODUCTS.add(new Product(30200, "iPhone 14 Pro Max", 1400, 10));
        PRODUCTS.add(new Product(30201, "iPhone SE 2022", 600, 20));
        PRODUCTS.add(new Product(30202, "Samsung Galaxy A72", 400, 17));
        PRODUCTS.add(new Product(30203, "iPad Air 2022", 1220, 11));
        PRODUCTS.add(new Product(30204, "Xiaomi Redmi K50", 212, 30));
        PRODUCTS.add(new Product(30205, "Realme GT Neo 2T 5G", 310, 6));
        PRODUCTS.add(new Product(30206, "Samsung Galaxy Tab S7 FE 4G", 190, 10));
        PRODUCTS.add(new Product(30207, "Samsung Galaxy S22 Ultra", 2000, 18));
        PRODUCTS.add(new Product(30208, "Samsung Galaxy S21 Plus 5G", 2021, 17));
        PRODUCTS.add(new Product(30309, "iPhone 13 Pro Max", 1600, 14));
    }

    public void renderProduct() {
        System.out.printf("\n\t%-16s %-36s %-26s %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
        for (Product product : PRODUCTS)
            System.out.printf("\t%-16s %-36s %-26s $%.2f\n", product.getProductId(), product.getProductName(), product.getProductQuantity(), product.getProductPrice());
        System.out.println();
    }

    public void addProduct() {
        renderProduct();

        System.out.print("■ Type a product name: ");
        String productName = SCANNER.nextLine();

        System.out.print("■ Type a product quantity: ");
        int productQuantity = Integer.parseInt(SCANNER.nextLine());

        System.out.print("■ Type a product price: ");
        double productPrice = Double.parseDouble(SCANNER.nextLine());

        PRODUCTS.add(0, new Product((System.currentTimeMillis() % 100000), productName, productQuantity, productPrice));

        renderProduct();
        System.out.println("\n■ Product added successfully!");
    }

    public void editProduct() {
        renderProduct();

        System.out.print("■ Type a product id to edit: ");
        int productId = Integer.parseInt(SCANNER.nextLine());

        for (Product product : PRODUCTS) {
            if (productId == product.getProductId()) {
                System.out.print("■ Product: " + product + "\n■ Type a new product name: ");
                String newProductName = SCANNER.nextLine();

                System.out.print("■ Type a new product quantity: ");
                int newProductQuantity = Integer.parseInt(SCANNER.nextLine());

                System.out.print("■ Type a new product price: ");
                double newProductPrice = Double.parseDouble(SCANNER.nextLine());

                product.setProductName(newProductName);
                product.setProductQuantity(newProductQuantity);
                product.setProductPrice(newProductPrice);
            }
        }

        renderProduct();
        System.out.println("\n■ Product edited successfully!");
    }

    public void removeProduct() {
        renderProduct();

        System.out.print("■ Type a product id to remove: ");
        int productId = Integer.parseInt(SCANNER.nextLine());

        PRODUCTS.removeIf(product -> productId == product.getProductId());

        renderProduct();
        System.out.println("\n■ Product removed successfully!");
    }

    public void searchProductByName() {
        renderProduct();

        System.out.print("■ Type a product name to search: ");
        String productName = SCANNER.nextLine().toLowerCase();
        int flag = 0;

        for (Product product : PRODUCTS) {
            if (product.getProductName().toLowerCase().contains(productName)) {
                System.out.printf("\t%-16s %-36s %-26s $%.2f\n", product.getProductId(), product.getProductName(), product.getProductQuantity(), product.getProductPrice());
                flag++;
            }
        }

        if (flag == 0) System.out.println("■ Product not found!");
    }

    public void sortByPriceASC() {
        ArrayList<Product> products = new ArrayList<>(PRODUCTS);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getProductPrice() - o2.getProductPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        });
        renderProduct(products);
    }

    public void sortByPriceDESC() {
        ArrayList<Product> products = new ArrayList<>(PRODUCTS);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o2.getProductPrice() - o1.getProductPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        });
        renderProduct(products);
    }

    public void renderProduct(List<Product> products) {
        System.out.printf("\n\t%-16s %-36s %-26s %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
        for (Product product : products)
            System.out.printf("\t%-16s %-36s %-26s $%.2f\n", product.getProductId(), product.getProductName(), product.getProductQuantity(), product.getProductPrice());
        System.out.println();
    }


    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.print("╔══════════════════════════════════════════════════════════════════════════════════════════════════╗" +
                    "\n║                                                                                                  ║" +
                    "\n║                              PRODUCT MANAGEMENT - v1.0 (Dev Builds)                              ║" +
                    "\n║                                          [Main Menu]                                             ║" +
                    "\n║                                                                                                  ║" +
                    "\n║           ■  [1] Product List - Shows all current product from the Product List.                 ║" +
                    "\n║           ■  [2] Product Add - Adding a new product to the Product List.                         ║" +
                    "\n║           ■  [3] Product Edit - Editing a product from Product List.                             ║" +
                    "\n║           ■  [4] Product Remove - Removing a product from Product List.                          ║" +
                    "\n║           ■  [5] Product Search - Searching a product from Product List.                         ║" +
                    "\n║           ■  [6] Product Sort (Ascending Price) - Sorting product by ascending price.            ║" +
                    "\n║           ■  [7] Product Sort (Descending Price) - Sorting product by descending price.          ║" +
                    "\n║           ■  [8] Exit the application.                                                           ║" +
                    "\n║                                                                                                  ║" +
                    "\n╚══════════════════════════════════════════════════════════════════════════════════════════════════╝" +
                    "\n■ Type a number above by your choice: ");
            String choice = SCANNER.nextLine();

            switch (choice) {
                case "1":
                    productManager.renderProduct();
                    break;

                case "2":
                    productManager.addProduct();
                    break;

                case "3":
                    productManager.editProduct();
                    break;

                case "4":
                    productManager.removeProduct();
                    break;

                case "5":
                    productManager.searchProductByName();
                    break;

                case "6":
                    //lamba express
                    productManager.sortByPriceASC();
                 //   productManager.renderProduct();
                    break;

                case "7":
//                    PRODUCTS.sort(Comparator.comparing(Product::getProductPrice).reversed());
//                    renderProduct();
//                    break;

                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(0);

                default:
                    System.out.println("■ Invalid selected number, please try again!");
            }
        }
    }

}