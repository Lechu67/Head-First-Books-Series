package IntroToDesignPatterns.Strategy.Quacking;

public class Shriek implements Quacking {
    @Override
    public void quack() {
        System.out.println("Shriieeeeeeeeeeeking");
    }
}
