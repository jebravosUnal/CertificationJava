package chapter6;

import java.io.*;

import static utils.Constants.ESTEBAN_PATH;

/**
 * Created by EBR3556 on 11/07/2017.
 */
public class Serializer {

    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Animal animal = new Animal("El gato Felix");
        //
        serializer.serialise(animal);
        //
        Animal deserializedAnimal = (Animal) serializer.deserialize(ESTEBAN_PATH + "animal.ser");
        //
        System.out.println(deserializedAnimal.getName());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
