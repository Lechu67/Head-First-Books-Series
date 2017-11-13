package IntroToDesignPatterns.DuckStory.Ducks;

import IntroToDesignPatterns.DuckStory.Flying.Fly;
import IntroToDesignPatterns.DuckStory.Quacking.Quack;

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
