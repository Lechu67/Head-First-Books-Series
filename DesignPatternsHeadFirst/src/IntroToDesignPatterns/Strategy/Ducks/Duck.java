package IntroToDesignPatterns.Strategy.Ducks;

import IntroToDesignPatterns.Strategy.Flying.Flying;
import IntroToDesignPatterns.Strategy.Quacking.Quacking;

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

    public void setQuacking(Quacking quacking) {
        this.quacking = quacking;
    }

    public void setFlying(Flying flying) {
        this.flying = flying;
    }
}
