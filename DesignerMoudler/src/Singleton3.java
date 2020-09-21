/**
 * 单例模式，饿汉模式
 */
public class Singleton3 {

    private Singleton3() {
    }
    private static class Singleton3Holder{
     private static final Singleton3  INSTANCE= new Singleton3();
    }

    public static  final Singleton3 getInstance() {
        return  Singleton3Holder.INSTANCE;
    }
}
