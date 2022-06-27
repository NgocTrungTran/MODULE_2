package demo;


public class SelectionSorf {
    public void sort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++)
        {
            int index_min = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].compareTo(students[index_min]) < 0)
                    index_min = j;
            }
            Student temp = students[index_min];
            students[index_min] = students[i];
            students[i] = temp;
        }
        for (Student student: students) {
            System.out.println (student);
        }
    }


    public static void main(String[] args) {
        Student[] students;
        Student std1 = new Student ( "Nghé", 26, "C0322G1", 7.3 );
        Student std2 = new Student ( "Bò", 25, "C0322G1", 8.1 );
        Student std3 = new Student ( "Chôm", 27, "C0322G1", 8.2 );
        Student std4 = new Student ( "Hến", 29, "C0322G1", 8.6 );
        Student std5 = new Student ( "Bọ", 26, "C0322G1", 7.2 );
        Student std6 = new Student ( "Bo", 26, "C0322G1", 7.2 );
        students = new Student[]{std1, std2, std3, std4,std5,std6};
        for (Student student: students) {
            System.out.println (student);
        }
        System.out.println ();
        SelectionSorf selectionSorf = new SelectionSorf ();
        selectionSorf.sort ( students );

    }
}
