package inflearn.lecture.creatinoal_patterns.abstractfactory.after.ship;

import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.ShipPartsFactory;
import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
