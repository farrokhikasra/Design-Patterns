import singleton.Singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Hello");
        Singleton singleton = Singleton.getInstance();
        Method tryToCallMe = Pourch.class.getDeclaredMethod("tryToCallMe", int.class);
        tryToCallMe.setAccessible(true);
        Pourch p = new Pourch();
        tryToCallMe.invoke(p,8);
    }
}
