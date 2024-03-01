package inflearn.lecture.creatinoal_patterns.factorymethod.after;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }

}
