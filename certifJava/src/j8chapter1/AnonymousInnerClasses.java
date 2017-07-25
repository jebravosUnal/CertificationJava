package j8chapter1;

/**
 * Created by Esteban on 24/07/2017.
 */
public class AnonymousInnerClasses {
    abstract class Calculator{
        abstract int sum(int x);
    }
    private int i = 5;

    private void sum(){
        Calculator c = new Calculator() {
            @Override
            int sum(int x) {
                return i + x;
            }
        };
        System.out.println(c.sum(6));
    }

    public static void main(String[] args) {
        AnonymousInnerClasses anonymousInnerClasses = new AnonymousInnerClasses();
        anonymousInnerClasses.sum();
    }

}
