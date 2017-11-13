package IntroToDesignPatterns.Strategy.Ducks;

import IntroToDesignPatterns.Strategy.Flying.DoNotFly;
import IntroToDesignPatterns.Strategy.Quacking.Quack;

public class RocketDuck extends Duck{

    public RocketDuck(){
        quacking = new Quack();
        flying = new DoNotFly();
    }

    @Override
    void printSmth() {
        System.out.println("I'm a rocket duck");
    }
}
