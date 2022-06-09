package neoflex.singleton;

import java.lang.reflect.Field;

public class Logger {
    private final static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void info(Class<?> clazz) throws IllegalAccessException {
        System.out.println(clazz.getName());
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(clazz);
            System.out.println(value);
        }
    }
}
