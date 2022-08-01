package show;

import menu.Login;

import java.util.Scanner;

public class Show {
    Scanner sc = new Scanner ( System.in );
//    MENU
    public static String menu() {
        System.out.println ("* * * * WELLCOME TO CODEGYM HUE! * * * * *");
        System.out.println ("");
        System.out.println ("* * * * * PROGRAMMING IS PASSION * * * * *");
        System.out.println ("*  1. Login                              *");
        System.out.println ("*  2. Forgot password                    *");
        System.out.println ("*  3. Exit                               *");
        System.out.println ("* * * * * * * * * * * * * * * * * * * * **");
        return "";
    }

//    LOGIN
    public static String login() {
        System.out.println ("* * * * * * * * * LOGIN * * * * * * * * *");
        System.out.println ("*  1. Administrator                     *");
        System.out.println ("*  2. Student                           *");
        System.out.println ("*  3. Back                              *");
        System.out.println ("*  4. Exit                              *");
        System.out.println ("* * * * * * * * * * * * * * * * * * * * *");
        return "";
    }

//    FORGOT PASSWORD

    public static String forgotPassword() {
        System.out.println ("* * * * * *  FORGOT PASSWORD * * * * * *");
        System.out.println ("*  1. Administrator                    *");
        System.out.println ("*  2. Student                          *");
        System.out.println ("*  3. Back                             *");
        System.out.println ("*  4. Exit                             *");
        System.out.println ("* * * * * * * * * * * * * * * * * * * **");
        return "";
    }

    //    RETURN AND BACK
    public static void returnAndBack(String choise) {
        if ( choise.equals ( "b" ) ) {
            Login.main ();
        }
        if ( choise.equals ( "e" ) ) {
            System.exit ( 0 );
        }
    }
}
