package inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.pro;

import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.Anchor;
import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.ShipPartsFactory;
import inflearn.lecture.creatinoal_patterns.abstractfactory.after.parts.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
