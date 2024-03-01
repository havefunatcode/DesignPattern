package inflearn.lecture.creatinoal_patterns.singleton;

public class SingletonWithPrivateConstructor {
    private static SingletonWithPrivateConstructor INSTANCE;

    public static SingletonWithPrivateConstructor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonWithPrivateConstructor();
        }
        return INSTANCE;
    }

    private SingletonWithPrivateConstructor() {

    }

}
