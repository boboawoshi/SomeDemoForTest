/**
 * 加锁的单例模式，懒汉模式
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null) {
            return new Singleton1();
        }
        return singleton1;

    }
}
