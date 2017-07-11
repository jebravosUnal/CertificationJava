package chapter6;

import java.io.*;

import static utils.Constants.ESTEBAN_PATH;

/**
 * Created by EBR3556 on 11/07/2017.
 */
public class Serializer {

    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Person catOwner = new Person("Esteban");
        Cat cat = new Cat("El gato Felix");
        cat.setOwner(catOwner);
        //
        serializer.serialise(cat);
        //
        Animal deserializedAnimal = (Animal) serializer.deserialize(ESTEBAN_PATH + "animal.ser");
        Cat deserializedCat = (Cat) deserializedAnimal;
        //
        System.out.println(deserializedAnimal.getName());
        System.out.println(deserializedCat.getName() + " belongs to " + deserializedCat.getOwner().getName() );
    }

    public void serialise(Object object){
        try {
            FileOutputStream fs = new FileOutputStream(ESTEBAN_PATH + "animal.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(object);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object deserialize(String serilizedFile){
        try {
            FileInputStream is = new FileInputStream(serilizedFile);
            ObjectInputStream ois = new ObjectInputStream(is);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}

class Animal implements Serializable{

    private String name;

    Animal(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Person extends Animal{

    public Person(String name) {
        super(name);
    }
}

class Cat extends  Animal{

    private Person owner;

    Cat(String name) {
        super(name);
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
