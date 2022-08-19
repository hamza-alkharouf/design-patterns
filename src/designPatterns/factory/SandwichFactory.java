package designPatterns.factory;

public class SandwichFactory {

    public static final int CHICKEN_BURGER = 1;
    public static final int CHEESE_BURGER = 2;

    public  static Sandwich createSandwich(int sandwich){

        switch (sandwich){
            case CHICKEN_BURGER:
                return new ChickenBurger();
            case CHEESE_BURGER:
                return new CheeseBurger();
            default :
                return null;
        }

    }
}
