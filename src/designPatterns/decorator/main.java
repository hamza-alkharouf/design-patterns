package designPatterns.decorator;

public class main {
    public static void main(String[] args) {
        Sandwich mySandwich = new Cheese(new Beef(new BasicSandwich()));
        System.out.println("Description = " + mySandwich.Description());
        System.out.println("Cost = " + mySandwich.getCost());
    }

}
