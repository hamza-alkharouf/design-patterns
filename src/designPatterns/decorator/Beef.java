package designPatterns.decorator;

public class Beef extends SandwichDecorator{
    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String Description() {
        return super.Description() + ", Beef";
    }
}
