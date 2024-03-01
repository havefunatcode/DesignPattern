package inflearn.lecture.abstractfactory.after.parts;

import inflearn.lecture.abstractfactory.after.parts.Anchor;
import inflearn.lecture.abstractfactory.after.parts.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();
    Wheel createWheel();

}
