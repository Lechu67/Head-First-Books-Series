package IntroToDesignPatterns.DuckStory.Ducks;

import IntroToDesignPatterns.DuckStory.Flying.DoNotFly;
import IntroToDesignPatterns.DuckStory.Quacking.Shriek;

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
