package menu;

import show.Show;

import java.util.Scanner;

public class Menu {
    public static void main() {
        Show show = new Show ();
        Scanner sc = new Scanner ( System.in );
        int choice;

        System.out.println ( show.menu () );
        System.out.print ( "Your choice: " );
        choice = sc.nextInt ();
        switch (choice) {
            case 1:
                Login.main ();
                break;
            case 2:
                ForgotPassword.main ();
                break;
            case 3:
                System.exit ( 0 );
        }
    }
}
