package chapter3;

/**
 * Created by EBR3556 on 04/07/2017.
 */
public class Alien {
    String invade(short ships){ return "a few"; }
    String invade(short... ships){ return "many"; }
}
class Defender {
    public static void main(String[] args) {
        // 7 is an int and an int should be casted before to be assigned to a short variable
        System.out.println(new Alien().invade((short)7));
    }
}
