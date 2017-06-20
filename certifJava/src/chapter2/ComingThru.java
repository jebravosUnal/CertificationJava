package chapter2;

/**
 * Created by esteban on 20/06/17.
 */
class A{}
class B extends A{}
public class ComingThru {
    static String s = "-";

    public static void main(String[] args) {
        A[] aa = new A[2];
        B[] ba = new B[2];
        sifter(aa);
        sifter(ba);
        sifter(7);

        System.out.println(s);
    }
    // Overloaded var-args methods are chosen last. This is why sifter(A[]... aa)  and sifter(B[]... b1) are not used
    // for sifter(aa) sifter(Object o) is used since A[] can be casted to Object
    // for sifter(ba) sifter(B[] b1) is used since ba is type of B[]
    // for sifter(7)  sifter(Object o) is used since 7 can be casted to Integer and Integer istypeof Object
    static void sifter(A[]... aa) { s += "1 "; }
    static void sifter(B[]... b1) { s += "2 ";}
    static void sifter(B[] b1) { s += "3 ";}
    static void sifter(Object o) { s += "4 ";}

}
