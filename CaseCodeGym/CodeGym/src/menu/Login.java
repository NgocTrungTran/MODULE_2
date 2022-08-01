package menu;

import show.Show;

import javax.print.DocFlavor;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main() {
        Scanner sc = new Scanner ( System.in );
        Show show = new Show ();
        System.out.println ( Show.login () );
        int choice;
        do {
            System.out.print ( "Your choice: " );
            choice = sc.nextInt ();
            if ( choice == 1 ) {
                manager ();
            } else if ( choice == 2 ) {
                administrator ();
            } else if ( choice == 3 ) {
                student ();
            } else if ( choice == 4 ) {
                Menu.main ();
            } else if ( choice == 5 ) {
                System.exit ( 0 );
            } else {
                System.out.println ( "!!!!!! YOUR CHOISE INVALID !!!!!!" );
            }
        } while (choice < 1 || choice > 5);
    }
// Login by manager
    public static void manager() {
        Scanner sc = new Scanner ( System.in );
        String userName;
        String password;
//        Enter username
        System.out.println ( "____________Login by manager_________" );
        System.out.println ("");
        System.out.println ("Enter 'b' to BACK    ||    Enter 'e' to EXIT");
        System.out.println ("............................................");
        System.out.print ( "Your username: " );
        userName = sc.nextLine ();
        Show.returnAndBack ( userName );
//        Enter password
        System.out.print ( "Your password: " );
        password = sc.nextLine ();
        Show.returnAndBack ( userName );

    }

// Login by administrator
    public static void administrator() {
        Scanner sc = new Scanner ( System.in );
        String userName;
        String password;
//        Enter username
        System.out.println ( "____________Login by administrator_________" );
        System.out.println ("");
        System.out.println ("Enter 'b' to BACK    ||    Enter 'e' to EXIT");
        System.out.println ("............................................");
        System.out.print ( "Your username: " );
        userName = sc.nextLine ();
        Show.returnAndBack ( userName );
//        Enter password
        System.out.print ( "Your password: " );
        password = sc.nextLine ();
        Show.returnAndBack ( userName );
    }

    // Login by student
    public static void student() {
        Scanner sc = new Scanner ( System.in );
        String userName;
        String password;
//        Enter username
        System.out.println ( "____________Login by student_________" );
        System.out.println ("");
        System.out.println ("Enter 'b' to BACK    ||    Enter 'e' to EXIT");
        System.out.println ("............................................");
        System.out.print ( "Your username: " );
        userName = sc.nextLine ();
        Show.returnAndBack ( userName );
//        Enter password
        System.out.print ( "Your password: " );
        password = sc.nextLine ();
        Show.returnAndBack ( userName );
    }

}
