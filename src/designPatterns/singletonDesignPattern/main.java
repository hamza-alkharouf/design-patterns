package designPatterns.singletonDesignPattern;

public class main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.printer();
        singleton2.printer();
    }



}
