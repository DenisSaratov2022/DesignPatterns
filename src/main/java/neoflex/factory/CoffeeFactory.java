package neoflex.factory;

public class CoffeeFactory {
    public Boiler getBoiler(CoffeeType coffeeType) {
        Boiler boiler;
        switch (coffeeType) {
            case ESPRESSO:
                boiler = new Espresso();
                break;
            case AMERICANO:
                boiler = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Неверный тип кофе");
        }
        return boiler;
    }
}
