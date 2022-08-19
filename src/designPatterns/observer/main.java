package designPatterns.observer;

public class main {

    public static void main(String[] args) {
        Student ahmad = new Student("Ahmad");
        Student sami = new Student("Sami");
        Student rami = new Student("Rami");

        Course java = new Course("Java Course");

        java.subscribe(ahmad);
        java.subscribe(sami);
        java.subscribe(rami);
        java.setAvailability(true);

    }
}
