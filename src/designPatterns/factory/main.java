package designPatterns.factory;

public class main {
    public static void main(String[] args) {
        Sandwich sandwich= SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
        sandwich.prepare();
    }
}
