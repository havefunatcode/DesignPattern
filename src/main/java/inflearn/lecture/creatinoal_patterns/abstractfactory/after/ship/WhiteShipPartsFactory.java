package inflearn.lecture.creatinoal_patterns.abstractfactory.after.ship;

import inflearn.lecture.abstractfactory.after.parts.*;
import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.*;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
