package chapter5;

/**
 * Created by EBR3556 on 05/07/2017.
 */
public class Excercise5_2 {

    public static void main(String[] args) {

        int age = 0;
        outer:
        while (age <= 21) {
            age++;
            if(age == 16){
                System.out.println("get your driver's license");
                continue outer;
            } else {
                System.out.println("Another year");
            }
        }
    }
}
