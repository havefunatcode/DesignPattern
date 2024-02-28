package inflearn.lecture.factorymethod.simple;

import inflearn.lecture.factorymethod.after.BlackShip;
import inflearn.lecture.factorymethod.after.WhiteShip;

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
