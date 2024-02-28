package inflearn.lecture.singleton;

public class SingletonWithDoubleCheckedLocking {
    private static volatile SingletonWithDoubleCheckedLocking INSTANCE;

    private SingletonWithDoubleCheckedLocking() {}

    public static SingletonWithDoubleCheckedLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonWithDoubleCheckedLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonWithDoubleCheckedLocking();
                }
            }
        }
        return new SingletonWithDoubleCheckedLocking();
    }

}
