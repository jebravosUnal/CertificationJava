package chapter6;

import java.io.*;

import static utils.Constants.ESTEBAN_PATH;

class SuperNotSerial {
    public static void main(String[] args) {
        Dog d = new Dog(35, "Fido");
        System.out.println("before: " + d.name + " "
                + d.weight);
        try {
            FileOutputStream fs = new FileOutputStream(ESTEBAN_PATH + "testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(ESTEBAN_PATH +"testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Dog) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after:  " + d.name + " "
                + d.weight);
    }
}

class Dog extends Animal2 implements Serializable {
    String name;

    Dog(int w, String n) {
        weight = w;          // inherited
        name = n;            // not inherited
    }
}

class Animal2 {           // not serializable !
    int weight = 42;
}
