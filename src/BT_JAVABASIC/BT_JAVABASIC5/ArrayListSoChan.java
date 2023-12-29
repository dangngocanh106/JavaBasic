package BT_JAVABASIC.BT_JAVABASIC5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSoChan {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i <= 50; i++) {
            if (i % 2 == 0) arrayList.add(i);
        }

        System.out.println("In ra mang so chan tu 1 den 50");
        for (int soChan : arrayList) {
            System.out.println(soChan);
        }
    }
}
