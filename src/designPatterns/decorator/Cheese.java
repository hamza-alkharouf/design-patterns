package designPatterns.decorator;

public class Cheese extends SandwichDecorator{
    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() +2;
    }

    @Override
    public String Description() {
        return super.Description()+ ", Cheese";
    }

}
