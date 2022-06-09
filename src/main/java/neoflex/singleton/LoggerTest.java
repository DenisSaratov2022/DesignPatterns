package neoflex.singleton;

public class LoggerTest {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Ivan", 20, 1.8);
        Logger logger = Logger.getInstance();
        logger.info(person.getClass());

    }
}
