package IntroToDesignPatterns.Strategy.Ducks;

import IntroToDesignPatterns.Strategy.Flying.DoNotFly;
import IntroToDesignPatterns.Strategy.Quacking.Shriek;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quacking = new Shriek();
        flying = new DoNotFly();
    }

    @Override
    void printSmth() {
        System.out.println("I'm a rubber duck");
    }
}
