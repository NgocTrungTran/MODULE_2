package BTProduct.arraylist;

import java.util.*;

public class ProductManager {
    Scanner input = new Scanner ( System.in );
    public static ArrayList<Product> listProduct;

    public ProductManager() {
        ArrayList<Product> listProduct = new ArrayList<> ();
        this.listProduct = listProduct;
//        listProduct.add ( new Product ( 213124124, "ád", 31.2 ) );
//        listProduct.add ( new Product ( 41231232, "12", 35.2 ) );
//        listProduct.add ( new Product ( 3213123, "eqưe", 32.2 ) );
//        listProduct.add ( new Product ( 4124, "éad", 23 ) );
//        listProduct.add ( new Product ( 213123, "vxzv", 15 ) );
//        listProduct.add ( new Product ( 4124123, "gdfg", 40 ) );
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

    //    Sua Product bang Id
    public void editProductById() {
        if ( listProduct.isEmpty () ) {
            System.out.println ( "There are no products in the list!" );
        } else {
            System.out.print ( "Product id need edit: " );
            int id = input.nextInt ();
            if ( testIDList ( id ) ) {
                for (Product product : listProduct) {
                    if ( product.getId () == id ) {
                        System.out.println ( "Product have id " + id + " is: " + product );
                        char choice;
                        do {
                            System.out.println ( "Menu edit Product" );
                            System.out.println ( "1. Edit name product" );
                            System.out.println ( "2. Edit id product" );
                            System.out.println ( "3. Edit price Product" );
                            System.out.println ( "0. Exit" );
                            System.out.println ( "--------------------" );
                            Scanner sc = new Scanner ( System.in );
                            choice = sc.nextLine ().charAt ( 0 );


                            switch (choice) {
                                case '1':
                                    System.out.print ( "New name: " );
                                    String newName = sc.nextLine ();
                                    product.setName ( newName );
                                    break;
                                case '2':
                                    System.out.print ( "New Id : " );
                                    int newID = sc.nextInt ();
                                    product.setId ( newID );
                                    break;
                                case '3':
                                    System.out.print ( "New Price : " );
                                    int newPrice = sc.nextInt ();
                                    product.setPrice ( newPrice );
                                    break;
                                case '0':
                                    displayProduct ();
                                    break;
                            }
                        } while (choice != 0);
                    }
                }
            }
        }
    }

    //    Tim sp bang ten
    public void findProductByName() {
        if ( listProduct.isEmpty () ) {
            System.out.println ( "There are no product in the list" );
        } else {
            System.out.print ( "Product name need find : " );
            String name = input.nextLine ();
            if ( testNameProduct ( name ) ) {
                for (Product product : listProduct) {
                    if ( product.getName ().equals ( name ) ) {
                        System.out.println ( product );
                    }
                }
            }
            else {
                System.out.println ( "Not have!" );
            }
        }
    }

    //    Xoa sp bang id
    public void deleteProductById() {
        if ( listProduct.isEmpty () ) {
            System.out.println ( "There are no product in the list! " );
        } else {
            System.out.print ( "Product id need remove: " );
            long id = input.nextInt ();
            if ( testIDList ( id ) ) {
                for (Product product : listProduct) {
                    if ( product.getId () == id ) {
                        System.out.println ( "Are you sure you want to delete the product: " + product + "?" );
                        listProduct.remove ( product );
                        return;
                    }
                }
            } else {
                System.out.println ( "Done have!" );
            }
        }
    }

    //    Hien thi list sp
    public void displayProduct() {
        if ( listProduct.isEmpty () ) {
            System.out.println ( "There are no product in the list" );
        } else {
            int i = 1;
            for (Product product : listProduct) {
                System.out.println ( i + ": " + product.toString () );
                i++;
            }
        }
    }

    //    Sap xep tang dan theo gia
    public void sortPriceAscending() {
        List<Product> sortProductByAsc = new ArrayList<> ( listProduct );
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
        List<Product> sortProductByDesc = new ArrayList<> ( listProduct );
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

//    public void menuManager() {
//        char choice = '?';
//        while (true) {
//            System.out.println ( "++++ Menu product Manager ++++" );
//            System.out.println ( "1. Add Product " );
//            System.out.println ( "2. Edit Product with id " );
//            System.out.println ( "3. find product with name " );
//            System.out.println ( "4. Delete product with id " );
//            System.out.println ( "5. Display product list " );
//            System.out.println ( "6. Sort in ascending order of price" );
//            System.out.println ( "7. Sort in decrease order of price" );
//            System.out.println ( "0. Exit progame" );
//            System.out.println ( "------------------------" );
//            System.out.print ( "Your choice : " );
//            Scanner change = new Scanner ( System.in );
//            choice = change.nextLine ().charAt ( 0 );
//
//            switch (choice) {
//                case '1':
//                    addProduct ();
//                    break;
//                case '2':
//                    editProductById ();
//                    break;
//                case '3':
//                    findProductByName ();
//                    break;
//                case '4':
//                    deleteProductById ();
//                    break;
//                case '5':
//                    displayProduct ();
//                    break;
//                case '6':
//                    sortPriceAscending ();
//                    break;
//                case '7':
//                    sortPriceDecrease ();
//                    break;
//                case '0':
//                    System.exit ( 0 );
//                    break;
//                default:
//                    throw new IllegalStateException ( "Unexpected value: " + choice );
//            }
//        }
//    }
}

