public class Studiens {
    int id;
    String name;
    int age;

    String classes;

    Studiens() {

    }
    Studiens(int i, String n) {
        id = i;
        name = n;
    }

    Studiens(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    Studiens(int i, String n, int a, String c){
        id = i;
        name = n;
        age = a;
        classes = c;
    }

    void display() {
        System.out.printf ("Id: %d, Name: %s, Age: %d, Class: %s\n", id, name, age, classes);
    }

    public static void main(String[] args) {
        Studiens student1 = new Studiens (  );
        Studiens student2 = new Studiens ( 3154, "Nguyen Van A" );
        Studiens student3 = new Studiens ( 2151, "Pham Thi B", 23 );
        Studiens student4 = new Studiens ( 3524, "Tran Ngoc D", 26, "C0322G1");
        student1.display ();
        student2.display ();
        student3.display ();
        student4.display ();
    }
}

