package inflearn.lecture.abstractfactory.before;

import inflearn.lecture.abstractfactory.after.parts.WhiteShip;
import inflearn.lecture.abstractfactory.after.ship.Ship;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
