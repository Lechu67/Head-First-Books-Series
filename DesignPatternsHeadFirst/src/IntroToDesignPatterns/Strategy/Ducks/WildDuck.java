package IntroToDesignPatterns.Strategy.Ducks;

import IntroToDesignPatterns.Strategy.Flying.Fly;
import IntroToDesignPatterns.Strategy.Quacking.Quack;

public class WildDuck extends Duck {

    public WildDuck(){
        quacking = new Quack();
        flying = new Fly();
    }

    @Override
    void printSmth() {
        System.out.println("I'm a wild duck");
    }
}
