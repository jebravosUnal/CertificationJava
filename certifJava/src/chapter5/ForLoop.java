package chapter5;

/**
 * Created by EBR3556 on 05/07/2017.
 */
public class ForLoop {

    public static void main(String[] args) {
        for(int i = 0, j = i; i<10;  System.out.println(i), i++, System.out.println(method())){
            System.out.println("inside the loop");
        }
    }

    public static String method(){
        return "inside method";
    }
}
