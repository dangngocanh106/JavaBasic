package BT_JAVABASIC.BT_JAVABASIC3;

public class MenhDeIF {
    //int a = 10;
    int number = 100;

    //Tao ham kiem tra a
    public void check(int a) {
        if (a > number) {
            System.out.println("Gia tri cua " + a + " lon hon " + number);
        } else if (a < number) {
            System.out.println("Gia tri cua " + a + " nho hon " + number);
        } else {
            System.out.println("Gia tri cua " + a + " bang " + number);
        }


    }

    public void check2(int a) {
        if (a < 10) {
            System.out.println("nho hon 10");
        } else if (a < 20) {
            System.out.println("tu 10 - 20");
        } else if (a < 30) {
            System.out.println("tu 20 - 30 ");
        } else {
            System.out.println("lon hon 30");
        }
    }

    public static void main(String[] args) {
        MenhDeIF md = new MenhDeIF();
        md.check(103);
        md.check2(35);
    }
}
