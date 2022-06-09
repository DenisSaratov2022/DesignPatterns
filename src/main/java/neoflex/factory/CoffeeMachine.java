package neoflex.factory;

public class CoffeeMachine {
    private CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void Start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Boiler boiler = coffeeFactory.getBoiler(coffeeType);
        coffeeMaker.cooking(boiler);
        boilerWater(boiler.boilerWater());
        addWater(boiler.addWater());
        System.out.println(coffeeType.name() + " готов.");
    }

    public void boilerWater(String message) {
        System.out.println(message);
    }

    public void addWater(String message) {
        System.out.println(message);
    }

}
