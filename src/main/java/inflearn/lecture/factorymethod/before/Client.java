package inflearn.lecture.factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "whiteShip@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "blackShip@gmail.com");
        System.out.println(blackShip);
    }

}
