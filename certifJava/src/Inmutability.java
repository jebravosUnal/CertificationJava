/**
 * Created by EBR3556 on 10/07/2017.
 */
public class Inmutability {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = i1;

        if(i1.equals(i2)){
            System.out.println("1. i1 i2 equals " + i1 + " " + i2);
        } else {
            System.out.println("1. i1 i2 not equals " + i1 + " " + i2);
        }

        i2++;

        if(i1.equals(i2)){
            System.out.println("2. i1 i2 equal s" + i1 + " " + i2);
        } else {
            System.out.println("2. i1 i2 not equals " + i1 + " " + i2);
        }


        String s1 = "Hola";
        String s2 = s1;

        if(s1.equals(s2)){
            System.out.println("3. s1 s2 equals " + s1 + " " + s2);
        } else {
            System.out.println("3. s1 s2 not equals " + s1 + " " + s2);
        }

        s2 +=" mundo";

        if(s1.equals(s2)){
            System.out.println("4. s1 s2 equals " + s1 + " " + s2);
        } else {
            System.out.println("4. s1 s2 not equals " + s1 + " " + s2);
        }
    }
}
