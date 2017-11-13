package IntroToDesignPatterns.Strategy.Flying;

public class Fly implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm flying !");
    }
}
