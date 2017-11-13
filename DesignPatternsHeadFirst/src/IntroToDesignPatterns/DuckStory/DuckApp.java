package IntroToDesignPatterns.DuckStory;

import IntroToDesignPatterns.DuckStory.Ducks.Duck;
import IntroToDesignPatterns.DuckStory.Ducks.RubberDuck;
import IntroToDesignPatterns.DuckStory.Ducks.WildDuck;

public class DuckApp {

    public static void main(String[] args) {
        Duck duck1 = new RubberDuck();
        duck1.doQuack();
        duck1.doFly();
        duck1.swim();
        Duck duck2 = new WildDuck();
        duck2.doQuack();
        duck2.doFly();
        duck2.swim();
    }
}
