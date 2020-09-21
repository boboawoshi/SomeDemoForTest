/**
 * 这中单例模式会面临线程安全问题
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;

    }
}
