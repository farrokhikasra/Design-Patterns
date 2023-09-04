package creational.singleton;

public class Singleton {
    private int a = 10;
    private static Singleton lazySingleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new Singleton();
        return lazySingleton;
    }
}
