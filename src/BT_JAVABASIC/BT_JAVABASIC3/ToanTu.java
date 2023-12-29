package BT_JAVABASIC.BT_JAVABASIC3;

public class ToanTu {
    int a = 13;
    int b = 9;

    //Kiem tra toan tu &&
    public void toanTu_1() {
        String s1 = ((a % 2 == 0) && (b % 3 == 0) ? "Tich cua a va b chia het cho 6" : "Tich cua a va b KHONG chia het cho 6");
        System.out.println(s1);
    }

    //Kiem tra toan tu ||
    public void toanTu_2() {
        String s1 = ((a % 2 == 0) || (b % 2 == 0) ? "Tich cua a va b chia het cho 2" : "Tich cua a va b KHONG chia het cho 2");
        System.out.println(s1);
    }

    //Kiem tra toan tu khac
    public void toanTu_3() {
        String s1 = ((a % 3 != 0) ? "a KHONG chia het cho 3" : "a chia het cho 3");
        System.out.println(s1);
    }

    public static void main(String[] args) {
        ToanTu tt = new ToanTu();
        System.out.println("Cho a = " + tt.a + " va b = " + tt.b);
        tt.toanTu_1();
        tt.toanTu_2();
        tt.toanTu_3();
    }

}
