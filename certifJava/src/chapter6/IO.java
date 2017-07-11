package chapter6;

import java.io.File;

import static utils.Constants.*;

/**
 * Created by EBR3556 on 11/07/2017.
 */

public class IO {
    private static StringBuilder identation = new StringBuilder("");

    public static void main(String[] args) {
        File directory = new File(ESTEBAN_PATH + "Livres");
//        File directory = new File(ESTEBAN_PATH + "chapter6");
        boolean mkdir = directory.mkdir();
        System.out.println("exists " + directory.exists());
        System.out.println("is directory " + directory.isDirectory());
        System.out.println("to path " + directory.toPath());
        System.out.println("to uri " + directory.toURI());
        System.out.println("------------------ Files in " + directory.toPath() + " ------------------");
        for (String fileName : directory.list()){
            System.out.println(fileName);
        }
        System.out.println("------------------ Doing something with files in " + directory.toPath() + " ------------------");
        doSomethingWithDirectoryFiles(directory);
    }

    private static void doSomethingWithDirectoryFiles(File directory) {
        identation.append(".");
        for(File inDirectory : directory.listFiles()){
            System.out.println(identation + inDirectory.getName());
            if(inDirectory.isDirectory()){
                doSomethingWithDirectoryFiles(inDirectory);
            } else {
                doSomethingWithFile(inDirectory);
            }

        }
        identation.deleteCharAt(identation.length()-1);
    }

    private static void doSomethingWithFile(File f){
        System.out.println(identation + f.getName());
    }
}
