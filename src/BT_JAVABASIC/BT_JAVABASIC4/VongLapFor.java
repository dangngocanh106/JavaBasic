package BT_JAVABASIC.BT_JAVABASIC4;

public class VongLapFor {

    public void soChan() {
        for ( int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        VongLapFor sc = new VongLapFor();
        sc.soChan();
    }

}
