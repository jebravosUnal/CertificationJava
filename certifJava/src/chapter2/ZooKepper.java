package chapter2;

/**
 * Created by esteban on 20/06/17.
 */
class Mammal {
    String name = "furry ";
    String makeNoise(){ return "Generic noise "; }

}
class Zebra extends Mammal {
    String name = "Stripes ";
    String makeNoise(){ return "bray"; }
}

public class ZooKepper {
    public static void main(String[] args) {
        new ZooKepper().go();
    }

    void go(){
//        Zebra m = new Zebra();
        Mammal m = new Zebra();
//        Mammal m = new Mammal();
        //Polymorphism is only for instance variables
        //m.name from Mammal, since m references a Mammal Object
        //m.makeNoise from Zebra, since the compiler knows that m references a Zebra object even if the m Object is of type Mammal
        System.out.print(m.name + " " + m.makeNoise());
    }

}
