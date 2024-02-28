package inflearn.lecture.singleton;

public class SingletonWithSynchronized {
    private static SingletonWithSynchronized INSTANCE;

    private SingletonWithSynchronized() {}

    public static synchronized SingletonWithSynchronized getInstance() {
        if (INSTANCE == null) {
            return new SingletonWithSynchronized();
        }
        return INSTANCE;
    }

}
