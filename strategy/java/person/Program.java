package strategy.java.person;

import strategy.java.person.strategies.eat.MeatFoodStrategy;
import strategy.java.person.strategies.eat.VeggieFoodStrategy;
import strategy.java.person.strategies.transportation.AirplaneStrategy;
import strategy.java.person.strategies.transportation.BikeStrategy;
import strategy.java.person.strategies.transportation.CarStrategy;
import strategy.java.person.strategies.transportation.WalkStrategy;
import strategy.java.person.strategies.work.DeveloperStrategy;
import strategy.java.person.strategies.work.NoWorkStrategy;
import strategy.java.person.strategies.work.PilotStrategy;

public class Program {
    public static void main(String[] args) {

        Person jhon = new Person("Jhon", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        presentYourself(jhon);

        Person ann = new Person("Anna", new MeatFoodStrategy(), new AirplaneStrategy(), new PilotStrategy());
        presentYourself(ann);

        Person carol = new Person("Carol", new VeggieFoodStrategy(), new BikeStrategy(), new DeveloperStrategy());
        presentYourself(carol);

        Person alan = new Person("Alan", new VeggieFoodStrategy(), new WalkStrategy(), new NoWorkStrategy());
        presentYourself(alan);
    }

    public static void presentYourself(Person person) {
        System.out.println("Hi, I'm " + person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("----------------");
    }
}
