package IntroToDesignPatterns.Strategy.Flying;

public class DoNotFly implements Flying {
    @Override
    public void fly() {
        System.out.println("I can't fly dude ;/");
    }
}
