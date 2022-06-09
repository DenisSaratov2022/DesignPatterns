package neoflex.factory;

public abstract class Coffee implements Boiler {

    @Override
    public String boilerWater() {
        return "Вода начала нагреваться";
    }
}
