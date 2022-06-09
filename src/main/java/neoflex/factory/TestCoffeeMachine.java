package neoflex.factory;

public class TestCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeMaker);
        coffeeMachine.Start(CoffeeType.ESPRESSO);
    }
}
