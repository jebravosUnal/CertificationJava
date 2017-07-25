package j8chapter1;

/**
 * Created by Esteban on 25/07/2017.
 */
public class StaticNestedClasses {
    private String smiley = ":P";
    private static String smiley2 = ":P";

    public static class NestedStatic{
        public void hello(){
            System.out.println("Hello from nested class " + smiley2);
//            System.out.println("Hello from nested class " + smiley); // Wont compile since smiley is not static
        }

        public static void helloStatic(){
            System.out.println("Hello from nested class static method " + smiley2);
//            System.out.println("Hello from nested class static method" + smiley); // Wont compile since smiley is not static
        }

        void helloDefault(){
            System.out.println("Hello from nested class no access modifier " + smiley2);
//            System.out.println("Hello from nested class no acces modifier" + smiley); // Wont compile since smiley is not static
        }

        private void helloPrivate(){
//            System.out.println("Hello from nested class private" + smiley); // Wont compile since smiley is not static
            System.out.println("Hello from nested class private " + smiley2);
        }
    }

    public void callForPrivateMethodInStaticInnerClass(){
        NestedStatic nestedStatic = new NestedStatic();
        nestedStatic.helloPrivate();
    }
}
