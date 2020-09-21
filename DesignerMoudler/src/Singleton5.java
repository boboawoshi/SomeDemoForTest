/**
 * 双重加锁饿汉模式
 */
public class Singleton5 {

    private Singleton5() {
    }

    ;
    //利用静态变量来记录唯一实例
    private volatile static Singleton5 uniqueInstance;

    public static Singleton5 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton5.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton5();
                }
            }
        }
        return uniqueInstance;
    }
}
