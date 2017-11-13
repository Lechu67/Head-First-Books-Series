package IntroToDesignPatterns.DuckStory.Ducks;

import IntroToDesignPatterns.DuckStory.Flying.DoNotFly;
import IntroToDesignPatterns.DuckStory.Quacking.Quack;

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
