package designPatterns.state;

public class main {
    public static void main(String[] args) {
        MobileContext context = new MobileContext();
        context.alert();
        context.setState(new Silent());
        context.alert();
    }
}
