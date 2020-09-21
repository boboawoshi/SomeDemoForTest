public class Singleton4 {
    private Singleton4() {};

    private enum EnumSingleton {
        INSTANCE;
        private Singleton4 singleton4;

        private EnumSingleton() {
            singleton4 = new Singleton4();
        }

        public Singleton4 getInstance() {
            return singleton4;
        }
    }

    public static Singleton4 getInstance() {
        return EnumSingleton.INSTANCE.singleton4;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
    }
}
