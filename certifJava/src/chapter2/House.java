package chapter2;

/**
 * Created by esteban on 20/06/17.
 */
class Building{
    Building(){ System.out.print("B "); }

    Building(String name){
        this();
        System.out.print("bn " + name);
    }
}

public class House extends Building {
    House(){
        // a super() call is added by the compiler
        System.out.print("h ");
    }
    House(String name){
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        new House("x ");
    }
}
