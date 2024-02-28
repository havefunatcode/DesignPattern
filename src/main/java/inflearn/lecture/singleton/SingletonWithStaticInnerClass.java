package inflearn.lecture.singleton;

public class SingletonWithStaticInnerClass {
    private SingletonWithStaticInnerClass() {}

    private static class SingletonWithStaticInnerClassBinder {
        private static final SingletonWithStaticInnerClass INSTANCE = new SingletonWithStaticInnerClass();
    }

    public static SingletonWithStaticInnerClass getInstance() {
        return SingletonWithStaticInnerClassBinder.INSTANCE;
    }

}
