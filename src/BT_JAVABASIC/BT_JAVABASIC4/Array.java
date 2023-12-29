package BT_JAVABASIC.BT_JAVABASIC4;

public class Array {
    int i = 0;
    int a[] = new int[26];

    public void soChan() {
        //in theo mảng
        System.out.println("In danh sach so chan theo mang");
        for (i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                a[i / 2] = i;
                System.out.println("a[" + i / 2 + "]=" + a[i / 2]);
            }
        }
    }

    public static void main(String[] args) {
        Array mang = new Array();
        mang.soChan();
    }

}
