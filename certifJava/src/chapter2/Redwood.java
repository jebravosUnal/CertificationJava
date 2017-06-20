package chapter2;

/**
 * Created by esteban on 20/06/17.
 */
public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go(){
     go2(new Tree(), new Redwood());
//     Tree t = new Tree();
//     Redwood r = (Redwood) t;
//     go2(r, new Redwood());
//     go2((Redwood) new Tree(), new Redwood());
    }
    void go2(Tree t1, Redwood r1){
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tree {}
