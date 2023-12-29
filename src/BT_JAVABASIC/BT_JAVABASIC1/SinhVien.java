package BT_JAVABASIC.BT_JAVABASIC1;

public class SinhVien {

    int age = 35; //Bien instance
    static String college = "Truong: Dai hoc KHTN"; //Bien static

    public void getName() {
        String name = "Ngoc Anh"; //Bien local
        System.out.println("Ho va ten: " + name);
    }

    public void getAge() {
        System.out.println("Tuoi: " + age);
    }

    public static void main(String[] args) {
        System.out.println(ThongTin.infor);//Lay thong tin tu class ThongTin
        SinhVien sv = new SinhVien();
        sv.getName();
        sv.getAge();
        System.out.println(SinhVien.college);
        System.out.println(ThongTin.code);//Lay thong tin tu class ThongTin
    }
}
