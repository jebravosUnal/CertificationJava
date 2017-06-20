package chapter2;

import java.applet.Applet;

/**
 * Exercise 11
 * Created by esteban on 20/06/17.
 */

class Alpha{
    static String s = "";
    protected Alpha(){ s += "alpha "; }
}

class SubAlpha extends Alpha{
    private SubAlpha(){ s += "sub ";}
}

public class SubSubAlpha extends Alpha{
    //s comes from Alpha
    private SubSubAlpha(){ s += "subsub " ;}

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}
