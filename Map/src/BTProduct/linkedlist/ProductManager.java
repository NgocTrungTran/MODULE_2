package BTProduct.linkedlist;

import java.util.*;

public class ProductManager {
    private LinkedList<Product> listProduct;
    Scanner input = new Scanner ( System.in );

    private ProductManager() {
        listProduct = new LinkedList<> ();
        this.listProduct = listProduct;
    }

    //    kiểm tra xem có sản phẩm trong list không?
    public boolean testProductList(Product product) {
        if ( !listProduct.isEmpty () ) {
            for (Product products : listProduct) {
                if ( products == product ) {
                    return true;
                }
            }
        }
        return false;
    }

    //    Kiểm tra id sản phẩm
    public boolean testIDList(long id) {
        if ( !listProduct.isEmpty () ) {
            for (Product products : listProduct) {
                if ( products.getId () == id ) {
                    return true;
                }
            }
        }
        return false;
    }

    //    Kiểm tra tên sp
    public boolean testNameProduct(String name) {
        if ( !listProduct.isEmpty () ) {
            for (Product products : listProduct) {
                if ( Objects.equals ( products.getName (), name ) ) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct() {
        String name;
        long id;
        double price;

        id = System.currentTimeMillis () / 10000;
//        do {
//            System.out.print("Product id: ");
//            id = input.nextInt();
//            if (testIDList (id)) {
//                System.out.println("The ID already exists, please re-enter: ");
//            }
//        } while (testIDList(id));
//        nhap name, neu da co thi nhap lai
        do {
            System.out.print ( "Product name: " );
            name = input.nextLine ();
            if ( testNameProduct ( name ) ) {
                System.out.println ( "The name already exists, please re-enter: " );
            }
        } while (testNameProduct ( name ));

        System.out.print ( "Product price : " );
        price = Double.parseDouble ( input.nextLine () );
        Product newProduct = new Product ( id, name, price );
        listProduct.add ( newProduct );
    }
    public void setProductListWithID() throws IllegalAccessException {
        if (listProduct.isEmpty()) {
            System.out.println("There are no product in the list");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need edit");
            int id = input.nextInt();

            if(testIDList(id)) {
                for (Product product : listProduct) {
                    if (product.getId() == id) {
                        System.out.println("Product have id is " + id + ": " + product);
                        char choice;

                        do {
                            System.out.println("Menu edit Product");
                            System.out.println("1. Eidt name product");
                            System.out.println("2. Edit id product");
                            System.out.println("3. Edit price product");
                            System.out.println("0. Back to menu");
                            System.out.println("**************");
                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);

                            switch (choice) {
                                case '1' :
                                    System.out.println("New name ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2' :
                                    System.out.println("New Id ");
                                    int newID = sc.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3' :
                                    System.out.println("New Price: ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0' :
                                    displayProduct ();
                                    break;
                            }
                        } while (choice != 0);
                    }
                }
            }
        }
    }
    public void sortPriceAscending() {
        List<Product> sortProductByAsc = new LinkedList<> ( listProduct );
        Comparator<Product> priceAsc = new Comparator<Product> () {

            @Override
            public int compare(Product o1, Product o2) {
                int result = (int) (o1.getPrice () - o2.getPrice ());
                return Integer.compare ( result, 0 );
            }
        };
        sortProductByAsc.sort ( priceAsc );
        for (Product product : sortProductByAsc) {
            System.out.println ( product );
        }
    }

    //    Sap xep giam dan theo gia
    public void sortPriceDecrease() {
        List<Product> sortProductByDesc = new LinkedList<> ( listProduct );
        Comparator<Product> priceDesc = new Comparator<Product> () {
            @Override
            public int compare(Product o1, Product o2) {
                int result = (int) (o2.getPrice () - o1.getPrice ());
                return Integer.compare ( result, 0 );
            }
        };
        sortProductByDesc.sort ( priceDesc );
        for (Product product : sortProductByDesc) {
            System.out.println ( product );
        }
    }

    public void displayProduct() {
        if (listProduct.isEmpty()) {
            System.out.println("There are no  product in the list ");
        } else {
            // số thứ tự
            int i = 1;
            for (Product product : listProduct) {
                System.out.println(i + ": "  + product.toString());
                i++;
            }
        }
    }

    public void removeProductWithID() {
        if (listProduct.isEmpty()) {
            System.out.println("There are no product in the list ");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need remove ");
            int id = input.nextInt();
            if (testIDList (id)) {
                for (Product product : listProduct) {
                    if (product.getId() == id) {
                        System.out.println("product remove is :" + product.toString());
                        listProduct.remove(product);
                    }
                }
            }
            else {
                System.out.println("id have not in product list");
            }
        }
    }

    public void findProductWithName() {
//        String result = "";
        if (listProduct.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product need find: ");
            String name = sc.nextLine();
            if (testNameProduct (name)) {
                for (Product product : listProduct) {
                    if (product.equals(name)) {
                        System.out.println(product.getName());
                    }
                }
            }
        }
//        return result;
    }
}
