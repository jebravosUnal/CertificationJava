package j8chapter1;

/**
 * Created by Esteban on 24/07/2017.
 */
public class MemberInnerClasses {

    private int i = 5;
    public class Inner{
        private void sum(int x){
            System.out.println(i + x);
        }
    }

    public static void main(String[] args) {
        //
        MemberInnerClasses memberInnerClasses = new MemberInnerClasses();
        Inner inner = memberInnerClasses.new Inner();
        inner.sum(1);
        //
        memberInnerClasses.new Inner().sum(2);
    }

}
