package j8chapter1;

/**
 * Created by Esteban on 24/07/2017.
 */
public class LocalInnerClasses {

    private int i = 5;

    public void sum(){
        class Calculator{
            int x;
            Calculator(int x){
                this.x = x;
            }
            void sum(){
                System.out.println(i + x);
            }
        }

        Calculator c = new Calculator(10);
        c.sum();
    }

    public static void main(String[] args) {
        LocalInnerClasses localInnerClasses = new LocalInnerClasses();
        localInnerClasses.sum();
    }

//    C:\Program Files\Java\jdk1.8.0_131
}
