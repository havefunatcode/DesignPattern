package inflearn.lecture.singleton;

import java.util.Set;

public class Settings {
    private static Settings INSTANCE;

    public static Settings getInstance() {
        if (INSTANCE == null) {
            return new Settings();
        }
        return INSTANCE;
    }

    private Settings() {

    }

}
