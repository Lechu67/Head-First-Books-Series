package IntroToDesignPatterns.Strategy.Quacking;

public class Quack implements Quacking{

    @Override
    public void quack() {
        System.out.println("Kwa! Kwa!");
    }
}
