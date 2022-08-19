package designPatterns.decorator;

public class BasicSandwich implements Sandwich{

    @Override
    public double getCost() {
        return 10;
    }
    @Override
    public String Description() {
        return "Bread";
    }

}
