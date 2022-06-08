package demo;

import java.util.*;

public class MenuAChom {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<> ();
        menu.put ( "Banh ep trung", 2000.0 );
        menu.put ( "Banh ep thit", 2000.0 );
        menu.put ( "Banh ep", 1500.0 );
        menu.put ( "Banh ep ep", 3000.0 );
        menu.put ( "Banh ep ep ep", 4500.0 );
        menu.put ( "Bun mam", 15000.0 );
        menu.put ( "Bun hamster", 20000.0 );

        Set<String> nameAChom = menu.keySet ();
        for (String nameMonAn : nameAChom) {
            System.out.printf ("Món %s: %s VND\n", nameMonAn, menu.get ( nameMonAn ));
        }
        System.out.println ();

        Map<String, Double> menuAChom = new TreeMap<> (menu);
        Set<String> priAChom = menuAChom.keySet ();
        for (String priMonAn : priAChom) {
            System.out.printf ("Món %s: %s VND\n", priMonAn, menu.get ( priMonAn ));
        }
        System.out.println ();

        Map<String, Double> banhEp = new LinkedHashMap<> (menu);
        System.out.println (banhEp);
        System.out.println ("Giá của " + "Bún hamster" + " là: " + banhEp.get ( "Bun hamster" ));
    }
}
