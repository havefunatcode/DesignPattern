package inflearn.lecture.creatinoal_patterns.abstractfactory.after.ship;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship);
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }

}
