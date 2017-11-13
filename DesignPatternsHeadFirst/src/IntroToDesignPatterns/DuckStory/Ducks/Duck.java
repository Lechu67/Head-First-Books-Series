package IntroToDesignPatterns.DuckStory.Ducks;

import IntroToDesignPatterns.DuckStory.Flying.Flying;
import IntroToDesignPatterns.DuckStory.Quacking.Quacking;

public abstract class Duck {

    protected Quacking quacking;
    protected Flying flying;

    public void doQuack(){
        quacking.quack();
    }
    public void doFly(){
        flying.fly();
    }
    public void swim(){
        System.out.println("All ducks can swim");
    }
    abstract void printSmth();
}
