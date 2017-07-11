import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.List;

/**
 * Created by EBR3556 on 30/06/2017.
 */
public class General {

    public static void main(String[] args) {
//        testInstanceOf();
        testEquals();
    }

    public static void testEquals() {
        if(new Long(1L).equals(new Long(1L))){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }

    public static void testInstanceOf() {
        Integer i = 1;
        Number n = i;
        int[] array = new int[1];
        System.out.println("i istanceof Number ? " + (i instanceof Number));
        System.out.println("n istanceof Integer ? " + (n instanceof Integer));
        System.out.println("n istanceof Long ? " + (n instanceof Long));
        System.out.println("n istanceof Object ? " + (n instanceof Object));
        System.out.println("array istanceof Object ? " + (array instanceof Object));
        System.out.println("null istanceof Object ? " + (null instanceof Object));
//        System.out.println("A istanceof B ? " + (i instanceof Long)); //Incopatyble types: cannot cast Integer into Long
    }

    public enum A {
        A(1), B(2) {
            public int a() {
                return 1;
            }
        };

        private int points;

        A(int a) {
            points = a;
        }

        public int a() {
            return 2;
        }
    }

    public enum B {A, B, C}
}
