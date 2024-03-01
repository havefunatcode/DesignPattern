package inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts;

import inflearn.lecture.creatinoal_patterns.abstractfactory.after.ship.Ship;

public class WhiteShip extends Ship {
    public WhiteShip() {
        setName("WhiteShip");
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }
}
