package inflearn.lecture.creatinoal_patterns.factorymethod.after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }

}
