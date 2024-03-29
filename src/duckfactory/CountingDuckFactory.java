package duckfactory;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    public Quackable createDuckCall() {

        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {

        return new QuackCounter(new RubberDuck());
    }
}