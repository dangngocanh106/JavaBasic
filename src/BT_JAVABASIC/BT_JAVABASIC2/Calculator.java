package BT_JAVABASIC.BT_JAVABASIC2;

public class Calculator {

    public static int add(int a, int b) {
        return (a + b);
    }

    public static float multi(float x, float y) {
        return (x * y);
    }

    public static void main(String[] args) {
       //Goi ham tinh tong hai so nguyen
        int a = 3;
        int b = 5;
        int sum = add(a, b);
        System.out.println("Tong cua so nguyen " + a + " va " + b + " la: " + sum);
        //Goi ham tinh tich hai so thuc
        float m = multi(1.5f, 2.5f);
        System.out.println("Tich cua hai so la:  " + m);
    }
}
