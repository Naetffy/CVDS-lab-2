package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello");
            for (String arg : args) {
                System.out.print(" " + arg);
            }
            System.out.println("!");
        } else {
            System.out.println("Hello World!");
        }
    }
}