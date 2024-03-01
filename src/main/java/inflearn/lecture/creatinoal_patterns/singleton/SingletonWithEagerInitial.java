package inflearn.lecture.creatinoal_patterns.singleton;

public class SingletonWithEagerInitial {
    private static final SingletonWithEagerInitial INSTANCE = new SingletonWithEagerInitial();

    private SingletonWithEagerInitial() { }

    private static SingletonWithEagerInitial getInstance() {
        return INSTANCE;
    }

}
