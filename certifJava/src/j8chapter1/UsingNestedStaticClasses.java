package j8chapter1;

import static j8chapter1.StaticNestedClasses.NestedStatic;

/**
 * Created by Esteban on 25/07/2017.
 */
public class UsingNestedStaticClasses {

    public static void main(String[] args) {
        NestedStatic nestedStatic = new NestedStatic();
        nestedStatic.hello();
        nestedStatic.helloDefault();
        nestedStatic.helloStatic();
        NestedStatic.helloStatic();
//        nestedStatic.helloPrivate(); // Wont compile since method is private
        StaticNestedClasses staticNestedClasses = new StaticNestedClasses();
        staticNestedClasses.callForPrivateMethodInStaticInnerClass();
    }
}
