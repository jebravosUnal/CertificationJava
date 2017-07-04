import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * Created by EBR3556 on 30/06/2017.
 */
public class General {

    public static void main(String[] args) {
//        int[][] a = {{1, 2,}, {2, 3}};
//
//        System.out.println(a[0][0]);
//        System.out.println(a[0][1]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//        Object o = a;
//        int[][] t = (int[][]) o;
//        System.out.println(t[0][0]);
//        System.out.println(t[0][1]);
//        System.out.println(t[1][0]);
//        System.out.println(t[1][1]);
//        System.out.println(A.A.points);
        System.out.println("A values:");
        System.out.println(A.values());

        System.out.println("B values:");
        System.out.println(B.values());

        LocalDate.of(2015, Month.APRIL, 12);

    }

    public enum A {
        A(1), B(2) {
            public int a() {
                return 1;
            }
        };

    private int points;

    A(int a){
        points = a;

    }
        public int a() {
            return 2;
        }
    }

    public enum B {A,B,C}
}
