package chapter6;

import java.io.Console;

/**
 * Created by EBR3556 on 11/07/2017.
 */
public class ConsoleApp {

    public static void main(String[] args) {
        Console console = System.console();
        console.printf("This is a message from the console");
        //There is no Console, so NullPointerException
    }
}


