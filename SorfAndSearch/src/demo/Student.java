package demo;

public class Student implements Comparable<Student> {
    private String ten;
    private int tuoi;
    private String lop;
    private double diemTB;

    public Student(String ten, int tuoi, String lop, double diemTB) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "(Student: " +
                "ten: " + ten +
                ", tuoi: " + tuoi +
                ", lop: " + lop +
                ", diemTB: " + diemTB +
                ')';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getTuoi () - o.getTuoi ();
        if ( result == 0 ) {
            return this.getTen ().compareTo ( o.getTen () );/* sắp xếp theo tuổi*/
        }
        return result;
//        return this.getTen ().compareTo ( o.getTen () );/* sắp xếp theo tên*/
//        return this.getTuoi () - o.getTuoi ();/* sắp xếp theo tuổi*/
//        return this.getDiemTB () - o.getDiemTB () == 0 ? 0 : (this.getDiemTB () - o.getDiemTB ()) < 0 ? -1 : 1;/* sắp xếp theo điểm*/
    }
}
