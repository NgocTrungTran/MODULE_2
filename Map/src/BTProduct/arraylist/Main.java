package BTProduct.arraylist;

public class Main {
    public static void main(String[] args) {
        ProductManager menu = new ProductManager ();
        Product apple = new Product ( 156451215, "Tao", 20000.0 );
        Product strowbelly = new Product ( 168456874, "Dau Tay", 50000.0 );
        Product orange1 = new Product ( 325485954, "Cam", 10000.0 );
        Product orange2 = new Product ( 412421412, "Cam", 30000 );

        ProductManager.listProduct.add ( apple );
        ProductManager.listProduct.add ( strowbelly );
        ProductManager.listProduct.add ( orange1 );
        ProductManager.listProduct.add ( orange2 );
//        menu.addProduct ();
//        menu.displayProduct ();
//        menu.sortPriceDecrease ();
//        System.out.println ();
//        menu.deleteProductById ();
//        menu.displayProduct ();
        menu.sortPriceAscending();
//        menu.displayProduct ();
//        System.out.println ();
//        menu.findProductByName ();
//        menu.editProductById ();
//        menu.displayProduct ();

    }
}
