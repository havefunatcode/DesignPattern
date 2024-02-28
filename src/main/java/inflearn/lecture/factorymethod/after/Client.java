package inflearn.lecture.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "whiteship@gmail.com");
        client.print(new BlackShipFactory(), "BlackShip", "blackship@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
