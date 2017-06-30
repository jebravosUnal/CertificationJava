package chapter3;

import java.util.Date;

/**
 * Created by EBR3556 on 30/06/2017.
 */
public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before memory memory: " + rt.freeMemory());

        Date d = null;
        for (int i = 0; i < 1000000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After memory free JVM memory: " + rt.freeMemory());
// 1.1
//        rt.gc();
//        System.out.println("After GC memory: " + rt.freeMemory());
// 1.2
        for (int i = 0; i < 100; i++) {
            rt.gc();
            System.out.println("After GC memory: " + rt.freeMemory());
        }
    }
}
