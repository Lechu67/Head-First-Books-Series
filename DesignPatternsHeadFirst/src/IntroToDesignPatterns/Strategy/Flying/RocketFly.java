package IntroToDesignPatterns.Strategy.Flying;

public class RocketFly implements Flying {
    @Override
    public void fly() {
        System.out.println("I can fly really fast");
    }
}
