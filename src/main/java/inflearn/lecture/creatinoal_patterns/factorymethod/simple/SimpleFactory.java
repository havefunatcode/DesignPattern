package inflearn.lecture.creatinoal_patterns.factorymethod.simple;

import inflearn.lecture.creatinoal_patterns.factorymethod.after.BlackShip;
import inflearn.lecture.creatinoal_patterns.factorymethod.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("WhiteShip")) {
            return new WhiteShip();
        } else if (name.equals("BlackShip")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }

}
